package ru.voin.sia.tacos.repo;


import org.springframework.data.repository.CrudRepository;
import ru.voin.sia.tacos.entity.Taco;

import java.util.UUID;

public interface TacoRepository  extends CrudRepository<Taco, Long> {

}
