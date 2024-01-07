package dev.lebenkov.productservice.service;

import dev.lebenkov.productservice.dto.ProductRequest;
import dev.lebenkov.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    void createProduct(ProductRequest productRequest);
    List<ProductResponse> fetchAllProducts();
}
