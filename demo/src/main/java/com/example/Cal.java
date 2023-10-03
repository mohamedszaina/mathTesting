package com.example;

public class Cal {

    public double testDivision(double a, double b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    public String getGrade(int mark) {
        if (mark > 100) {
            return "Invalid";
        } else if (mark >= 90) {
            return "Excellent";
        } else if (mark >= 80) {
            return "Very Good";
        } else if (mark >= 70) {
            return "Good";
        } else if (mark >= 60) {
            return "Accepted";
        } else if (mark >= 40) {
            return "Failed";
        } else if (mark > 0) {
            return "Invalid";
        } else if (mark == 0) {
            return "Invalid";
        } else {
            return "Invalid";
        }
    }

}
