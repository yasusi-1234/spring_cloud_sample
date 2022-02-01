package com.infybuzz.cloud.service;

import com.infybuzz.cloud.entity.Address;
import com.infybuzz.cloud.repository.AddressRepository;
import com.infybuzz.cloud.request.CreateAddressRequest;
import com.infybuzz.cloud.response.AddressResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    Logger logger = LoggerFactory.getLogger(AddressService.class);
    @Autowired
    AddressRepository addressRepository;

    public AddressResponse createAddress(CreateAddressRequest addressRequest){
        Address address = new Address();
        address.setStreet(addressRequest.getStreet());
        address.setCity(addressRequest.getCity());

        return new AddressResponse(addressRepository.save(address));
    }

    public AddressResponse getById(Long id){
        logger.info("Inside getById " + id);
        Address address = addressRepository.findById(id).get();
        return new AddressResponse(address);
    }
}
