package com.va.controller;

import com.va.common.ProjectResponse;
import com.va.entity.dto.ProductDTO;
import com.va.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "api/v1/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public ProjectResponse<?> getAll(Pageable pageable) {
        log.info("=> GET ALL PRODUCT");
        return ProjectResponse.ok(productService.getAll(pageable));
    }

    @GetMapping
    public ProjectResponse<?> getProductById(@RequestParam(name = "id") Integer id) {
        log.info("=> GET PRODUCT BY ID");
        return ProjectResponse.ok(productService.getProductById(id));
    }

    @PostMapping
    public ProjectResponse<?> createProduct(@RequestBody() ProductDTO productDTO) {

        return null;
    }

}
