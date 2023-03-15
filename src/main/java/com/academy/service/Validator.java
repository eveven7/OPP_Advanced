package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.entity.Customer;
import com.academy.exception.CustomerNotAdultException;
import com.academy.exception.InvalidCountryCodeException;
import com.academy.exception.MandatoryValueMissingException;
import com.academy.exception.ValidationException;
import org.springframework.stereotype.Component;

public abstract class Validator <T> {
    public abstract void validate(T attribute) throws ValidationException;

}