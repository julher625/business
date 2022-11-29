package com.julher625.business.controller.business.component;

import com.julher625.business.models.bussines.component.BusinessComponent;

import com.julher625.business.service.business.component.BusinessComponentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/business")
public class BusinessComponentController {

    @Autowired
    private BusinessComponentService businessComponentService;

    @GetMapping()
    public List<BusinessComponent> getBusinessComponents(){
        return businessComponentService.getAll();
    }


}
