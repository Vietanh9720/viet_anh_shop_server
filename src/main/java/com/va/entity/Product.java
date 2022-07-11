package com.va.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "product_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer productId;

    @Column(name = "product_name")
    String productName;

    @Column(name = "cost")
    BigInteger cost;

    @Column(name = "insurance")
    Integer insurance;

    @Column(name = "description")
    String description;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "product_url")
    String productUrl;

    public Product(String productName, BigInteger cost, Integer insurance, String description, Integer quantity, String productUrl) {
        this.productName = productName;
        this.cost = cost;
        this.insurance = insurance;
        this.description = description;
        this.quantity = quantity;
        this.productUrl = productUrl;
    }
}
