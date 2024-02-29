package com.aemSolutions.carStore.dto;


import lombok.Data;

import java.util.Date;

@Data
public class ClientDTO {

    private Integer id;
    private String name;
    private String email;
    private String CPF;
    private Date birthday;
    private String address;
}
