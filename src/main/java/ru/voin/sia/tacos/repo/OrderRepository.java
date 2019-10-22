package ru.voin.sia.tacos.repo;


import org.springframework.data.repository.CrudRepository;
import ru.voin.sia.tacos.entity.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
