package com.example.localstoredatabase.service;

import com.example.localstoredatabase.dto.CustomerDTO;
import com.example.localstoredatabase.entity.Customer;
import com.example.localstoredatabase.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private final CustomerRepository projectRepository;

    public CustomerServiceImpl(CustomerRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public Customer createCustomer(CustomerDTO customerDto) {
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return null;
    }

    @Override
    public Customer getCustomerById(Long customerId) {
        return null;
    }

    @Override
    public Customer updateCustomer(Long customerId, CustomerDTO customerDto) {
        return null;
    }

    @Override
    public void deleteCustomer(Long customerId) {

    }
}
