package ru.voin.sia.tacos.repo;


import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import ru.voin.sia.tacos.entity.Order;
import ru.voin.sia.tacos.entity.User;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {
    List<Order> findByUserOrderByPlacedAtDesc(User user, Pageable pageable);
}
