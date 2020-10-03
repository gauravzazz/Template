package com.template.template.MyService;
import com.template.template.MyModel.Model;
import com.template.template.MyRepository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service

public class Service {

    @Autowired
    private Repository repo;

    //Service 1

    public String newStudent( Model m){
        repo.save(m);
        return " A new Student Just Registered";

    }

    //Service 2

    public Optional<Model> findStudentById(int id){

        return repo.findById(id);
    }

    //Service 3

    public Optional<Model> findByName(String name){
        return repo.findByStudent(name);
    }

    public List<Model> findAll() {
        return repo.findAll();
    }
}
