package com.example.debepepetworld.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pet")
@Getter // Crea todos los getters
@Setter // Crea todos los setters
@NoArgsConstructor
public class pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    // === Attributes and Constructor ===
    private String name;
    private String description;

}
// EN EL DOMAIN DEFINES LOS ATRIBUTOS DE TU CLASE