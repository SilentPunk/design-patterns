package com.company.loggers;

import com.company.interfaces.LogStrategy;

import java.sql.Timestamp;

public class DateLogger implements LogStrategy {


    @Override
    public void log(String logInformation) {
        System.out.println(new Timestamp(System.currentTimeMillis()) + " " + logInformation);
    }
}
