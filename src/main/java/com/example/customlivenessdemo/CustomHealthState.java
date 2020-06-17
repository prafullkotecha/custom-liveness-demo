package com.example.customlivenessdemo;

import org.springframework.stereotype.Component;

@Component
public class CustomHealthState {
    private boolean status = Boolean.TRUE;

    public void switchOff() {
        this.status = Boolean.FALSE;
    }

    public boolean isOn() {
        return this.status;
    }
}