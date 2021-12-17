package com.zeyveli.userInfo.controller;

import com.zeyveli.userInfo.model.request.CompanyRequest;;
import com.zeyveli.userInfo.model.response.CompanyResponse;
import com.zeyveli.userInfo.service.abstracts.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping
    public CompanyResponse create(@RequestBody CompanyRequest companyRequest){
        CompanyResponse companyResponse = companyService.create(companyRequest);
        return companyResponse;
    }

    @GetMapping
    public List<CompanyResponse> getAll(){
        List<CompanyResponse> list = companyService.getAll();
        return list;
    }

    @PutMapping
    public CompanyResponse update(@RequestBody CompanyRequest companyRequest){
        return companyService.update(companyRequest);
    }

    @DeleteMapping
    public void delete(int id){
        companyService.delete(id);
    }
}
