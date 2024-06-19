package org.rupp.products.Dao;

import org.rupp.products.Entity.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProduct();
    Product getProductById(int id);
    void addNewProduct(Product product);
    void updateProduct(Product product);

}
