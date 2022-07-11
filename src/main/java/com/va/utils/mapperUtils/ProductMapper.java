package com.va.utils.mapperUtils;

import com.va.entity.Product;
import com.va.entity.dto.ProductDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper extends GenericMapper<ProductDTO, Product>{
}
