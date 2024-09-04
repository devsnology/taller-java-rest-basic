package com.devsnology.taller.javarestbasic.application.shared;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "direcciones")
public class Direcciones {

    @Id
    @Column(name = "dni")
    public String id;  // No autogenerar el DNI, se proporciona

    @Column(name = "calle")
    public String calle;

    @Column(name = "numero")
    public String numero;

}
