package com.training.justdab.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee extends User {

    @OneToMany(mappedBy = "advisor")
    private List<Client> clients;

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
