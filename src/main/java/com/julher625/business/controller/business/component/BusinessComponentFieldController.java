package com.julher625.business.controller.business.component;

import com.julher625.business.models.bussines.component.BusinessComponentField;
import com.julher625.business.service.business.component.BusinessComponentFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/business_field")
public class BusinessComponentFieldController {

    @Autowired
    BusinessComponentFieldService businessComponentFieldService;

    @GetMapping
    public List<BusinessComponentField> getBusinessFields(){
        List<BusinessComponentField> prueba = businessComponentFieldService.getAll();
        for (BusinessComponentField field: prueba) {
            System.out.println(field);
        }


        return businessComponentFieldService.getAll();
    }


}
