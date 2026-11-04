// დავალება N1
//წარმოიდგინეთ, რომ ონლაინ მაღაზიაში ყიდულობთ პროდუქტს და დაწერეთ შემდეგი კოდი:
//● თუ პროდუქტის ფასი 100 ლარის ტოლი ან მეტია, მომხმარებელს გაუკეთებს 10% -იან ფასდაკლებას
//● სხვა შემთხვევაში პროდუქტის ფასი უცვლელი დარჩება
//● დაბეჭდავს საბოლოო ფასს.
package org.example;

public class Products {
    public static void main(String[] args) {

        double price = 90;
        double finalPrice;

        if (price >= 100) {
            finalPrice = price - (price * 0.10);
        } else {
            finalPrice = price;
        }

        System.out.println("Final price: " + finalPrice);
    }
}



