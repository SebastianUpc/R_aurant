package com.example.r_erant_proyect.ServiceImplements;

import com.example.r_erant_proyect.Entitie.Personal;
import com.example.r_erant_proyect.Repository.RepositoryPersonal;
import com.example.r_erant_proyect.ServiceInterface.PersonalServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonalServiceImplements implements PersonalServiceInterface {
    @Autowired
    private RepositoryPersonal Rp;
    @Override
    public List<Personal> list(){
        return Rp.findAll();
    }
    @Override
    public Personal insert(Personal p){
        return Rp.save(p);
    }
    @Override
    public Optional<Personal> listId(int id){
        return Rp.findById(id);
    }
    @Override
    public void update(Personal p){
        Rp.save(p);
    }
    @Override
    public void delete(int id){
        Rp.deleteById(id);
    }
}
