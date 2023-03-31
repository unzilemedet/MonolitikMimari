package com.bilgeadam.service;

import com.bilgeadam.repository.IProductRepository;
import com.bilgeadam.repository.entity.Product;
import com.bilgeadam.utility.ServiceManager;

import java.util.List;

public class ProductService extends ServiceManager <Product,Long> {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        super(productRepository);
        this.productRepository = productRepository;
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
