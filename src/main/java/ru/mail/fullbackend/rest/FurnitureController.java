package ru.mail.fullbackend.rest;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.mail.fullbackend.dto.FurnitureDTO;
import ru.mail.fullbackend.service.AuthorizationService;
import ru.mail.fullbackend.service.FurnitureService;
import ru.mail.fullbackend.service.RandomValueDatabase;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/furniture")
@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
public class FurnitureController {

    private final FurnitureService furnitureService;
    public final RandomValueDatabase randomValueDatabase;
    public final AuthorizationService authorizationService;

    @GetMapping
    public List<FurnitureDTO> viewAllFurniture(){
        return furnitureService.allFurniture();
    }

    @GetMapping("/{username}/{password}/rand")
    public String randValue(@PathVariable String username, @PathVariable String password){
        if (authorizationService.auth(username, password)){
            randomValueDatabase.randValue();
            return "Готово";
        }
        return "Не вошел";
    }
}
