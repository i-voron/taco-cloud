package ru.voin.sia.tacos.repo;

import org.springframework.data.repository.CrudRepository;
import ru.voin.sia.tacos.entity.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}

