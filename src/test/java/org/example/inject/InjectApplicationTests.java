package org.example.inject;

import org.example.inject.service.EmailSender;
import org.example.inject.service.fake.FakeEmailSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class InjectApplicationTests {

	@TestConfiguration
	static class TestConfig {
		@Bean
		@Primary
		public EmailSender getEmailSender() {
			return new FakeEmailSender();
		}
	}

	@Autowired
	EmailSender emailSender;

	@Test
	void contextLoads() {
		emailSender.send();
	}
}
