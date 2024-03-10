package ru.mail.fullbackend.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int widthInMm;

    private int heightInMm;

    private int lengthInMm;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Materials materials;
}
