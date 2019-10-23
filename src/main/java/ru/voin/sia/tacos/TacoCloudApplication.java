package ru.voin.sia.tacos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import ru.voin.sia.tacos.entity.User;
import ru.voin.sia.tacos.repo.UserRepository;

@SpringBootApplication
public class TacoCloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args);
    }
    @Bean
    public CommandLineRunner dataLoader(UserRepository repo, PasswordEncoder encoder) {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                repo.save(new User("q",encoder.encode("qq"),"qqq","","city","state","122332","1232424"));
            }
        };
    }

}
