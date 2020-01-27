package yncrea.lab03.core.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@JsonIgnoreProperties(value = { "customers" })
public class BusinessType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    @Column
    private String name;

    @OneToMany(cascade={CascadeType.ALL}, mappedBy="businessType")
    private List<Customer> customers;

    public BusinessType() {
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


    public List<Customer> getCustomers() {
        return customers;
    }


    public void setCustomers(final List<Customer> customersValue) {
        customers = customersValue;
    }
}
