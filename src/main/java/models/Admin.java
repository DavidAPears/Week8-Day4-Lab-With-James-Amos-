package models;

import javax.persistence.*;

@Entity
@Table(name= "admins")

public class Admin extends Employee {
    private Manager manager;

    public Admin(){}

    public Admin(String name, String nino, double salary, Manager manager) {
        super(name,nino,salary);
        this.manager = manager;

    }


//    public void addAdmin(Admin admin) {this.admin.add(admin);}

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


}

