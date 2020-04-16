package org.example.inject;

import org.example.inject.config.FakeEmailSenderContext;
import org.example.inject.service.EmailSender;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ContextConfiguration(classes = {InjectApplication.class, FakeEmailSenderContext.class})
@WebAppConfiguration
class InjectApplicationTests {

	@Autowired
	EmailSender emailSender;

	@Test
	void contextLoads() {
		emailSender.send();
	}
}
