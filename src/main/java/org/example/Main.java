package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      //  findEvenNumber();

        //feel to change any Parameter's you want.
        sumOfNumber(1234);
        multiplicationTable(5);
        productsOfDigits(4513);
    }

    //Write a program to print all even numbers between 1 - 100.
    public static void findEvenNumber(){
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    //Write a program to print multiplication table of any number.
    public static void multiplicationTable(int integer){
        for(int i = 0; i <= 12; i++){
            System.out.println(i * integer);
        }
    }

    //Write a program to find sum of first and last digit of a number.
    public static void sumOfNumber(int number){
        int total = 0;
        while(number != 0) {
            total = total + number % 10;
            number = number / 10 ;
        }
        System.out.println(total);
    }

    // Write a program to calculate product of digits of a number.

    public static void productsOfDigits(int number){
        // 1. run the loop till the number divided by 10 is 0;
        int product = 1;

        while (number != 0){
            product = product * (number % 10);

            number = number / 10;

         }
        System.out.println(product);
    }


    // Write a program to print a number in words.

    // Write a program to check whether a number is a Prime number or not
        //1. run a loop till the input and check if its divisible by previous numbers.


}