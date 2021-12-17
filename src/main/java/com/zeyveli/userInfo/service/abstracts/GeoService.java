package com.zeyveli.userInfo.service.abstracts;

import com.zeyveli.userInfo.model.request.GeoRequest;
import com.zeyveli.userInfo.model.response.GeoResponse;

import java.util.List;

public interface GeoService {

    GeoResponse create(GeoRequest geoRequest);

    List<GeoResponse> getAll();

    GeoResponse update(GeoRequest geoRequest);

    void delete(int id);
}
