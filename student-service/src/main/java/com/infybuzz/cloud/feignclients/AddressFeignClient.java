package com.infybuzz.cloud.feignclients;

import com.infybuzz.cloud.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// この記述はダイレクトアドレスサービスへの問合せになっている
//@FeignClient(
//        value = "address-service",
//        path = "/api/address")
@FeignClient(value = "api-gateway")
public interface AddressFeignClient {

    @GetMapping("/address-service/api/address/getById/{id}")
    public AddressResponse getById(@PathVariable("id") long id);
}
