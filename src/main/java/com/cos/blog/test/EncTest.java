package com.cos.blog.test;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncTest {
	
	@Test
	public void 해쉬_암호화() {
		String encPasssword = new BCryptPasswordEncoder().encode("1234");
		System.out.println("1234 해쉬" + encPasssword);
	}

}
