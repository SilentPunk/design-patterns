package com.company.loggers;

import com.company.interfaces.LogStrategy;

public class SimpleLogger implements LogStrategy {


    @Override
    public void log(String logInformation) {
        System.out.println(logInformation);
    }
}
