package org.example;

 import java.util.Scanner;

public class davaleba4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("status:");
        String status = scanner.nextLine();

        switch (status) {
            case "NEW":
                System.out.println("Order received");
                break;
            case "PROCESSING":
                System.out.println("Order is Being Prepared");
                break;
            case "SHIPPED":
                System.out.println("Order is On the way");
                break;
            case "DELIVERED":
                System.out.println("Order Delivered");
                break;
            default:
                System.out.println("Unkwnown status");
        }


    }
}
