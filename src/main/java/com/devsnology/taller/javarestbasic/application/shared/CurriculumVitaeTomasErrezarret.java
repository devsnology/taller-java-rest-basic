package com.devsnology.taller.javarestbasic.application.shared;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curriculum_vitae")
public class CurriculumVitaeTomasErrezarret {

    @Id
    @Column(name = "dni")
    public String dni;

    @Column(name = "name")
    public String name;

    @Column(name = "profile")
    public String profile;

    @Column(name = "experience_1_position")
    public String experience1Position = "Delivery";

    @Column(name = "experience_1_company")
    public String experience1Company = "Delivery Express";

    @Column(name = "experience_1_description")
    public String experience1Description = "Entrega de pedidos a tiempo, atención al cliente, gestión de rutas.";

    @Column(name = "education_1_degree")
    public String education1Degree = "Estudiante";

    @Column(name = "education_1_institution")
    public String education1Institution = "Universidad XYZ";

    @Column(name = "skills_1")
    public String skills1 = "Atención al público";

    @Column(name = "skills_2")
    public String skills2 = "Gestión de tiempo";

    @Column(name = "contact_email")
    public String contactEmail;

    @Column(name = "contact_phone")
    public String contactPhone;
}
