package com.company.page;

import com.company.interfaces.Observer;

public class PageObserver implements Observer {
    private final PageState pageState;

    public PageObserver(PageState pageState){
        this.pageState = pageState;
        pageState.attach(this);
    }

    @Override
    public void update() {
        System.out.println(this.hashCode() + " " + pageState.getState());
    }
}
