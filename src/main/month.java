package main;

import java.util.Scanner;
// написать программу для вывода месяца и сезона
public class month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int name = Integer.parseInt(scanner.nextLine());

        String string = null;

        switch (name) {
            case 1: string = "Январь, зима";
                break;
            case 2: string = "Февраль, зима";
                break;
            case 3: string = "Март, весна";
                break;
            case 4: string = "Апрель, весна";
                break;
            case 5: string = "Май, весна";
                break;
            case 6: string = "Июнь, лето";
                break;
            case 7: string = "Июль, лето";
                break;
            case 8: string = "Август, лето";
                break;
            case 9: string = "Сентябрь, осень";
                break;
            case 10: string = "Октябрь, осень";
                break;
            case 11: string = "Ноябрь, осень";
                break;
            case 12: string = "Декабрь, зима";
                break;
            default: string = "нет такого месяца";
                break;
        }
        System.out.println(string);
    }
}
