package com.aemSolutions.carStore.service;

import com.aemSolutions.carStore.repository.BrandRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BrandService {
    @Autowired
    private BrandRepository brandRepository;
}
