package edu.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Company {
    @Id
    private int id;
    private String name;
    private List<Department> departments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
