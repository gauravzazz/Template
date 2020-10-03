package com.template.template.MyController;
import com.template.template.MyModel.Model;
import com.template.template.MyService.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/template")
public class Controller {


    @Autowired
    private Service ser;

    @GetMapping("/student")
    public List<Model> allStudent(){
        return ser.findAll() ;
    }
    @PostMapping("/newStudent")
    public String newStudent(@RequestBody Model m){
        return ser.newStudent(m);
    }

    @GetMapping("/students/{id}")
    public Optional<Model> findById(@PathVariable int id){
        return ser.findStudentById(id);
    }

    @GetMapping("/student/{name}")
     public Optional<Model> findByName(@PathVariable String name){
        return ser.findByName(name);
    }

}
