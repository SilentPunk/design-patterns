package com.company.decorators;

import com.company.interfaces.Printer;
import com.company.interfaces.PrinterDecorator;

public abstract class AbstractDecorator implements PrinterDecorator {
    private Printer printer;

    public AbstractDecorator(Printer printer){
        this.printer = printer;
    }

    @Override
    final public void print() {
        printer.print();
        additionalPrint();
    }

    public abstract void additionalPrint();


}
