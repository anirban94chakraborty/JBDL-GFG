package com.example.L08_restful_services_demo.controller;

import com.example.L08_restful_services_demo.AppResponse;
import com.example.L08_restful_services_demo.entity.Product;
import com.example.L08_restful_services_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        if(id < 1) {
            return ResponseEntity.badRequest().build();
        }

        Product product = productService.getById(id);
        if(product == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(product);
    }

    @PostMapping()
    public ResponseEntity<Product> createProduct(@RequestBody Product product) { //throws URISyntaxException
        product = productService.create(product);
        /*
         For returning URI in the Location response header (For return type 'ResponseEntity<Void>'):
            URI uri = new URI("http://localhost:8080/product/" + product.getId());
            return ResponseEntity.created(uri).build();
        */
        return ResponseEntity.ok(product);
    }

    // Response of this method is not REST compliant as it uses custom error codes
    @PostMapping("/add")
    public ResponseEntity<AppResponse<Product>> createProductCustomMethod(@RequestBody Product product) {
        product = productService.create(product);
        AppResponse<Product> appResponse = new AppResponse<>();
        appResponse.setResponse(product);
        appResponse.setErrorMessage("Some Error");
        appResponse.setErrorCode(2132);
        return ResponseEntity.ok(appResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product product) {
        Product updatedProduct = productService.update(id, product);
        if(updatedProduct == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Product> deleteProduct(@PathVariable Long id) {
        Product deletedProduct = productService.delete(id);
        if(deletedProduct == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedProduct);
    }

}
