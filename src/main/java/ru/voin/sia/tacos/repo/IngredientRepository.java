package ru.voin.sia.tacos.repo;

import org.springframework.data.repository.CrudRepository;
import ru.voin.sia.tacos.entity.Ingredient;

import java.util.UUID;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}

