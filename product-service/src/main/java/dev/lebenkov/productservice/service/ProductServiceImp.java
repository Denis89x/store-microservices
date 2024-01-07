package dev.lebenkov.productservice.service;

import dev.lebenkov.productservice.dto.ProductRequest;
import dev.lebenkov.productservice.dto.ProductResponse;
import dev.lebenkov.productservice.model.Product;
import dev.lebenkov.productservice.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ProductServiceImp implements ProductService {

    ProductRepository productRepository;
    ModelMapper modelMapper;

    @Override
    public void createProduct(ProductRequest productRequest) {
        productRepository.save(convertToProduct(productRequest));
        log.info("Product {} is saved!", convertToProduct(productRequest).getId());
    }

    @Override
    public List<ProductResponse> fetchAllProducts() {
        return productRepository.findAll().stream().map(this::convertToProductResponse).toList();
    }

    private Product convertToProduct(ProductRequest productRequest) {
        return modelMapper.map(productRequest, Product.class);
    }

    private ProductResponse convertToProductResponse(Product product) {
        return modelMapper.map(product, ProductResponse.class);
    }
}
