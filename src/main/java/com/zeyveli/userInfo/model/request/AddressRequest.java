package com.zeyveli.userInfo.model.request;

import com.zeyveli.userInfo.model.entity.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressRequest {

    private int id;

    private String street;

    private String suite;

    private String city;

    private String zipcode;

    private Geo geoId;

}
