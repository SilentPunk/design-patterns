package com.company.decorators;

import com.company.interfaces.Printer;
import com.company.interfaces.PrinterDecorator;

public class CopyRightsDecorator extends AbstractDecorator {

    public CopyRightsDecorator(Printer printer){
        super(printer);
    }

    @Override
    public void additionalPrint() {
        System.out.println("CopyRight to JavaPrinter");
    }
}
