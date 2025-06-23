package com.springcourse.store.api.model.dao;

import com.springcourse.store.api.model.Product;
import org.springframework.data.repository.ListCrudRepository;

public interface ProductDAO extends ListCrudRepository<Product, Long> {
}
