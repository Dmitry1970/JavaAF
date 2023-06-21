package com.mypackage.javalearning;

import java.util.Random;
import java.util.Scanner;

public class FruitArray {

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pineapple", "strawberry", "pear", "lemon", "melon", "mango", "kiwi", "peach", "banana" };
        Random rnd = new Random();
        int random = rnd.nextInt(fruits.length);
        String fruit = fruits[random];
        System.out.println(fruit);   // для контроля случайного слова
        System.out.println("Введите слово: ");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int countRandomFruit = fruit.length();
        while (true) {
            String word = sc.next();
            count = 0;
            if (word.length() <= fruit.length()) {
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == fruit.charAt(i)) {
                        count++;
                        if (countRandomFruit == count) {
                            System.out.println("Поздравляем, вы выиграли");
                            return;
                        }
                    }
                }
            } else {
                       for(int j = 0; j < fruit.length(); j++) {
                        if (word.charAt(j) == fruit.charAt(j)) {
                            count++;
                        }
                    }
                }
            System.out.println("Слово не угадали. На своих местах " + count + " букв(ы). Попробуйте снова");
            }
        }
    }