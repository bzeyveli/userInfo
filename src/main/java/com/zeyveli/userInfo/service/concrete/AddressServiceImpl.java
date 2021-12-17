package com.zeyveli.userInfo.service.concrete;

import com.zeyveli.userInfo.model.entity.Address;
import com.zeyveli.userInfo.model.request.AddressRequest;
import com.zeyveli.userInfo.model.response.AddressResponse;
import com.zeyveli.userInfo.repository.AddressRepository;
import com.zeyveli.userInfo.service.abstracts.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public AddressResponse create(AddressRequest addressRequest) {
        Address address = modelMapper.map(addressRequest, Address.class);
        address = addressRepository.saveAndFlush(address);
        return modelMapper.map(address,AddressResponse.class);
    }

    @Override
    public List<AddressResponse> getAll() {
        List<Address> list = addressRepository.findAll();
        List<AddressResponse> addressResponseList = null;
        for (Address address: list) {
            addressResponseList.add(modelMapper.map(address,AddressResponse.class));
        }
        return addressResponseList;
    }

    @Override
    public AddressResponse update(AddressRequest addressRequest) {
      Address address = addressRepository.getById(addressRequest.getId());

      address= addressRepository.saveAndFlush(address);
      return modelMapper.map(address,AddressResponse.class);
    }

    @Override
    public void delete(int id) {
       addressRepository.deleteById(id);
    }
}
