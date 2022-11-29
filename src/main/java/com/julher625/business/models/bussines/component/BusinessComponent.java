package com.julher625.business.models.bussines.component;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class BusinessComponent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<BusinessComponentField> fields;
}
