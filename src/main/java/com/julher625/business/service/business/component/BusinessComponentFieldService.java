package com.julher625.business.service.business.component;

import com.julher625.business.models.bussines.component.BusinessComponentField;
import com.julher625.business.repository.business.component.BusinessComponentFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusinessComponentFieldService {
    @Autowired
    private BusinessComponentFieldRepository businessComponentFieldRepository;

    public List<BusinessComponentField> getAll(){
        return (List<BusinessComponentField>) businessComponentFieldRepository.findAll();
    }
}
