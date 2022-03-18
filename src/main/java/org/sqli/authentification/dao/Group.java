package org.sqli.authentification.dao;

import javax.persistence.*;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false )
    private int id ;
    private String name ;

    @OneToOne
    private User user ;
    public Group() {
    }

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
