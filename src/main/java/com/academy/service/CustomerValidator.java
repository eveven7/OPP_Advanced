package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.entity.Customer;
import com.academy.exception.CustomerNotAdultException;
import com.academy.exception.InvalidCountryCodeException;
import com.academy.exception.MandatoryValueMissingException;
import org.springframework.stereotype.Component;

@Component
public class CustomerValidator {

private Validator <Integer> CustomerAdultValidator = new CustomerAdultValidator();
    private Validator <Customer> MandatoryCustomerValuesValidator = new MandatoryCustomerValuesValidator();
    private Validator <String> CountryCodeValidator = new CountryCodeValidator();
    public void validate(Customer customer) {

        CustomerAdultValidator.validate(18);
        MandatoryCustomerValuesValidator.validate(customer);
        CountryCodeValidator.validate(customer.getCountryCode());

    }
}