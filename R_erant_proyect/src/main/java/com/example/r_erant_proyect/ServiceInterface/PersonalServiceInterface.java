package com.example.r_erant_proyect.ServiceInterface;

import com.example.r_erant_proyect.Entitie.Personal;
import com.example.r_erant_proyect.Repository.RepositoryPersonal;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public interface PersonalServiceInterface {
    public List<Personal> list();
    public Personal insert(Personal p);
    public Optional<Personal> listId(int id);
    public void update(Personal p);
    public void delete(int id);
}
