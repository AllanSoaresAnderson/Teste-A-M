package com.aemSolutions.carStore.service;

import com.aemSolutions.carStore.repository.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
}
