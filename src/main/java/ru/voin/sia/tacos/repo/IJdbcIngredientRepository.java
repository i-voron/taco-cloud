package ru.voin.sia.tacos.repo;

import ru.voin.sia.tacos.entity.Ingredient;

public interface IJdbcIngredientRepository {
  Iterable<Ingredient> findAll();
  Ingredient findById(Long id);
  Ingredient findByCode(String Code);
  Ingredient save(Ingredient ingredient);
}
