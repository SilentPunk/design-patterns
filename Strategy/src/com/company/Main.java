package com.company;

import com.company.loggers.DateLogger;
import com.company.loggers.RandomLogger;
import com.company.loggers.SimpleLogger;
import com.company.strategy.LoggerStrategy;

public class Main {

    public static void main(String[] args) {
        new LoggerStrategy(new SimpleLogger()).log("Simple Logger");

        new LoggerStrategy(new DateLogger()).log("Date logger");

        new LoggerStrategy(new RandomLogger()).log("Random Logger");
    }
}
