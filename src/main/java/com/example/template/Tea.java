package com.example.template;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverage{

    @Override
    void brew() {
        System.out.println("티를 끓이는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("Tea에 첨가제를 넣는중..");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if ( answer.toLowerCase().startsWith("y") ) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void boilWater() {
        System.out.println("Tea를 끓이고 있습니다.");
    }

    private String getUserInput() {
        String answer = null;

        System.out.print("Tea에 첨가물을 넣어 드릴까요? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (Exception e) {
            System.err.println("IO Error");
        }
        return answer;
    }
    
}
