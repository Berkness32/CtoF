package com.example.ctof;

public class Util {
    static double cToF(double celsius){
        double farenheit = 0.0;
        farenheit = (celsius * (9.0/5.0) + 32);

        return farenheit;
    }

    static double fToC(double farenheit){
        double celsius = 0.0;
        celsius = (farenheit - 32) * (5.0/9.0);
        return celsius;
    }
}
