package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.http.HttpStatus;
import  org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/datos")
@CrossOrigin(origins = "http://localhost:4200/")
public class nameController {
    @Autowired
    private nameInterface nameInterface;

    //Obtener datos
    @GetMapping
    public List <nameEntity> datos(){
        return (List <nameEntity>) nameInterface.findAll();
    }

    //Insertar datos
    @PostMapping
    public void insertarDatos(@RequestBody nameEntity nE){
        nameInterface.save(nE);
    }

    //Cambiar datos
    @PutMapping
    public void cambiarDatos(@RequestBody nameEntity nE){
        nameInterface.save(nE);
    }
    //Borrar datos
    @DeleteMapping (value = "/{id}")
    public void borrarDatos(@PathVariable("id") Integer id){
        nameInterface.deleteById(id);
    }
}



