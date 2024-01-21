package com.rmieg;

import java.rmi.Naming;

public class ClientEg {
    public static void main(String[] args) {
        try {
           RMIDEMO demo = (RMIDEMO) Naming.lookup("rmi://localhost:5000/jbc");

            double p = 1000;
            double r = 5;
            double t = 2;
            double simpleInterest = demo.SimpleInterest(p, r, t);
            System.out.println("Interest: " + simpleInterest);

            double number = 5;
            double cube = demo.Cube(number);
            System.out.println("Cube of " + number + ": " + cube);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

