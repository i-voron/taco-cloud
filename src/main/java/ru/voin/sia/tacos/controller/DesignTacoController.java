package ru.voin.sia.tacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import ru.voin.sia.tacos.entity.Order;
import ru.voin.sia.tacos.entity.Taco;
import ru.voin.sia.tacos.entity.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ru.voin.sia.tacos.entity.Ingredient.Type;
import ru.voin.sia.tacos.repo.IngredientRepository;
import ru.voin.sia.tacos.repo.TacoRepository;

import javax.validation.Valid;

@Controller
@RequestMapping("/design")
@SessionAttributes("order")
public class DesignTacoController {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(DesignTacoController.class);

    private final IngredientRepository ingredientRepo;
    private final TacoRepository designRepo;

    @Autowired
    public DesignTacoController(IngredientRepository ingredientRepo, TacoRepository designRepo) {
        this.ingredientRepo = ingredientRepo;
        this.designRepo = designRepo;
    }

    @ModelAttribute(name = "order")
    public Order order() {
        return new Order();
    }
    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        List<Ingredient> ingredients = new ArrayList<>();
       /*02 ingredients = Arrays.asList(
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
        );*/

        ingredientRepo.findAll().forEach(i -> ingredients.add(i));

        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType(ingredients, type));
        }
    }

    @GetMapping
    public String showDesignForm(Model model) {
//02        model.addAttribute("designTaco", new Taco());
        return "design";
    }

    @PostMapping
//02    public String processDesign(@Valid @ModelAttribute("designTaco") Taco design, Errors errors, Model model) {
    public String processDesign(@Valid Taco taco, Errors errors, @ModelAttribute Order order,Model model) {
        if (errors.hasErrors()) {
            return "design";
        }

        Taco saved = designRepo.save(taco);
        order.addDesign(saved);

        log.info("Processing design: " + taco);

        return "redirect:/orders/current";
    }

    private List<Ingredient> filterByType(
            List<Ingredient> ingredients, Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type.toString()))
                .collect(Collectors.toList());
    }

}
