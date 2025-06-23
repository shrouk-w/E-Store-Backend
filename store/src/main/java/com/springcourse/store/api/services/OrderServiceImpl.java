package com.springcourse.store.api.services;

import com.springcourse.store.api.model.LocalUser;
import com.springcourse.store.api.model.WebOrder;
import com.springcourse.store.api.model.dao.WebOrderDAO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private WebOrderDAO webOrderDAO;


    public OrderServiceImpl(WebOrderDAO webOrderDAO) {
        this.webOrderDAO = webOrderDAO;
    }

    public List<WebOrder> getOrders(LocalUser user) {
        return webOrderDAO.findByUser(user);
    }


}
