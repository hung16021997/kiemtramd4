package com.example.demo.fomatter;

import com.example.demo.models.Country;
import com.example.demo.services.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;

@Component
public class countryFormatter implements Formatter<Country> {
    @Autowired
    private ICountryService countryService;
    @Override
    public Country parse(String text, Locale locale) throws ParseException {
        return countryService.findOne(Long.parseLong(text));
    }
    @Override
    public String print(Country object, Locale locale) {
        return "[" + object.getId() + ", " +object.getName() + "]";
    }
}
