package edu.galile.agenda.service;

import  edu.galile.agenda.model.Contacto;
import edu.galile.agenda.model.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {
    @Autowired
    private ContactoRepository contactoRepository;
    public Contacto add(Contacto contacto){
        return this.contactoRepository.save(contacto);
    }
    public List<Contacto> list(){
        return this.contactoRepository.findAll();
    }
}
