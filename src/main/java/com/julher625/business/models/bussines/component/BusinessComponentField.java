package com.julher625.business.models.bussines.component;

import jakarta.persistence.*;

@Entity
public class BusinessComponentField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    //@OneToOne
    //@JoinColumn(name = "business_component_type_id", referencedColumnName = "id")
    @OneToOne
    private BusinessComponentFieldType businessComponentFieldType;


}
