package models;

import com.sun.javafx.beans.IDProperty;
import db.DBDepartment;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Adler32;

@Entity
@Table(name ="managers")

public class Manager extends Employee {
    private double budget;
    private Department department;
    private List<Admin> admin;


    public Manager(){}

    public Manager( String name, String nino, double salary, double budget) {
        super(name, nino, salary);
        this.budget = budget;
        this.department = department;
        this.admin = new ArrayList<Admin>();
    }

//    BUDGET Getter & Setter:

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }



//  ONE-TO-ONE: Manager gets Department:

    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



//    ONE-TO-MANY: Manager gets Admins:

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public List<Admin> getAdmin() {
        return admin;
    }

    public void setAdmin(List<Admin> admin) {
        this.admin = admin;
    }


}

