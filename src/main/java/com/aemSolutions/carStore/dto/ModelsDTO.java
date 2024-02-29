package com.aemSolutions.carStore.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ModelsDTO {
    private Integer id;
    private String type;
    private LocalDate year;
    private Integer idBrand;
    private Double price;
}
