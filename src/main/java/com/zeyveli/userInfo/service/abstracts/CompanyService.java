package com.zeyveli.userInfo.service.abstracts;

import com.zeyveli.userInfo.model.request.CompanyRequest;
import com.zeyveli.userInfo.model.response.CompanyResponse;

import java.util.List;

public interface CompanyService {

    CompanyResponse create(CompanyRequest companyRequest);
    List<CompanyResponse> getAll();
    CompanyResponse update(CompanyRequest companyRequest);
    void delete(int id);
}
