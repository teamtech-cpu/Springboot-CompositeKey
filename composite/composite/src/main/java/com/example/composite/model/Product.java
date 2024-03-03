package com.example.composite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class Product {
    @OneToMany(mappedBy = "customer")
    private Set<ProductRating> productRatings;

    public Product() {

    }

    public Product(Set<ProductRating> productRatings) {
        this.productRatings = productRatings;
    }

    public Set<ProductRating> getProductRatings() {
        return productRatings;
    }

    public void setProductRatings(Set<ProductRating> productRatings) {
        this.productRatings = productRatings;
    }
}
