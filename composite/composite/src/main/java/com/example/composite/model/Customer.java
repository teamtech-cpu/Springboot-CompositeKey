package com.example.composite.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Customer {
    @OneToMany(mappedBy = "customer")
    private Set<ProductRating> productRatingSet;


}
