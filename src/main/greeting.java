package main;


    import java.util.Arrays;
import java.util.Scanner;

    // написать программу, которая приветствует пользователя в зависимости от введенных имени и возраста!
    public class greeting {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите ваше имя: ");
            String name = scanner.nextLine();
            System.out.println("Введите ваш возраст: ");
            int age = scanner.nextInt();
            //String name2 = scanner.nextLine();
            System.out.println(isMale(name));

        }

        private static String isMale(String name) {
            String[] letters = {"а", "е", "ё", "и", "у", "ы", "э", "о", "ю", "я"};
            String letter = name.substring(name.length() - 1);
            if (Arrays.asList(letters).contains(letter)) {
                return "Приветствую Вас, Леди!";
            } else {
                return "Приветствую Вас, Джентльмен!";
            }
        }

    }

