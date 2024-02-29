package com.aemSolutions.carStore.service;

import com.aemSolutions.carStore.dto.SellerDTO;
import com.aemSolutions.carStore.entity.Seller;
import com.aemSolutions.carStore.repository.SellerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public void addSeller(){

    }

    public void getSellerById(Integer id){

    }


    private Seller toEntity(SellerDTO dto){
        Seller entity = new Seller();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        return entity;
    }

    private SellerDTO toDTO(Seller seller){
        SellerDTO dto = new SellerDTO();
        dto.setId(seller.getId());
        dto.setName(seller.getName());
        dto.setEmail(seller.getEmail());
        return dto;
    }



}
