package com.company;

import com.company.page.PageObserver;
import com.company.page.PageState;

public class Main {

    public static void main(String[] args) {

        PageState pageState = new PageState("State");

        for (int x = 0 ; x < 20 ; x++)
        new PageObserver(pageState);

        pageState.setPageState("New State");
    }
}
