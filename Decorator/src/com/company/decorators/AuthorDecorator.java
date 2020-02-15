package com.company.decorators;

import com.company.interfaces.Printer;

public class AuthorDecorator extends AbstractDecorator {
    private String authorName;

    public AuthorDecorator(Printer printer, String authorName){
        super(printer);
        this.authorName = authorName;
    }

    @Override
    public void additionalPrint() {
        System.out.println(String.format("Author is: %s", authorName));
    }
}
