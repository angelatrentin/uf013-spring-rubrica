package it.marconi.rubrica.domain;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   //genera automaticamente getter, setter
@NoArgsConstructor      //genera automaticamente costruttore senza argomenti
@AllArgsConstructor     //genera automaticamente costruttore con tutti gli argomenti
@Entity
@Table(name = "contacts")
public class Contact {

    @Id                 //primary key
    @GeneratedValue     //generazione automatica del valore
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "phone")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

}
