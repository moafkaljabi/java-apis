package com.apis.apis.user;

import java.time.LocalDate;

public class User {

    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private LocalDate DoB;
    private Integer age;


    public User() {
    }

    public User(Long id,
                String firstname,
                String lastname,
                String email,
                LocalDate doB,
                Integer age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        DoB = doB;
        this.age = age;
    }

    public User(Integer age, LocalDate doB, String email, String lastname, String firstname) {
        this.age = age;
        DoB = doB;
        this.email = email;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDoB() {
        return DoB;
    }

    public void setDoB(LocalDate doB) {
        DoB = doB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", DoB=" + DoB +
                ", age=" + age +
                '}';
    }
}
