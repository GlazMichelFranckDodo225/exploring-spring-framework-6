package com.dgmf.controller;

import com.dgmf.entity.Course;
import com.dgmf.profiles.CurrencyServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/currency-configuration")
public class CurrencyConfigController {
    @Autowired
    private CurrencyServiceConfig currencyServiceConfig;

    // http://localhost:8080/api/v1/currency-configuration
    @GetMapping
    public CurrencyServiceConfig retrieveAllConfigs() {
        return currencyServiceConfig;
    }
}
