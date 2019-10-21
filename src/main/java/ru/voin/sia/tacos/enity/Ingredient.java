package ru.voin.sia.tacos.enity;

public class Ingredient extends BaseEntity {
    private String code;
    private String name;
    private Type type;


    public Ingredient(Long id,String code, String name, Type type) {
        super(id);
        this.code = code;
        this.name = name;
        this.type = type;
    }

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

    public String getName() {
        return name;
    }

    public Type getType() {
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

    public void setType(Type type) {
        this.type = type;
    }
}