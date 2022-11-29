package com.julher625.business.repository.business.component;

import com.julher625.business.models.bussines.component.BusinessComponentField;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessComponentFieldRepository extends CrudRepository<BusinessComponentField, Long> {
}
