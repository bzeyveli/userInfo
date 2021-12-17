package com.zeyveli.userInfo.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GeoRequest {

    private int id;

    private String lat;

    private String lmg;
}
