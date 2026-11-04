//დავალება N2
// დაწერეთ კოდი, რომელიც შეამოწმებს მომხმარებლის ავტორიზაციის მონაცემებს.
// წინასწარ განსაზღვრეთ სწორი მომხმარებლის სახელი (username) და პაროლი (password).
// თუ მომხმარებელი ორივე მონაცემს სწორად შეიყვანს, დაბეჭდეთ Login successful,
// თუ რომელიმე მაინც შეეშლება, დაბეჭდეთ Invalid username or password.
package org.example;
public class Users {
    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "12345";

        String username = "user";
        String password = "123456";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {

            System.out.println("Login successful");

        } else {
            System.out.println("Invalid username or password");
        }
    }
}



