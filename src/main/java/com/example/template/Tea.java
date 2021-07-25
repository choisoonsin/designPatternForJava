package com.example.template;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("티를 끓이는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea에 첨가제를 넣는중..");
    }
    
}
