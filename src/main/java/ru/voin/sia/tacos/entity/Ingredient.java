package ru.voin.sia.tacos.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Ingredient", schema = "test")
public class Ingredient extends BaseEntity {
    private String code;
    private String name;
    private String type;

    public Ingredient(Long id,String code, String name, String type) {
        setId(id);
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public Ingredient() {
    }

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
}