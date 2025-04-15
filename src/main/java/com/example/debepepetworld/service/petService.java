package com.example.debepepetworld.service;

import com.example.debepepetworld.domain.pet;
import com.example.debepepetworld.infrastructure.petRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class petService {
    private final petRepository petRepository;

    @Autowired
    public petService(petRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    // === Functions of service ===

    public pet createPet(pet newPet){
        return petRepository.save(newPet);
        // ORM -> petRepository.save(nuevo elemento):
    }
}
// ACÁ VA TODA LA LÓGICA JEJEJEJE