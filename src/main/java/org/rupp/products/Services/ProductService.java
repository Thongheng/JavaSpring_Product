package org.rupp.products.Services;

import org.rupp.products.Entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProduct();
    Product getProductById(int id);
    void addNewProduct(Product product);
    void updateProduct(Product product);
}
