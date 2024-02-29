package com.aemSolutions.carStore.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
@Entity
public class Models {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private LocalDate year;
    @Column(nullable = false)
    private Integer idBrand;
    @Column(nullable = false)
    private Double price;


}
