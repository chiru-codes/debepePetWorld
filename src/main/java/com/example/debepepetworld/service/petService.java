package com.example.debepepetworld.service;

import com.example.debepepetworld.domain.pet;
import com.example.debepepetworld.infrastructure.petRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.dnd.InvalidDnDOperationException;
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

@Service
public class CalculatorService {
    private final Calculator calc;
    public CalculatorService() {
        this.calc = new Calculator();
    }
    public Long resta(Long a, Long b) {
        if (a == b){
            throw new InvalidDnDOperationException("No se pueden restar dos numeros iguales");
        }
        if (a < b) {
            throw new InvalidDnDOperationException("a no puede ser menor que b");
        }
        return calc.resta(a,b);
    }
}
// ACÁ VA TODA LA LÓGICA JEJEJEJE