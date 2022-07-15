package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="datos", catalog = "registro", schema = "")
public class nameEntity{
    @Id
    @Column
    private Integer ID_datos;
    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private Integer edad;

    //Getter and Setter
    public Integer getID_datos() {
        return ID_datos;
    }

    public void setID_datos(Integer ID_datos) {
        this.ID_datos = ID_datos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
