package com.zeyveli.userInfo.service.abstracts;

import com.zeyveli.userInfo.model.request.AddressRequest;
import com.zeyveli.userInfo.model.response.AddressResponse;

import java.util.List;

public interface AddressService {

    AddressResponse create(AddressRequest addressRequest);

    List<AddressResponse> getAll();

    AddressResponse update(AddressRequest addressRequest);

    void delete(int id);
}
