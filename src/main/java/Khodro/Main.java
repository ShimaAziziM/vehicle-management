package Khodro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        String age = scanner.nextLine();

        System.out.println("What city do you live in?");
        String city = scanner.nextLine();

        System.out.println("My name is " + name + " I am " + age + " years old from " + city + ".");
    }
}
