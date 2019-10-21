package ru.voin.sia.tacos.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ru.voin.sia.tacos.entity.Ingredient;

@Repository
public class JdbcIngredientRepository implements IJdbcIngredientRepository {
    private JdbcTemplate jdbc;

    @Autowired
    public JdbcIngredientRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public Iterable<Ingredient> findAll() {
        return jdbc.query("select id,code, name, type from Ingredient", this::mapRowToIngredient);
    }

    @Override
    public Ingredient findById(Long id) {
        return jdbc.queryForObject("select id,code, name, type from Ingredient where id=?",
                this::mapRowToIngredient, id);
    }

    @Override
    public Ingredient findByCode(String code) {
        return jdbc.queryForObject("select id, code, name, type from Ingredient where code=?",
                this::mapRowToIngredient, code);
    }
  /*
  @Override
  public Ingredient findOne(String id) {
    return jdbc.queryForObject(
        "select id, name, type from Ingredient where id=?",
        new RowMapper<Ingredient>() {
          public Ingredient mapRow(ResultSet rs, int rowNum) 
              throws SQLException {
            return new Ingredient(
                rs.getString("id"), 
                rs.getString("name"),
                Ingredient.Type.valueOf(rs.getString("type")));
          };
        }, id);
  }
   */

    @Override
    public Ingredient save(Ingredient ingredient) {
        jdbc.update(
                "insert into Ingredient (id, code,name, type) values (?, ?, ?, ?)",
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getType().toString());
        return ingredient;
    }

    private Ingredient mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException {
        return new Ingredient(
                rs.getLong("id"),
                rs.getString("code"),
                rs.getString("name"),
                Ingredient.Type.valueOf(rs.getString("type")));
    }
}
