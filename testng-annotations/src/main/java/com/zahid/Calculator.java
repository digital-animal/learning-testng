package com.zahid;

public class Calculator {

    public Calculator() {
    }

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {

        return x * y;
    }

    public double div(double x, double y) {
        if(y == 0) return -1;
        return x / y;
    }

    public double mod(double x, double y) {
        if(y == 0) return -1;
        return x % y;
    }
    
    public double pow(int x, int n) {
        return Math.pow(x, n);
    }

    
}
