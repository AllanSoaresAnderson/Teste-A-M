package com.aemSolutions.carStore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;


}
