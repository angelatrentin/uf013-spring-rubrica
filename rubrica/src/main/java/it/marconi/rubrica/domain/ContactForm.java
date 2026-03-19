package it.marconi.rubrica.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactForm {
    private String name;
    private String surname;
    private String phoneNumber;
    private String email;

    
}
