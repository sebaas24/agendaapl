package edu.galile.agenda.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "contacto")
@Data
public class Contacto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String direccion;

    @Column
    private String telefono;

    @Column
    private String carnet;
}