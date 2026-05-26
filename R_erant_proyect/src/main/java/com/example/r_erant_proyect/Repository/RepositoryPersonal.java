package com.example.r_erant_proyect.Repository;

import com.example.r_erant_proyect.Entitie.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPersonal extends JpaRepository<Personal,Integer> {
}
