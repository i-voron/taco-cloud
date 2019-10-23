package ru.voin.sia.tacos.repo;

import org.springframework.data.repository.CrudRepository;
import ru.voin.sia.tacos.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
