package com.example.demo.repository;

import com.example.demo.entity.TOrder;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface OrderRepository extends PagingAndSortingRepository<TOrder, Long> {

    TOrder findByOrderId(Long orderId);

}