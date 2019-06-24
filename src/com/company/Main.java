package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String hello = "Привет ";
        System.out.println("Добро пожаловать");
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        String result = hello + name;
        System.out.println(result);



    }
}
