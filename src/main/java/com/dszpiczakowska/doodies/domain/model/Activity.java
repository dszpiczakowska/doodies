package com.dszpiczakowska.doodies.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name = "activity")
public class Activity {

    public Activity(){}
    public Activity(String name, String description, ActivityCategory category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public String name;
    public String description;
    public ActivityCategory category;
}
