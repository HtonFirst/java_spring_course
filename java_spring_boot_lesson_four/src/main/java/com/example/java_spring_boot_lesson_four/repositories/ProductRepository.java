package com.example.java_spring_boot_lesson_four.repositories;

import com.example.java_spring_boot_lesson_four.entities.Product;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Repository
public class ProductRepository {

    private static AtomicLong identity = new AtomicLong(0);

    private final Map<Long, Product> identityMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        add(new Product(null, "Ipad", "Good, by very expensive", new BigDecimal(60000)));
        add(new Product(null, "Realme Pad", "Average price", new BigDecimal(30000)));
        add(new Product(null, "Lenovo P90Pro", "Good, and very chip", new BigDecimal(16000)));
    }

    public void add(Product product) {
        product.setId(identity.incrementAndGet());
        identityMap.put(product.getId(), product);
    }

    public void update(Product product) {
        identityMap.put(product.getId(), product);

    }

    public void remove(Long id) {

        identityMap.remove(id);

    }

    public Product findById(Long id) {
        return identityMap.get(id);
    }

    public List<Product> findAll() {
        return new ArrayList<>(identityMap.values());
    }

}
