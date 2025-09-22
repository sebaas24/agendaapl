package edu.galile.agenda.model.repository;

import  edu.galile.agenda.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
