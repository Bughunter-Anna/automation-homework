package org.example;

public class davaleba5 {
    public static void main(String[] args) {

     String text = "შეშა არარი";

     int xmovaniAsoebi = 0;

     for (int i = 0; i < text.length(); i++) {
         char letter = text.charAt(i);

         if (letter == 'ა' ||letter == 'ე' || letter == 'ი' ||letter == 'ო' || letter == 'უ') {
             xmovaniAsoebi++;


         }
     }

        System.out.println("ხმოვნები:"+xmovaniAsoebi);

      int sigrdze = text.length();
        System.out.println("ტექსტის სიგრძე:"+ sigrdze);

        if (sigrdze % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }

      }
    }

