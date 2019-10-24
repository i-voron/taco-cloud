package ru.voin.sia.tacos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.voin.sia.tacos.entity.User;
import ru.voin.sia.tacos.repo.IngredientRepository;
import ru.voin.sia.tacos.repo.UserRepository;

@Profile("!prod")
@Configuration
public class DevelopmentConfig {
    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo,
                                        UserRepository userRepo, PasswordEncoder encoder) { // user repo for ease of testing with a built-in user
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                //        load from data.sql
               /* repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
                repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
                repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
                repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
                repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
                repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
                repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
                repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
                repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
                repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));*/

                userRepo.save(new User("q", encoder.encode("qq"),
                        "Craig Walls", "123 North Street", "Cross Roads", "TX",
                        "76227", "123-123-1234"));
            }
        };
    }

}
