package com.company.strategy;

import com.company.interfaces.LogStrategy;

public class LoggerStrategy {
    private LogStrategy logStrategy;

    public LoggerStrategy(LogStrategy logStrategy){
        this.logStrategy = logStrategy;
    }

    public void log(String message){
        logStrategy.log(message);
    }
}
