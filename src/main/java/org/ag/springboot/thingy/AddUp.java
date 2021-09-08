package org.ag.springboot.thingy;

public class AddUp {

    public String addTwoNumbers(int a, int b) {
        return String.format("%d + %d = %d", a, b, getAnswer(a,b));
    }

    private int getAnswer(int a, int b){
        return a+b;
    }
}


