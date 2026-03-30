package com.demo.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class AppApplicationTests {

	// @Test
	// void contextLoads() {
	// }

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void generarHash() {
		System.out.println(passwordEncoder.encode("admin123"));
	}

}
