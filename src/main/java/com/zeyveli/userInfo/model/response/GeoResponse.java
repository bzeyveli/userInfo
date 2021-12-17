package com.zeyveli.userInfo.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GeoResponse {

    private int id;

    private String lat;

    private String lmg;
}
