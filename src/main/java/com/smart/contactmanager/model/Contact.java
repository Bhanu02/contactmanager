package com.smart.contactmanager.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="CONTACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cId;
    private String name;
    private String secondName;
    private String work;
    private String email;
    private String phone;
    private String image;
    @Column(length = 5000)
    private String description;

    @ManyToOne
    private User user;


}
