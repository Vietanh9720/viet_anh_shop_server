package com.va.entity.dto;

import lombok.*;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO implements Serializable {
    @NotBlank(message = "Điền vào tên sản phẩm")
    @NotEmpty(message = "Điền vào tên sản phẩm")
    @NotNull(message = "Điền vào tên sản phẩm")
    String productName;

    @NotNull(message = "Điền vào giá của sản phẩm")
    @Min(value = 0, message = "Giá sản phẩm phải lớn hơn 0")
    BigInteger cost;

    @NotNull(message = "Điền vào thời gian bảo hành sản phẩm")
    @Min(value = 0, message = "Thời gian bảo hành phải lớn hơn 1 tháng")
    Integer insurance;

    @NotBlank(message = "Điền vào mô tả của sản phẩm")
    @NotEmpty(message = "Điền vào mô tả của sản phẩm")
    @NotNull(message = "Điền vào mô tả của sản phẩm")
    String description;

    String productUrl;

}
