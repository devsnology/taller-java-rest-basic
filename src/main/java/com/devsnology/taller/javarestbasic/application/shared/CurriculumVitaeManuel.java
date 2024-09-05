package com.devsnology.taller.javarestbasic.application.shared;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curriculum_Manuel")
public class CurriculumVitaeManuel {

    @Id
    @Column(name = "dni")
    public String dni;  // No autogenerar el DNI, se proporciona

    @Column(name = "name")
    public String name;

    @Column(name = "profile")
    public String profile;

    @Column(name = "experience_1_position")
    public String experience1Position;

    @Column(name = "experience_1_company")
    public String experience1Company;

    @Column(name = "experience_1_description")
    public String experience1Description;

    @Column(name = "experience_2_position")
    public String experience2Position;

    @Column(name = "experience_2_company")
    public String experience2Company;

    @Column(name = "experience_2_description")
    public String experience2Description;

    @Column(name = "experience_3_position")
    public String experience3Position;

    @Column(name = "experience_3_company")
    public String experience3Company;

    @Column(name = "experience_3_description")
    public String experience3Description;

    @Column(name = "experience_4_position")
    public String experience4Position;

    @Column(name = "experience_4_company")
    public String experience4Company;

    @Column(name = "experience_4_description")
    public String experience4Description;

    @Column(name = "education_1_degree")
    public String education1Degree;

    @Column(name = "education_1_institution")
    public String education1Institution;

    @Column(name = "education_1_description")
    public String education1Description;

    @Column(name = "education_2_degree")
    public String education2Degree;

    @Column(name = "education_2_institution")
    public String education2Institution;

    @Column(name = "education_2_description")
    public String education2Description;

    @Column(name = "education_3_degree")
    public String education3Degree;

    @Column(name = "education_3_institution")
    public String education3Institution;

    @Column(name = "education_3_description")
    public String education3Description;

    @Column(name = "skills_1")
    public String skills1;

    @Column(name = "skills_2")
    public String skills2;

    @Column(name = "skills_3")
    public String skills3;

    @Column(name = "skills_4")
    public String skills4;

    @Column(name = "skills_5")
    public String skills5;

    @Column(name = "contact_email")
    public String contactEmail;

    @Column(name = "contact_phone")
    public String contactPhone;

    // Getters y setters si es necesario...
}