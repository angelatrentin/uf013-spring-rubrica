package it.marconi.rubrica.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactForm {

    //inserisco i controlli di validazione per ogni campo (causa di @Valid)
    @NotEmpty
    @Size(max=30)
    private String name;

    @NotEmpty
    @Size(max=50)
    private String surname;

    @Pattern (regexp = "([0-9]{10})") 
    private String phoneNumber;

    @Email
    private String email;

    
}
