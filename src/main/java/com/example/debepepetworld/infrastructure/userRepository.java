package com.example.debepepetworld.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.debepepetworld.domain.user;

public interface userRepository extends JpaRepository<user, Long> {}
