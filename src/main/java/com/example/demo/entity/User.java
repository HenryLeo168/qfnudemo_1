package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @Column(name = "f_id")
    private Integer id;

    @Column(name = "f_username", unique = true, nullable = false, length = 16)
    private String username;

    @Column(name = "f_password", length = 32, nullable = false)
    private String password;

    @Column(name = "f_name", length = 64)
    private String name;

    @Column(name = "f_age")
    private Integer age;

    @Column(name = "f_phone", length = 11)
    private String phone;

    public Integer getId() {
        return id;
        }

    public void setId(Integer id) {
        this.id = id;
        }

    public String getUsername() {
        return username;
        }

    public void setUsername(String username) {
        this.username = username;
        }

    public String getPassword() {
        return password;
        }

    public void setPassword(String password) {
        this.password = password;
        }

    public String getName() {
        return name;
        }

    public void setName(String name) {
        this.name = name;
        }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

