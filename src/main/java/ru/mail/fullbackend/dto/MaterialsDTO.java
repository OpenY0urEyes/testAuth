package ru.mail.fullbackend.dto;

import jakarta.persistence.*;
import lombok.Data;
import ru.mail.fullbackend.models.Furniture;

@Data
public class MaterialsDTO {
    private Long id;
    private String name;

    public MaterialsDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
