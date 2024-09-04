package com.devsnology.taller.javarestbasic.application.shared;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="curriculum_juan")
public class CurriculumVitaeJuan {

    @Id
    @Column(name= "dni")
    public String dni;

    @Column(name= "nombre")
    public String nombre;

    @Column(name= "perfil")
    public String perfil;

    @Column(name= "posicion")
    public String posicion;

    @Column(name= "experiencia_en_empresa")
    public String experiencia_en_empresa;

    @Column(name= "description_experiencia")
    public String description_experiencia;

    @Column(name= "educacion")
    public String educacion;

    @Column(name= "titulo_educacion")
    public String titulo_educacion;

    @Column(name= "titulo_educacion2")
    public String titulo_educacion2;

    @Column(name= "educacion_universitaria")
    public String educacion_universitaria;

    @Column(name= "tecnologias")
    public String tecnologias;

    @Column(name= "contacto_email")
    public String contacto_email;

    @Column(name= "contacto_telefono")
    public String contacto_telefono;
}
