package com.springcourse.store.api.services;

import com.springcourse.store.api.model.LocalUser;
import com.springcourse.store.api.model.Product;
import com.springcourse.store.api.model.dao.ProductDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductDAO productDAO;

    public ProductServiceImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    public List<Product> getProducts() {
        return productDAO.findAll();
    }
}
