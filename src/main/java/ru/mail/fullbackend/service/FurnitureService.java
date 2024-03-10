package ru.mail.fullbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mail.fullbackend.dto.FurnitureDTO;
import ru.mail.fullbackend.dto.MaterialsDTO;
import ru.mail.fullbackend.models.Furniture;
import ru.mail.fullbackend.repository.FurnitureRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FurnitureService {


    private final FurnitureRepository furnitureRepository;

    public List<FurnitureDTO> allFurniture(){
        List<Furniture> furnitures = furnitureRepository.findAll();
        return furnitures.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public FurnitureDTO convertToDTO(Furniture furniture){
        MaterialsDTO materialsDTO = new MaterialsDTO(
                furniture.getMaterials().getId(),
                furniture.getMaterials().getName()
        );

        FurnitureDTO furnitureDTO = new FurnitureDTO(
                furniture.getId(),
                furniture.getName(),
                furniture.getWidthInMm(),
                furniture.getHeightInMm(),
                furniture.getLengthInMm(),
                materialsDTO
                );
        return furnitureDTO;
    }
}
