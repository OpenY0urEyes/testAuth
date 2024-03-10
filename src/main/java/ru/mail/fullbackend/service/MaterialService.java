package ru.mail.fullbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mail.fullbackend.dto.MaterialsDTO;
import ru.mail.fullbackend.models.Materials;
import ru.mail.fullbackend.repository.MaterialsRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class MaterialService {

    private final MaterialsRepository materialsRepository;

    public List<MaterialsDTO>  allMaterials(){
        List<Materials> materials = materialsRepository.findAll();
        return materials.stream().map(this::convertToDTO).collect(Collectors.toList());
    }


    public MaterialsDTO convertToDTO(Materials materials){
        MaterialsDTO materialsDTO = new MaterialsDTO(
                materials.getId(),
                materials.getName()
        );
        return materialsDTO;
    }

}
