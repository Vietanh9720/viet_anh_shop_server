package com.va.controller;

import com.va.common.ProjectResponse;
import com.va.entity.dto.ProductDTO;
import com.va.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping(value = "api/v1/products")
@CrossOrigin("*")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ProjectResponse<?> getAll(Pageable pageable) {
        log.info("=> GET ALL PRODUCT");
        return ProjectResponse.ok(productService.getAll(pageable));
    }

    @GetMapping(value = "/{id}")
    public ProjectResponse<?> getProductById(@PathVariable(name = "id") Integer id) {
        log.info("=> GET PRODUCT BY ID");
        return ProjectResponse.ok(productService.getProductById(id));
    }

    @PostMapping
    public ProjectResponse<?> createProduct(@Valid @RequestBody() ProductDTO productDTO, Errors errors) {
        return ProjectResponse.ok(productService.createProduct(productDTO, errors));
    }

    @PutMapping
    public ProjectResponse<?> updateProduct(@Valid @RequestParam(name = "id") Integer id, @RequestBody() ProductDTO productDTO, Errors errors) {
        return ProjectResponse.ok(productService.updateProduct(id, productDTO, errors));
    }

    @DeleteMapping
    public ProjectResponse<?> deleteProduct(@Valid @RequestParam(name = "productId") Integer id) {
        productService.deleteProduct(id);
        return ProjectResponse.ok(true);
    }

}
