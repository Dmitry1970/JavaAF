package Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "pineapple", "strawberry", "pear", "lemon", "melon", "mango", "kiwi", "peach", "banana" };
        Random rnd = new Random();
        int count = 0;
        System.out.println("Введите слово: ");
        while (true) {
            int random = rnd.nextInt(fruits.length);
            String fruit = fruits[random];
            System.out.println(fruit);   // для контроля случайного слова
            int countRandomFruit = fruit.length();
            Scanner sc = new Scanner(System.in);
            String word = sc.next();
            if (word.length() == fruit.length()) {
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 0; j < word.length(); j++) {
                        if (word.charAt(i) == fruit.charAt(i)) {
                            count++;
                        } else {
                            continue;
                        }
                    }
                    if (countRandomFruit == count) {
                        System.out.println("Поздравляем, вы выиграли");
                        return;
                    }
                }
            } else {
                System.out.println(word.length() + " " + fruit.length());
                for (int i = 0; i < word.length(); i++) {
                    for (int j = 0; j < fruit.length(); j++) {
                        if (word.charAt(i) == fruit.charAt(j) && word.charAt(i) == fruit.charAt(i)) {
                            count++;

                        } else {
                            continue;
                        }
                    }
                }
                System.out.println("Вы ввели неправильное слово");
                System.out.println("Количество символов на своих местах: " + count);
                System.out.println("Введите слово заново: ");
                count = 0;
            }
        }
    }
}
