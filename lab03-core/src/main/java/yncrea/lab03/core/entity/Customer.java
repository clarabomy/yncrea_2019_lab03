package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = { "projects" })
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column
    private String name;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="customer")
    private List<Project> projects;

    @ManyToOne
    private BusinessType businessType;

    public Customer() {
    }


    public long getId() {
        return id;
    }


    public void setId(final long idValue) {
        id = idValue;
    }


    public String getName() {
        return name;
    }


    public void setName(final String nameValue) {
        name = nameValue;
    }


    public List<Project> getProjects() {
        return projects;
    }


    public void setProjects(final List<Project> projectValue) {
        projects = projectValue;
    }


    public BusinessType getBusinessType() {
        return businessType;
    }


    public void setBusinessType(final BusinessType businessTypeValue) {
        businessType = businessTypeValue;
    }
}
