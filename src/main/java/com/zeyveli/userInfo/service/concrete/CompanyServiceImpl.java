package com.zeyveli.userInfo.service.concrete;

import com.zeyveli.userInfo.model.entity.Company;
import com.zeyveli.userInfo.model.request.CompanyRequest;
import com.zeyveli.userInfo.model.response.CompanyResponse;
import com.zeyveli.userInfo.repository.CompanyRepository;
import com.zeyveli.userInfo.service.abstracts.CompanyService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    CompanyRepository companyRepository;
    ModelMapper modelMapper;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository, ModelMapper modelMapper) {
        this.companyRepository = companyRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public CompanyResponse create(CompanyRequest companyRequest) {
        Company company = modelMapper.map(companyRequest, Company.class);
        company = companyRepository.saveAndFlush(company);
        return modelMapper.map(company, CompanyResponse.class);
    }

    @Override
    public List<CompanyResponse> getAll() {
        List<Company> list = companyRepository.findAll();
        List<CompanyResponse> companyResponseList = null;
        for (Company company: list) {
            companyResponseList.add(modelMapper.map(company,CompanyResponse.class));
        }
        return companyResponseList;
    }

    @Override
    public CompanyResponse update(CompanyRequest companyRequest) {
        Company company = companyRepository.getById(companyRequest.getId());

        return modelMapper.map(company,CompanyResponse.class);
    }

    @Override
    public void delete(int id) {
       companyRepository.deleteById(id);
    }
}
