package edu.galile.agenda.controller;

import edu.galile.agenda.model.Contacto;
import edu.galile.agenda.service.ContactoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/contacto")
public class ContactoController {
    private ContactoService contactoService;
    ContactoController(ContactoService contactoService){
        this.contactoService = contactoService;
    }
    @GetMapping
    public List<Contacto> getAll(){
        return this.contactoService.list();
    }
    @PostMapping
    public Contacto add(@RequestBody(required = true) Contacto contacto){
        return this.contactoService.add(contacto);
    }
}
