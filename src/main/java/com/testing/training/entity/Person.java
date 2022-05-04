package com.testing.training.entity;

import javax.persistence.*;

@Entity
@Table
public class Person {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String lastName;
    @Column
    private String occupation;

    public Person() {
    }

    public Person(int id, String name, String lastName, String occupation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
