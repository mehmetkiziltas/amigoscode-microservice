package com.amigoscode.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService (CustomerRepository customerRepository){

    public void registerCustomer(final CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //TODO: check if email valid
        //TODO: check if email not token
        customerRepository.save(customer);
    }
}
