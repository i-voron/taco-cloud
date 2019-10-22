package ru.voin.sia.tacos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(schema = "test")
public class Ingredient extends BaseEntity {
    @Column(length = 4)
    private String code;
    @Column(length = 25)
    private String name;
    @Column(length = 10)
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