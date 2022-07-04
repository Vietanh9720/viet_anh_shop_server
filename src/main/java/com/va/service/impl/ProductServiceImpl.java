package com.va.service.impl;

import com.va.common.BusinessException;
import com.va.common.HttpStatusConstants;
import com.va.entity.Product;
import com.va.entity.dto.ProductDTO;
import com.va.repository.ProductRepository;
import com.va.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;

    @Override
    public Page<Product> getAll(Pageable pageable) {
        try {
            return productRepo.findAll(pageable);
        } catch (Exception e) {
            throw new BusinessException(HttpStatusConstants.GET_ALL_PRODUCT_FAILURE_CODE, HttpStatusConstants.GET_ALL_PRODUCT_FAILURE_MESSAGE);
        }
    }

    @Override
    public Product getProductById(Integer id) {
        return productRepo.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatusConstants.GET_ALL_PRODUCT_FAILURE_CODE, HttpStatusConstants.GET_ALL_PRODUCT_FAILURE_MESSAGE));
    }

    @Override
    public Product createProduct(ProductDTO productDTO) {
        return null;
    }
}
