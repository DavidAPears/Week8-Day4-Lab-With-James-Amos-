package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "departments")

public class Department {

    private int id;
    private String title;
    private Manager manager;
    private List<Admin> admin;
    private CEO ceo;

    public Department(){}

    public Department(String title, Manager manager, CEO ceo) {
        this.title = title;
        this.manager = manager;
        this.admin = new ArrayList<Admin>();
        this.ceo = ceo;
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    @OneToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }



    // Many to one CEO has many departments
    @ManyToOne
    @JoinColumn(name ="ceo_id", nullable = false)
    public CEO getCeo() {
        return ceo;
    }

    public void setCeo(CEO ceo) {
        this.ceo = ceo;
    }
}
