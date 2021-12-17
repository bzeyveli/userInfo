package com.zeyveli.userInfo.controller;

import com.zeyveli.userInfo.model.request.GeoRequest;
import com.zeyveli.userInfo.model.response.GeoResponse;
import com.zeyveli.userInfo.service.abstracts.GeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/geo")
public class GeoController {

    @Autowired
    private GeoService geoService;

    @PostMapping
    public GeoResponse create(@RequestBody GeoRequest geoRequest){
        GeoResponse geoResponse = geoService.create(geoRequest);
        return geoResponse;
    }

    @GetMapping
    public List<GeoResponse> getAll(){
        List<GeoResponse> list = geoService.getAll();
        return list;
    }

    @PutMapping
    public GeoResponse update(@RequestBody GeoRequest geoRequest){
        return geoService.update(geoRequest);
    }

    @DeleteMapping
    public void delete(int id){
        geoService.delete(id);
    }

}
