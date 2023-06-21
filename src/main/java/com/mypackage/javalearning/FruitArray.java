package com.mypackage.javalearning;

import java.util.Random;
import java.util.Scanner;

public class FruitArray {

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pineapple", "strawberry", "pear", "lemon", "melon", "mango", "kiwi", "peach", "banana"};
        Random rnd = new Random();
        int random = rnd.nextInt(fruits.length);
        String fruit = fruits[random];
        System.out.println("Введите слово: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String word = sc.next();
            if (word.equals(fruit)) {
                System.out.println("Поздравляем, вы выиграли");
                return;
            }

            int count = 0;
            for (int i = 0; i < Math.min(word.length(), fruit.length()); i++) {
                if (word.charAt(i) == fruit.charAt(i)) {
                    count++;
                }
            }
            System.out.println("Слово не угадали. На своих местах " + count + " букв(ы). Попробуйте снова");
        }
    }
}