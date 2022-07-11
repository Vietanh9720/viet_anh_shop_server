package com.va.service;

import com.va.entity.Product;
import com.va.entity.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.Errors;


public interface ProductService {
    Page<Product> getAll(Pageable pageable);

    Product getProductById(Integer id);
    Product getProductByName(String name);

    Product createProduct(ProductDTO productDTO, Errors errors);

    Product updateProduct(Integer id, ProductDTO productDTO, Errors errors);

    void deleteProduct(Integer id);
}
