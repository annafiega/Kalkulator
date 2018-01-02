package com.kodilla;

class Calculator
{

    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }

}

class Application
{
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int x = calculator.addAToB(2,2);
        int y =calculator.substractAFromB(10,3);
        System.out.println(x);
        System.out.println(y);
    }
}