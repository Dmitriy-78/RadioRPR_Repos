package ru.radiorpr.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.radiorpr.service.models.User;

import java.util.List;

public interface UsersRepository extends JpaRepository<User,Long> {
    List<User> findAllByUserName(String userName);
}
