package com.javapractice.variable_and_datatype;

import java.util.Scanner;

public class Print_name_age_mark {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Name;       
        int Age, Mark;

        System.out.println("Please enter your Name:");
        Name = sc.nextLine();

        System.out.println("Please enter your Age:");
        Age = sc.nextInt();

        System.out.println("Please enter your Mark:");
        Mark = sc.nextInt();

        System.out.println("THANKS FOR SHARING INFORMATION!!");
        System.out.println("HERE IS YOUR DETAIL SUMMARY:");
        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.println("Mark: " + Mark);

        sc.close();
    }
}

