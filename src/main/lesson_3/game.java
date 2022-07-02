package main.lesson_3;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        System.out.println("Введите ваше имя:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Привет, лузер! Сыграем? Напиши да или нет");
        String name2 = scan.nextLine();

        if (Objects.equals(name2, "да")) {
            System.out.println("Смелая сосиска");
        }
            else {
                System.out.println("да сыграй, чё ты");
            }

            System.out.println("Попробуй угадать букву алфавита. ВВеди свой вариант: ");
            Scanner scan2 = new Scanner(System.in);
            String name3 = scan.nextLine();

            Random rand = new Random();
            String[] str = new String[33];

            String str0 = "а";
            String str1 = "б";
            String str2 = "в";
            String str3 = "г";
            String str4 = "д";
            String str5 = "е";
            String str6 = "ё";
            String str7 = "ж";
            String str8 = "з";
            String str9 = "и";
            String str10 = "й";
            String str11 = "к";
            String str12 = "л";
            String str13 = "м";
            String str14 = "н";
            String str15 = "о";
            String str16 = "п";
            String str17 = "р";
            String str18 = "с";
            String str19 = "т";
            String str20 = "у";
            String str21 = "ф";
            String str22 = "х";
            String str23 = "ц";
            String str24 = "ч";
            String str25 = "ш";
            String str26 = "щ";
            String str27 = "ь";
            String str28 = "ы";
            String str29 = "ъ";
            String str30 = "э";
            String str31 = "ю";
            String str32 = "я";


            if (rand.equals(name3)) {

                System.out.println("Вау, поздравляю");

            } else {
                System.out.println("ХА-ХА-ХА-ХА, пробуй ещё");
            }

        }
    }
