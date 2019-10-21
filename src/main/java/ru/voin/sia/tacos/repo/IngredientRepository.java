package ru.voin.sia.tacos.repo;

import ru.voin.sia.tacos.enity.Ingredient;

public interface IngredientRepository {
  Iterable<Ingredient> findAll();
  Ingredient findById(Long id);
  Ingredient findByCode(String Code);
  Ingredient save(Ingredient ingredient);
}
