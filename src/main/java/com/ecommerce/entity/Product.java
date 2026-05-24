package com.ecommerce.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID product_id;

    private String product_name;
    private String description;
    private double price;
    private int stock_quantity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
