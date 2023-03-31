package com.bilgeadam.controller;

import com.bilgeadam.repository.entity.Product;
import com.bilgeadam.service.ProductService;
import org.springframework.web.bind.annotation.*;
import static com.bilgeadam.constants.EndPointList.*;
import java.util.List;

@RestController
@RequestMapping(PRODUCT)
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping(SAVE)
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping(FIND_ALL)
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
