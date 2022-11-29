package com.julher625.business;

import com.julher625.business.models.user.Role;
import com.julher625.business.models.user.User;
import com.julher625.business.repository.user.RoleRepository;
import com.julher625.business.repository.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusinessApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void saveUser(){
		Role dev = new Role("dev");
		Role admin = new Role("admin");
		dev = roleRepository.save(dev);
		admin = roleRepository.save(admin);


		User usr1 = new User("usr","1","usr1@usr.com");
		usr1.getRoles().add(admin);
		usr1.getRoles().add(dev);

		usr1 = userRepository.save(usr1);
		userRepository.delete(usr1);
		roleRepository.delete(dev);
		roleRepository.delete(admin);

	}

}
