package com.va.service;

import com.va.entity.Product;
import com.va.entity.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {
    Page<Product> getAll(Pageable pageable);

    Product getProductById(Integer id);

    Product createProduct(ProductDTO productDTO);

}
