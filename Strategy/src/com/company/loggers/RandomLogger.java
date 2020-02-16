package com.company.loggers;

import com.company.interfaces.LogStrategy;

import java.util.UUID;

public class RandomLogger implements LogStrategy {
    @Override
    public void log(String logInformation) {
        System.out.println(UUID.randomUUID().toString() + " " + logInformation);
    }
}
