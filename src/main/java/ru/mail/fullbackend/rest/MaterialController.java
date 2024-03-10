package ru.mail.fullbackend.rest;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.mail.fullbackend.dto.MaterialsDTO;
import ru.mail.fullbackend.service.MaterialService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/materials")
public class MaterialController {
    private final MaterialService materialService;


    @GetMapping
    public List<MaterialsDTO> viewAllMaterials(){
        return materialService.allMaterials();
    }
}
