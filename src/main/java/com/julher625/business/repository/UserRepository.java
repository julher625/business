package com.julher625.business.repository;

import com.julher625.business.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository  extends CrudRepository<User, Long> {

}
