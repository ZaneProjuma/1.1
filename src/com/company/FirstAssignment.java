package com.company;

class Main {
    public static void main(String[] args) {
        short numberOne = -3;
        short numberTwo = 7;
        //Largest_Smallest
        if (numberTwo > numberOne) {
            System.out.println("NumberTwo is larger than NumberOne");
        }
        {
            System.out.println("NumberOne is smaller than NumberTwo");
        }
        //Equal
        if (numberTwo == numberOne) {
            System.out.println("NumberTwo equals NumberOne");
        }
        {
            System.out.println("NumberTwo equals NumberOne");
        }
        //Odd_Even
        {
            System.out.println("NumberOne is " + (numberOne % 2 != 0 ? "odd" : "even"));
        }
        {
            System.out.println("NumberOne is " + (numberOne % 3 != 0 ? "odd" : "even"));
        }
        //Negative_Positive
        if (numberOne < 0) {
            System.out.println("Number One is negative");
        } else {
            System.out.println("Number Two is positive");
        }
        if (numberTwo > 0) {
            System.out.println("Number Two is positive");
        } else {
            System.out.println("Number One is Negative");
        }
        //Less than 100
        if (numberOne < 100) {
            System.out.println("Number One is less than 100");
        } else if (numberTwo < 100) {
            System.out.println("Number Two is less than 100");
        } else
            System.out.println("None of the numbers is less than 100");
    }
} 





