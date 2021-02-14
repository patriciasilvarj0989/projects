package br.com.project.microservicespatricia.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    @NotBlank(message = "Nome é campo obrigátorio")
    @Size(min = 10, max = 200, message
            = "Nome deve ser completo")
    private String name;
    @Email(message ="Email deve ser válido" )
    private String Email;

    public User() {
    }

    public User(@NotBlank(message = "Nome é campo obrigátorio") @Size(min = 10, max = 200, message
            = "Nome deve ser completo") String name, @javax.validation.constraints.Email(message = "Email deve ser válido") String email) {
        this.name = name;
        Email = email;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
