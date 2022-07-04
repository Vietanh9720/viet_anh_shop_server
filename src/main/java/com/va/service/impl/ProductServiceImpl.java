package com.va.service.impl;

import com.va.common.BusinessException;
import com.va.common.HttpStatusConstants;
import com.va.common.ValidationException;
import com.va.entity.Product;
import com.va.entity.dto.ProductDTO;
import com.va.repository.ProductRepository;
import com.va.service.ProductService;
import com.va.utils.mapperUtils.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private ProductMapper productMapper;

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
    public Product getProductByName(String name) {
        return productRepo.findByProductName(name);

    }

    @Override
    public Product createProduct(ProductDTO productDTO, Errors errors) {
        ValidationException.VALIDATE(errors);
        Product product0 = getProductByName(productDTO.getProductName());
        if(product0 != null) {
            throw new BusinessException(HttpStatusConstants.PRODUCT_EXISTS_CODE,HttpStatusConstants.PRODUCT_EXISTS_MESSAGE);
        }
        try {
            Product product = productMapper.toEntity(productDTO);
            productRepo.save(product);
            return product;
        }catch(Exception e){
            throw new BusinessException(HttpStatusConstants.CREATE_PRODUCT_FAILURE_CODE,HttpStatusConstants.CREATE_PRODUCT_FAILURE_MESSAGE);
        }
    }

    @Override
    public Product updateProduct(Integer id, ProductDTO productDTO, Errors errors) {
        ValidationException.VALIDATE(errors);
        Product product = productRepo.findById(id)
                .orElseThrow(() -> new BusinessException(HttpStatusConstants.GET_ALL_PRODUCT_FAILURE_CODE, HttpStatusConstants.GET_ALL_PRODUCT_FAILURE_MESSAGE));
        try {
            product.setProductName(productDTO.getProductName());
            product.setCost(productDTO.getCost());
            product.setDescription(productDTO.getDescription());
            product.setInsurance(productDTO.getInsurance());
            product.setProductUrl(productDTO.getProductUrl());
            Product product0 = getProductByName(product.getProductName());
            if(product0 != null){
                throw new BusinessException(HttpStatusConstants.PRODUCT_EXISTS_CODE,HttpStatusConstants.PRODUCT_EXISTS_MESSAGE);
            }
            productRepo.save(product);
            return product;
        }catch(Exception e){
            throw new BusinessException(HttpStatusConstants.UPDATE_PRODUCT_FAILURE_CODE,HttpStatusConstants.UPDATE_PRODUCT_FAILURE_MESSAGE);
        }
    }

    @Override
    public void deleteProduct(Integer id) {
        try{
            productRepo.deleteById(id);
        }catch(Exception e){
            throw new BusinessException(HttpStatusConstants.DELETE_PRODUCT_FAILURE_CODE,HttpStatusConstants.DELETE_PRODUCT_FAILURE_MESSAGE);
        }
    }
}
