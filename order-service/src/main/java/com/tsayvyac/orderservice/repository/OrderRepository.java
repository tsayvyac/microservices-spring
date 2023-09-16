package com.tsayvyac.orderservice.repository;

import com.tsayvyac.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
