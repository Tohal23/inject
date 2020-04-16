package org.example.inject.service.fake;

import org.example.inject.service.EmailSender;

public class FakeEmailSender extends EmailSender {

    @Override
    public void send() {
        System.out.println("fake sender");
    }
}
