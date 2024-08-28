package com.devsnology.taller.javarestbasic.application.shared;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "debts")
public class Debt {

    @Id
    @Column(name = "debt_id")
    public String id;  // No autogenerar el DNI, se proporciona

    @Column(name = "dni")
    public String dni;

    @Column(name ="amount")
    public String amount;

};
