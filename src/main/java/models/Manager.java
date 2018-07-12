package models;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;
import java.util.zip.Adler32;

@Entity
@Table(name ="managers")

public class Manager {
    private int id;
    private double budget;
    private Department department;
    private List<Admin> admin;


    public Manager(){}

    public Manager(int id, double budget, Department department, List<Admin> admin) {
        this.id = id;
        this.budget = budget;
        this.department = department;
        this.admin = admin;
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

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
    @Column(name="department")
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
   @Column(name= "admin")
    public List<Admin> getAdmin() {
        return admin;
    }

    public void setAdmin(List<Admin> admin) {
        this.admin = admin;
    }
}
