package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ceos")

public class CEO extends Employee {
    private double totalBudget;
    private List<Department> departments;
    private List<Manager> managers;
    private List<Admin> Admins;

    public CEO(){}

    public CEO(String name, String nino, double salary, double totalBudget){
        super(name,nino,salary);
        this.totalBudget = totalBudget;

    }

   @Column(name="total_budget")
    public double getTotalBudget() {
        return totalBudget;
    }

    public void setTotalBudget() {
        totalBudget = 0;
        for (Manager manager : managers){
            totalBudget += manager.getBudget();
        }


    }
    @OneToMany(mappedBy = "ceo", fetch = FetchType.LAZY)
    public List<Department> getDepartments() {
        return departments;
    }


    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Column(name ="managers")
    public List<Manager> getManagers() {
        return managers;
    }

    public void setManagers(List<Manager> managers) {
        this.managers = managers;
    }

    @Column(name = "admins")
    public List<Admin> getAdmins() {
        return Admins;
    }

    public void setAdmins(List<Admin> admins) {
        Admins = admins;
    }

//    METHOD to add managers to CEO


    public void addManagers(Manager manager) {
        this.managers.add(manager);
    }

}
