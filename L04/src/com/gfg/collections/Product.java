package com.gfg.collections;

import java.util.Objects;

public class Product implements Comparable{

    private String name;

    private Double cost;

    private Integer rating;

    public Product(String name, Double cost, Integer rating) {
        this.name = name;
        this.cost = cost;
        this.rating = rating;
    }

    public Double getCost() {
        return cost;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        //return (int)(this.cost - ((Product)o).cost);
        return cost.compareTo(((Product)o).getCost());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return  Objects.equals(name, product.name)
                && Objects.equals(cost, product.cost)
                && Objects.equals(rating, product.rating);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, rating);
    }
}
