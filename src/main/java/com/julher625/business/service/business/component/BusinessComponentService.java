package com.julher625.business.service.business.component;

import com.julher625.business.models.bussines.component.BusinessComponent;
import com.julher625.business.repository.business.component.BusinessComponentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessComponentService {
    @Autowired
    private BusinessComponentRepository businessComponentRepository;

    public List<BusinessComponent> getAll(){
        return (List<BusinessComponent>) businessComponentRepository.findAll();
    }

}
