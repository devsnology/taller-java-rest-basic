package com.devsnology.taller.javarestbasic.ejemplo.dto;

public class EjemploDto {

    public String nombre;
    public String apellido;
    public String email;
    public String telefono;

    public EjemploDto() {
    }

    public EjemploDto(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

}
