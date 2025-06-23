package com.springcourse.store.api.model.dao;

import com.springcourse.store.api.model.LocalUser;
import com.springcourse.store.api.model.WebOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface WebOrderDAO extends ListCrudRepository<WebOrder, Long> {
    List<WebOrder> findByUser(LocalUser user);
}
