package com.zeyveli.userInfo.controller;

import com.zeyveli.userInfo.model.request.AddressRequest;
import com.zeyveli.userInfo.model.response.AddressResponse;
import com.zeyveli.userInfo.service.abstracts.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @PostMapping
    public AddressResponse create(@RequestBody AddressRequest addressRequest){
        AddressResponse addressResponse = addressService.create(addressRequest);
        return addressResponse;
    }

    @GetMapping
    public List<AddressResponse> getAll(){
        List<AddressResponse> list = addressService.getAll();
        return list;
    }

    @PutMapping
    public AddressResponse update(@RequestBody AddressRequest addressRequest){
        return addressService.update(addressRequest);
    }

    @DeleteMapping
    public void delete(int id){
        addressService.delete(id);
    }
}
