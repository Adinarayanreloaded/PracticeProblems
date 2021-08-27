package com.company;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        
       int a = 4;   
        int b = 17;
        int c =6;
       int sum = a + b+c;
       System.out.println(sum);

      
    float subject1 = 45;
    float subject2 = 95;
    float subject3 = 48;
    float cgpa = (subject1 + subject2 +subject3)/30;
    System.out.println(cgpa);

        
        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
       String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

        
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }

}
