package com.example.composite.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductRating {
    @EmbeddedId
    private ProductRatingKey id;

    @ManyToOne
    @MapsId("product_Id")
    @JoinColumn(name = "product_Id")
    private Product product;

    @ManyToOne
    @MapsId("customer_Id")
    @JoinColumn(name = "customer_Id")
    private Customer customer;

    private Integer rating;

}
