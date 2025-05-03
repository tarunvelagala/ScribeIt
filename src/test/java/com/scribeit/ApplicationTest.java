package com.scribeit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTest {

	@Test
	void contextLoads() {
	}

	@Test
	void testScribeItApplication() {
		Application.main(new String[] {});
	}

}
