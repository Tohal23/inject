package org.example.inject.config;

import org.example.inject.service.EmailSender;
import org.example.inject.service.fake.FakeEmailSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class FakeEmailSenderContext {

    @Bean
    @Primary
    public EmailSender fakeEmail() {
        return new FakeEmailSender();
    }

}
