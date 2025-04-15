package com.example.debepepetworld.application;

import com.example.debepepetworld.domain.pet;
import com.example.debepepetworld.service.petService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class petController {
    private final petService petService;

    @Autowired
    public petController(petService petService) {
        this.petService = petService;
    }

    // === Endpoints ===
    // GET, POST, PUT, PATCH, DELETE
    @PostMapping()
    public ResponseEntity<pet> createPetController(@RequestBody pet newPet) {
        pet createdPet = petService.createPet(newPet);
        return new ResponseEntity<>(createdPet, HttpStatus.CREATED);
    }
}
// UTILIZAMOS LAS FUNCIONES DEL SERVICIO Y LLAMA LAS FUNCIONES -> SERVICIO QUE TIENES LA LÓGICA
// ME CREAS UNAS MASCOTA Y YO TE DOY LA DATA Y ME DICES UNA RESPUESTA