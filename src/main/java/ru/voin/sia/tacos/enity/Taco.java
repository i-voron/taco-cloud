package ru.voin.sia.tacos.enity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class Taco extends BaseEntity{
    @NotNull
    @Size(min=2, message="Name must be at least 2 characters long")
    private String name;
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
    private Date createdAt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}