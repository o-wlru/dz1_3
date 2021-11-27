package ru.sky.pro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("«Установите версию приложения для iOS по ссылке»");
        }
        if (clientOS == 1) {
            System.out.println("«Установите версию приложения для Android по ссылке»");
        }

        // Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");
            } else {
                System.out.println("«Установите версию приложения для iOS по ссылке»");
            }
        }
        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке»");
            } else {
                System.out.println("«Установите версию приложения для Android по ссылке»");
            }
        }

        // Задание 3
        System.out.println("Задание 3");
        {
            int year = 2021;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " - високосный год.");
            } else {
                System.out.println(year + " не является високосным годом.");
            }
        }


        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int result = 1;

        if (deliveryDistance > 20) {
            result++;
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            result++;
        }
        System.out.println("Для доставки потребуется дней:" + result);


    // Задание 5
        System.out.println("Задание 5");

    {
        int monthNumber = 17;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца нет.");

        }
    }


} }




