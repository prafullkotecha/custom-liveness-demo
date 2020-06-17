package com.example.customlivenessdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    private CustomHealthState customHealthState;

    public HealthController(CustomHealthState customHealthState) {
        this.customHealthState = customHealthState;
    }

    @GetMapping("/turnOff")
    public ResponseEntity<?> onOff() {
        customHealthState.switchOff();
        return new ResponseEntity<>(HttpStatus.OK);
    }
}