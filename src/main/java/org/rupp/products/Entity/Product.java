package org.rupp.products.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price_per_unit;
    private boolean active_for_sell;

    public Product(String name, double price_per_unit, boolean active_for_sell) {
        this.name = name;
        this.price_per_unit = price_per_unit;
        this.active_for_sell = active_for_sell;
    }
}
