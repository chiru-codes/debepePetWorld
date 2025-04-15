package com.example.debepepetworld.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.debepepetworld.domain.pet;

public interface petRepository extends JpaRepository<pet, Long> {}
