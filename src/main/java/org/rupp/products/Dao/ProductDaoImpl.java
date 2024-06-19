package org.rupp.products.Dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.rupp.products.Entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao{

    private final EntityManager entityManager;

    public ProductDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Product> getProduct() {
        TypedQuery<Product> query = entityManager.createQuery("FROM Product p", Product.class);
        return query.getResultList();
    }

    @Override
    public Product getProductById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public void addNewProduct(Product product) {
        entityManager.persist(product);
    }

    @Override
    public void updateProduct(Product product) {
        entityManager.merge(product);
    }
}
