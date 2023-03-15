package com.academy.service;

import com.academy.entity.CountryCode;
import com.academy.exception.InvalidCountryCodeException;
import com.academy.exception.ValidationException;

public class CountryCodeValidator extends Validator<String>  {
    @Override
    public void validate(String countryCode) {
     if (countryCode.isEmpty()) {
        try {
            CountryCode.valueOf(countryCode.toUpperCase());
        } catch (ValidationException e) {
            throw new ValidationException("Country code: %s, is not valid".formatted(countryCode));
        }
    }}
}
