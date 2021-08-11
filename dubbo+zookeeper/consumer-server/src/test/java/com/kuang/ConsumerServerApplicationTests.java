package com.kuang;

import com.kuang.consumer.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConsumerServerApplicationTests {

	@Autowired
	UserService userService;

	@Test
	public void contextLoads() {

		userService.bugTicket();

	}

}