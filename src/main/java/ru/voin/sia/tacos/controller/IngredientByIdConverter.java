package ru.voin.sia.tacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.voin.sia.tacos.entity.Ingredient;
import ru.voin.sia.tacos.repo.IJdbcIngredientRepository;
import ru.voin.sia.tacos.repo.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IJdbcIngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IJdbcIngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String id) {
        return ingredientRepo.findById(Long.valueOf(id));
    }

}
