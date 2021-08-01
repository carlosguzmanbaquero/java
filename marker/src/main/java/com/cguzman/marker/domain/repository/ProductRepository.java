package com.cguzman.marker.domain.repository;

import com.cguzman.marker.domain.Product;
import com.cguzman.marker.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
    Optional<List<Product>> getProductosPorCategoria(int categoryId);
}
