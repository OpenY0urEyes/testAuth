package ru.mail.fullbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mail.fullbackend.repository.UserRepository;

@Service
@AllArgsConstructor
public class AuthorizationService {

    private final UserRepository userRepository;


    public Boolean auth(String username, String password){
        return userRepository.existsByUsernameAndPassword(username, password);
    }
}
