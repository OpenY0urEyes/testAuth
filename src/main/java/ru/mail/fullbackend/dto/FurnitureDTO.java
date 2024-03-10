package ru.mail.fullbackend.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import ru.mail.fullbackend.models.Materials;

@Data
public class FurnitureDTO {
    private Long id;
    private String name;
    private int widthInMm;
    private int heightInMm;
    private int lengthInMm;
    private MaterialsDTO materialsDTO;

    public FurnitureDTO(Long id, String name, int widthInMm, int heightInMm, int lengthInMm, MaterialsDTO materialsDTO) {
        this.id = id;
        this.name = name;
        this.widthInMm = widthInMm;
        this.heightInMm = heightInMm;
        this.lengthInMm = lengthInMm;
        this.materialsDTO = materialsDTO;
    }
}
