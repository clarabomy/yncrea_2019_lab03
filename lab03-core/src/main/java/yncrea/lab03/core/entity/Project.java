package yncrea.lab03.core.entity;

import javax.persistence.Entity;

//TODO annotate this entity
@Entity
public class Project {

    public long id;

    private String name;

    private Company company;

    private Customer customer;


    public Project() {
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


    public Company getCompany() {
        return company;
    }


    public void setCompany(final Company companyValue) {
        company = companyValue;
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(final Customer customerValue) {
        customer = customerValue;
    }
}
