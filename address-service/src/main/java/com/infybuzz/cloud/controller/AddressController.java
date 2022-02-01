package com.infybuzz.cloud.controller;


import com.infybuzz.cloud.request.CreateAddressRequest;
import com.infybuzz.cloud.response.AddressResponse;
import com.infybuzz.cloud.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping("/create")
    public AddressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest){
        return addressService.createAddress(createAddressRequest);
    }

    @GetMapping("/getById/{id}")
    public AddressResponse getById(@PathVariable("id") long id){
        return addressService.getById(id);
    }
}
