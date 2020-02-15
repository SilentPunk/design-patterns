package com.company;

import com.company.decorators.AuthorDecorator;
import com.company.decorators.CopyRightsDecorator;
import com.company.interfaces.Printer;
import com.company.printers.BookPrinter;

public class Main {

    public static void main(String[] args) {
        System.out.println("Print only lorem ipsum");
        new BookPrinter().print();

        System.out.println("\nPrint with CopyRight");
        new CopyRightsDecorator(new BookPrinter()).print();

        System.out.println("\nPrint with Author");
        new AuthorDecorator(new BookPrinter(), "Arthur").print();

        System.out.println("\nPrint with Author and Copy Rights");
        new AuthorDecorator(new CopyRightsDecorator(new BookPrinter()), "Arthur").print();
    }
}
