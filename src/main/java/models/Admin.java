package models;

import javax.persistence.*;

@Entity
@Table(name= "admins")

public class Admin extends Employee {
    private int id;
    private Manager manager;

    public Admin(){}

    public Admin(String name, String nino, double salary, Manager manager) {
        super(name,nino,salary);
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

