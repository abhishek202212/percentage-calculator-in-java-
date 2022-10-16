package com.example.demo;
import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {
    Scanner permittotakeinput=new Scanner(System.in); // taking permission to use powers of jaadu
    // taking input of marks from user
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\uD83D\uDE4F WELCOM TO 'CBSE' PERCENTAGE CALCULATOR \uD83D\uDE4F");
        System.out.println("-------------------------------------------------------------------");
        System.out.print("Enter Your MATHS Mark = ");
        int mark1=permittotakeinput.nextInt();
        System.out.print("Enter Your PHYSICS Mark = ");
        int mark2=permittotakeinput.nextInt();
        System.out.print("Enter Your CHEMISTRY Mark = ");
        int mark3=permittotakeinput.nextInt();
        System.out.print("Enter Your ENGLISH Mark = ");
        int mark4=permittotakeinput.nextInt();
        System.out.print("Enter Your IP Mark = ");
        int mark5=permittotakeinput.nextInt();
        // adding the marks of all subject
        int sum=mark1+mark2+mark3+mark4+mark5;
        float divide=(float)sum/5;
       // int percentage=divide*100;
        System.out.print("Percentage = ");
        System.out.println(divide+"%");
    }

}
