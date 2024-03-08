package com.example.vonguyenthanhtu_orderspringboot_week2.repositories;

import com.example.vonguyenthanhtu_orderspringboot_week2.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
