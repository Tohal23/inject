package org.example.inject.сontroller;

import org.example.inject.service.EmailSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/profiles")
public class ProfileResource {

    private final EmailSender emailSender;

    public ProfileResource(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    @PostMapping(path = "/action")
    public ResponseEntity<String> action() {
        emailSender.send();
        return new ResponseEntity<>("Send", HttpStatus.OK);
    }
}
