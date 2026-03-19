package it.marconi.rubrica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.marconi.rubrica.domain.Contact;
import it.marconi.rubrica.domain.ContactForm;
import it.marconi.rubrica.repositories.ContactRepository;

@Service
public class ContactService {

    //dependency injection
    @Autowired
    private ContactRepository contactRepo;

    public Contact save(ContactForm contactForm) {
        Contact c = mapContact(contactForm);
        return contactRepo.save(c);
    }

    private Contact mapContact(ContactForm form) {
        Contact c = new Contact();
        c.setName(form.getName());
        c.setSurname(form.getSurname());
        c.setEmail(form.getEmail());
        c.setPhoneNumber(form.getPhoneNumber());

        return c;
    }



    public List<Contact> findAll()  {
        return contactRepo.findAll();
    }
    
}
