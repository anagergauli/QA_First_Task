//დავალება N3
//ტესტერმა შეამოწმა კონკრეტული ფუნქციონალი ხუთი ტესტ ქეისით.
// მასივში მოცემულია თითოეული ტესტის შედეგი:
//int[] testResults = {1, 0, 1, 1, 0};
//სადაც 1 არის Passed, ხოლო 0 არის Failed.
// დაწერეთ კოდი, რომელიც for ციკლის გამოყენებით დაითვლის წარმატებით და წარუმატებლად დასრულებული ტესტების რაოდენობას და დაბეჭდავს ორივე შედეგს.

package org.example;

public class Tests{
    public static void main(String[] args) {

        int[] testResults = {1, 0, 1, 1, 0};

        int passed = 0;
        int failed = 0;

        for (int i = 0; i < testResults.length; i++) {

            if (testResults[i] == 1) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Passed tests: " + passed);
        System.out.println("Failed tests: " + failed);
    }
}
