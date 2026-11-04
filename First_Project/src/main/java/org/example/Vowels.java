//დავალება N5
//შექმენით String ტიპის ცვლადი და დაწერეთ კოდი, რომელიც:
//● for ციკლის გამოყენებით დაითვლის სტრინგში ხმოვანი ასოების რაოდენობას და დაბეჭდავს
//● იპოვის სტრინგის სიგრძეს და დაბეჭდავს მას
//● შეამოწმებს სტრინგის სიგრძე ლუწია თუ კენტი. თუ სიგრძე ლუწი რიცხვია,დაბეჭდოს "ლუწი", ხოლო თუ კენტია დაბეჭდავს "კენტი".

package org.example;

public class Vowels {
    public static void main(String[] args) {

        String text = "Hello World";

        int vowels = 0;

        for (int i = 0; i < text.length(); i++) {

            char letter = Character.toLowerCase(text.charAt(i));

            if (letter == 'a' || letter == 'e' ||
                    letter == 'i' || letter == 'o' ||
                    letter == 'u') {

                vowels++;
            }
        }

        System.out.println("Vowels: " + vowels);

        int length = text.length();

        System.out.println("String length: " + length);

        if (length % 2 == 0) {
            System.out.println("ლუწი");
        } else {
            System.out.println("კენტი");
        }
    }
}