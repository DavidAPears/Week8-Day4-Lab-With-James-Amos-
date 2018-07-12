package models;

import javax.persistence.*;

@Entity
@Table(name= "admins")

public class Admin extends Employee {
    private Manager manager;
    private Department department;

    public Admin(){}

    public Admin(String name, String nino, double salary, Manager manager, Department department) {
        super(name,nino,salary);
        this.manager = manager;
        this.department = department;

    }



//    MANY-TO-ONE join with Manager class:

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }



    //    MANY-TO-ONE join with Department class:

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



}

