package com.example.L09_JDBC_demo.dao;

import com.example.L09_JDBC_demo.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.concurrent.ExecutionException;

@Repository
public class ProductDAOWithDB implements ProductDAOInterface {

    private static Logger LOGGER = LoggerFactory.getLogger(ProductDAOWithDB.class);

    @Value("${db.url}")
    private String dbUrl;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Override
    public Product getById(Long id) {
        Connection con = null;
        Product product = null;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);
            String sqlQuery = "SELECT id, name, cost FROM product WHERE id=" + id + ";";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()) {
                product = new Product(resultSet.getLong("id"),
                                      resultSet.getString("name"),
                                      resultSet.getDouble("cost"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return product;
    }

    @Override
    public Product create(Product product) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);

            // Using Non-Parameterized SQL Query for creating a new record
            // String sqlInsert = "INSERT INTO product VALUES (null, '" + product.getName() + "', " + product.getCost() + ");" ;
            // Statement statement = con.createStatement();
            // int affectedRow = statement.executeUpdate(sqlInsert, Statement.RETURN_GENERATED_KEYS);

            // Using Parameterized SQL Query for creating a new record
            String sqlInsert = "INSERT INTO product VALUES (null, ?, ?);";
            PreparedStatement statement = con.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, product.getName());
            statement.setDouble(2, product.getCost());
            int affectedRow = statement.executeUpdate();

            // Throw exception is record is not created in DB
            if(affectedRow == 0) {
                throw new SQLException("Creation Failed");
            }

            // Set DB created product ID in the response object
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if(generatedKeys.next()) {
                product.setId(generatedKeys.getLong(1));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return product;
    }

    @Override
    public Product update(Long id, Product product) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);
            String sqlUpdate = "UPDATE product SET name=?, cost=? WHERE id=?;";
            PreparedStatement preparedStatement = con.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getCost());
            preparedStatement.setLong(3, id);
            int affectedRow = preparedStatement.executeUpdate();

            // Throw exception is record is not updated in DB
            if(affectedRow == 0) {
                throw new SQLException("Update Failed");
            }
            // Set product ID
            product.setId(id);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return product;
    }

    @Override
    public Product delete(Long id) {
        Connection con = null;
        Product product = null;
        try {
            con = DriverManager.getConnection(dbUrl, username, password);

            // Fetch record to be deleted from DB
            String sqlQuery = "SELECT name, cost FROM product WHERE id=?;";
            PreparedStatement statement = con.prepareStatement(sqlQuery);
            statement.setLong(1, id);

            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                product = new Product();
                product.setId(id);
                product.setName(resultSet.getString("name"));
                product.setCost(resultSet.getDouble("cost"));
            }

            // If no matching product is found
            if(product == null) {
                return null;
            }

            // Delete record from DB
            String sqlDeleteQuery = "DELETE FROM product WHERE id=?;";
            PreparedStatement preparedStatement = con.prepareStatement(sqlDeleteQuery);
            preparedStatement.setLong(1, id);
            int affectedRow = preparedStatement.executeUpdate();

            // Throw exception is record is not created in DB
            if(affectedRow == 0) {
                throw new SQLException("Delete Failed");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return product;
    }
}
