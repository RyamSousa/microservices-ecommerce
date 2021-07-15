package com.microservices.shoppingcart.shoppingcart.repository;

import com.microservices.shoppingcart.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
