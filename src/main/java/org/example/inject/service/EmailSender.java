package org.example.inject.service;

import org.springframework.stereotype.Service;

@Service
public class EmailSender {

    public void send() {
        System.out.println("real sender");
    }

}
