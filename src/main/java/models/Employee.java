package models;


import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employee {

    private int id;
    private String name;
    private String nino;
    private double salary;


    public Employee() { }



    public Employee(int id, String name, String nino, double salary) {
        this.id = id;
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

//    ID Getter & Setters:

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    NAME Getter & Setters:

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


//   NINO Getter & Setters:

    @Column(name = "nino")
    public String getNino() {
        return nino;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }


//    SALARY Getter & Setters:

    @Column(name = "salary")
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


