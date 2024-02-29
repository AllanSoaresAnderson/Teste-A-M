package com.aemSolutions.carStore.service;

import com.aemSolutions.carStore.repository.SaleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SaleService {
    @Autowired
    private SaleRepository saleRepository;
}
