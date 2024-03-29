package ru.voin.sia.tacos;
import static org.mockito.Mockito.verify;
import static 
    org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static 
    org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import ru.voin.sia.tacos.controller.DesignTacoController;
import ru.voin.sia.tacos.enity.Taco;
import ru.voin.sia.tacos.enity.Ingredient;
import ru.voin.sia.tacos.enity.Ingredient.Type;

@RunWith(SpringRunner.class)
@WebMvcTest(DesignTacoController.class)
public class DesignTacoControllerTest {
  @Autowired
  private MockMvc mockMvc;
  private List<Ingredient> ingredients;
  private Taco design;

  @Before
  public void setup() {
    ingredients = Arrays.asList(
      new Ingredient(0l,"FLTO", "Flour Tortilla", Type.WRAP),
      new Ingredient(1l,"COTO", "Corn Tortilla", Type.WRAP),
      new Ingredient(2l,"GRBF", "Ground Beef", Type.PROTEIN),
      new Ingredient(3l,"CARN", "Carnitas", Type.PROTEIN),
      new Ingredient(4l,"TMTO", "Diced Tomatoes", Type.VEGGIES),
      new Ingredient(5l,"LETC", "Lettuce", Type.VEGGIES),
      new Ingredient(6l,"CHED", "Cheddar", Type.CHEESE),
      new Ingredient(7l,"JACK", "Monterrey Jack", Type.CHEESE),
      new Ingredient(8l,"SLSA", "Salsa", Type.SAUCE),
      new Ingredient(9l,"SRCR", "Sour Cream", Type.SAUCE)
    );

    design = new Taco();
    design.setName("Test Taco");
//    design.setIngredients(Arrays.asList("FLTO", "GRBF", "CHED"));
  }

  @Test
  public void testShowDesignForm() throws Exception {
    mockMvc.perform(get("/design"))
        .andExpect(status().isOk())
        .andExpect(view().name("design"))
        .andExpect(model().attribute("wrap", ingredients.subList(0, 2)))
        .andExpect(model().attribute("protein", ingredients.subList(2, 4)))
        .andExpect(model().attribute("veggies", ingredients.subList(4, 6)))
        .andExpect(model().attribute("cheese", ingredients.subList(6, 8)))
        .andExpect(model().attribute("sauce", ingredients.subList(8, 10)));
  }

  @Test
  public void processDesign() throws Exception {
    mockMvc.perform(post("/design")
        .content("name=Test+Taco&ingredients=FLTO,GRBF,CHED")
        .contentType(MediaType.APPLICATION_FORM_URLENCODED))
        .andExpect(status().is3xxRedirection())
        .andExpect(header().stringValues("Location", "/orders/current"));
  }
}
