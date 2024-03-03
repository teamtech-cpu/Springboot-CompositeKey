package com.example.composite.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Embeddable
public class ProductRatingKey {

    @Column(name = "product_id")
    private Long ProductId;

    @Column(name = "customer_id")
    private Long CustomerId;
}
