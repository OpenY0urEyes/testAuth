package ru.mail.fullbackend.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mail.fullbackend.models.Furniture;
import ru.mail.fullbackend.repository.FurnitureRepository;
import ru.mail.fullbackend.repository.MaterialsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class RandomValueDatabase {

    private List<String> nameing;

    private final FurnitureRepository furnitureRepository;
    private final MaterialsRepository materialsRepository;

    public void randValue(){
        Random random = new Random();
        nameing.add("Диван");
        nameing.add("Кровать");
        nameing.add("Стол");
        nameing.add("Стул");
        nameing.add("Кресло");
        for (int i = 0; i < 50; i ++){
            Furniture furniture = new Furniture();
            furniture.setName(nameing.get(random.nextInt(nameing.size())));
            furniture.setMaterials(materialsRepository.findById(random.nextLong(4)).orElse(null));
            furniture.setHeightInMm(random.nextInt(300));
            furniture.setLengthInMm(random.nextInt(300));
            furniture.setWidthInMm(random.nextInt(300));
            furnitureRepository.save(furniture);
        }
    }

}
