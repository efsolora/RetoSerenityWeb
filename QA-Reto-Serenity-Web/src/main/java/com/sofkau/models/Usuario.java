package com.sofkau.models;

import com.github.javafaker.Faker;

public class Usuario {
    private String nombre;
    private String apellido;
    private String celular;

    private String cc;


    Faker faker = new Faker();

    public Usuario() {
        this.nombre = "andres";
        this.apellido = "Arrieta";
        this.celular = "3016693220";
        this.cc = "1144046696";
    }

    public String getNombre() {
        return nombre;
    }
    public String getCc() {
        return cc;
    }
    public String getApellido() {
        return apellido;
    }

    public  String getCelular() {
        return celular;
    }

}
