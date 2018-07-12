package models;

import javax.persistence.*;

@Entity
@Table(name= "admins")

public class Admin {
    private int id;
    private Manager manager;

    public Admin(){}

    public Admin(int id, Manager manager) {
        this.id = id;
        this.manager = manager;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "manager")
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}

