package ru.voin.sia.tacos.repo;


import ru.voin.sia.tacos.enity.Order;

public interface OrderRepository {

  Order save(Order order);
  
}
