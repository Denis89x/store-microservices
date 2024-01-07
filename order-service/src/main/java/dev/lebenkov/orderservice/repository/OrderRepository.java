package dev.lebenkov.orderservice.repository;

import dev.lebenkov.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
