package com.zeyveli.userInfo.service.concrete;

import com.zeyveli.userInfo.model.entity.Geo;
import com.zeyveli.userInfo.model.request.GeoRequest;
import com.zeyveli.userInfo.model.response.GeoResponse;
import com.zeyveli.userInfo.repository.GeoRepository;
import com.zeyveli.userInfo.service.abstracts.GeoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeoServiceImpl implements GeoService {

    GeoRepository geoRepository;
    ModelMapper modelMapper;

    @Autowired
    public GeoServiceImpl(GeoRepository geoRepository, ModelMapper modelMapper) {
        this.geoRepository = geoRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public GeoResponse create(GeoRequest geoRequest) {
        Geo geo = modelMapper.map(geoRequest, Geo.class);
        geo = geoRepository.saveAndFlush(geo);
        return modelMapper.map(geo, GeoResponse.class);
    }

    @Override
    public List<GeoResponse> getAll() {
        List<Geo> list = geoRepository.findAll();
        List<GeoResponse>  geoResponseList = null;
        for (Geo geo : list) {
            geoResponseList.add(modelMapper.map(geo, GeoResponse.class));
        }
        return geoResponseList;
    }

    @Override
    public GeoResponse update(GeoRequest geoRequest) {
        Geo geo = geoRepository.getById(geoRequest.getId());

        return modelMapper.map(geo, GeoResponse.class);
    }

    @Override
    public void delete(int id) {
        geoRepository.deleteById(id);
    }
}
