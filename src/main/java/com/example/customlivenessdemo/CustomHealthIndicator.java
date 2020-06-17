package com.example.customlivenessdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealthIndicator implements HealthIndicator{

    private final CustomHealthState customHealthState;

    public CustomHealthIndicator(
        CustomHealthState customHealthState) {
        this.customHealthState = customHealthState;
    }

    @Override
    public Health health() {
        boolean isRunning = customHealthState.isOn();
        if (isRunning) {
            return Health.up().build();
        }
        return Health.down().build();
    }
}