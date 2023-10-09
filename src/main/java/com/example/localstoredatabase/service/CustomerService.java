package com.example.localstoredatabase.service;

import com.example.localstoredatabase.dto.CustomerDTO;
import com.example.localstoredatabase.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImplimentation {

    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerDTO> getAllCustomers() {
        // Convert and return all customers
    }

    public CustomerDTO getCustomerById(Long id) {
        // Find customer by id, convert and return
    }

    public CustomerDTO createCustomer(CustomerDTO customerDTO) {
        // Convert DTO to entity, save, and return
    }

    public CustomerDTO updateCustomer(Long id, CustomerDTO customerDTO) {
        // Find customer by id, update fields, save and return
    }

    public void deleteCustomer(Long id) {
        // Delete customer by id
    }
}
