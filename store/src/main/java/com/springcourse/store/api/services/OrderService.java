package com.springcourse.store.api.services;

import com.springcourse.store.api.model.LocalUser;
import com.springcourse.store.api.model.WebOrder;

import java.util.List;

public interface OrderService {

    public List<WebOrder> getOrders(LocalUser user);

}
