package com.zeyveli.userInfo.model.response;

import com.zeyveli.userInfo.model.entity.Geo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressResponse {

    private int id;

    private String street;

    private String suite;

    private String city;

    private String zipcode;

    private Geo geoId;

}
