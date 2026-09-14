package org.example.customermanagementstoredprocedure.service;

import org.example.customermanagementstoredprocedure.repository.ICustomerRepository;

import org.example.customermanagementstoredprocedure.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository iCustomerRepository;

    @Override
    public boolean saveWithStoredProcedure(Customer customer) {
        return iCustomerRepository.saveWithStoredProcedure(customer);
    }
}