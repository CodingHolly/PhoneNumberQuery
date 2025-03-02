package com.holly.back_end.controller;

import com.holly.back_end.service.PhoneInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/phone")
public class PhoneInfoController {
    @Autowired
    private PhoneInfoService phoneInfoService;

    @GetMapping("/operator/{prefix}")
    public String getOperator(@PathVariable String prefix) {
        return phoneInfoService.getOperatorByPrefix(prefix);
    }

    @GetMapping("/location/{phoneNumber}")
    public String getLocation(@PathVariable String phoneNumber) {
        return phoneInfoService.getLocationByPhoneNumber(phoneNumber);
    }
}
