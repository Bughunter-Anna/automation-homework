package org.example;

import java.util.Scanner;

public class davaleba2 {

    public static void main(String[] args) {

        String correctUsername = "bughunter-anna";
        String correctPassword = "test123";

        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successsful");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}
