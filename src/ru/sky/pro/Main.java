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

        // Задание 6* повышенная сложность
        System.out.println("Задание 6*");

        int age = 19;
        int salary = 58000;

        int ageBorder = 23;
        int salaryBorderMin = 50_000;
        int salaryBorderMax = 80_000;
        float limit = 1f;
        int limitAgeMin = 2;
        int limitAgeMax = 3;
        float limitSalaryMin = 1.2f;
        float limitSalaryMax = 1.5f;

        if (age < ageBorder) {
            if (salary < salaryBorderMin) {
                limit = salary * limitAgeMin;
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
            }
            if (salary >= salaryBorderMin && salary < salaryBorderMax) {
                if (limitAgeMin > limitSalaryMin) {
                    limit = salary * limitAgeMin;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                } else {
                    limit = salary * limitSalaryMin;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                }
            }
            if (salary >= salaryBorderMax) {
                if (limitAgeMin > limitSalaryMax) {
                    limit = salary * limitAgeMin;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                } else {
                    limit = salary * limitSalaryMax;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                }
            }
        }

        if (age >= ageBorder) {
            if (salary < salaryBorderMin) {
                limit = salary * limitAgeMax;
                System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
            }
            if (salary >= salaryBorderMin && salary < salaryBorderMax) {
                if (limitAgeMax > limitSalaryMin) {
                    limit = salary * limitAgeMax;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                } else {
                    limit = salary * limitSalaryMin;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                }
            }
            if (salary >= salaryBorderMax) {
                if (limitAgeMax > limitSalaryMax) {
                    limit = salary * limitAgeMax;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                } else {
                    limit = salary * limitSalaryMax;
                    System.out.println("Мы готовы выдать Вам кредитную карту с лимитом " + limit + " рублей.");
                }
            }
        }

        // Задание 7* повышенная сложность
        System.out.println("Задание 7*");

        int age7 = 25; //у меня же просто "age" уже используется в предыдущей задаче,
        int salary7 = 60_000; //а с task'ами я еще не умею работать
        int wantedSum = 330_000;

        float baseRate = 1 + 0.1f;
        int period = 12;
        float paymentMonthMax = salary7 * 0.5f;
        int age7BorderMin = 23;
        int age7BorderMax = 30;
        float rateAgePlusMax = 0.01f;
        float rateAgePlusMin = 0.005f;
        int salary7Border = 80_000;
        float rateSalaryMinus = 0.007f;

        //возраст меньше 23, доход меньше 80_000
        if (age7 < age7BorderMin) {
            if (salary7 < salary7Border) {
                float creditSum = wantedSum * (baseRate + rateAgePlusMax);
                float paymentMonthReal = creditSum / period;
                if (paymentMonthMax < paymentMonthReal) {
                    System.out.println("В предоставлении1 кредита отказано.");
                } else {
                    System.out.println("Максимальный1 платеж при доходе " + salary7 + " равен " + paymentMonthMax +
                            " рублей. Платеж по кредиту составляет " + paymentMonthReal + " рублей. Кредит одобрен");
                }
            }
            //возраст меньше 23, доход больше 80_000
            if (salary7 >= salary7Border) {
                float creditSum = wantedSum * (baseRate + rateAgePlusMax - rateSalaryMinus);
                float paymentMonthReal = creditSum / period;
                if (paymentMonthMax < paymentMonthReal) {
                    System.out.println("В предоставлении2 кредита отказано.");
                } else {
                    System.out.println("Максимальный2 платеж при доходе " + salary7 + " равен " + paymentMonthMax +
                            " рублей. Платеж по кредиту составляет " + paymentMonthReal + " рублей. Кредит одобрен");
                }
            }
        }
        //возраст 23-30, доход меньше 80_000
        if (age7 >= age7BorderMin && age7 < age7BorderMax) {
            if (salary7 < salary7Border) {
                float creditSum = wantedSum * (baseRate + rateAgePlusMin);
                float paymentMonthReal = creditSum / period;
                if (paymentMonthMax < paymentMonthReal) {
                    System.out.println("В предоставлении3 кредита отказано.");
                } else {
                    System.out.println("Максимальный3 платеж при доходе " + salary7 + " равен " + paymentMonthMax +
                            " рублей. Платеж по кредиту составляет " + paymentMonthReal + " рублей. Кредит одобрен");
                }
            }
            //возраст 23-30, доход больше 80_000
            if (salary7 >= salary7Border) {
                float creditSum = wantedSum * (baseRate + rateAgePlusMin - rateSalaryMinus);
                float paymentMonthReal = creditSum / period;
                if (paymentMonthMax < paymentMonthReal) {
                    System.out.println("В предоставлении4 кредита отказано.");
                } else {
                    System.out.println("Максимальный4 платеж при доходе " + salary7 + " равен " + paymentMonthMax +
                            " рублей. Платеж по кредиту составляет " + paymentMonthReal + " рублей. Кредит одобрен");
                }
            }
        }
        //возраст больше 30, доход меньше 80_000
        if (age7 >= age7BorderMax) {
            if (salary7 < salary7Border) {
                float creditSum = wantedSum * baseRate;
                float paymentMonthReal = creditSum / period;
                if (paymentMonthMax < paymentMonthReal) {
                    System.out.println("В предоставлении5 кредита отказано.");
                } else {
                    System.out.println("Максимальный5 платеж при доходе " + salary7 + " равен " + paymentMonthMax +
                            " рублей. Платеж по кредиту составляет " + paymentMonthReal + " рублей. Кредит одобрен");
                }
            }
            //возраст больше 30, доход больше 80_000
            if (salary7 >= salary7Border) {
                float creditSum = wantedSum * (baseRate - rateSalaryMinus);
                float paymentMonthReal = creditSum / period;
                if (paymentMonthMax < paymentMonthReal) {
                    System.out.println("В предоставлении6 кредита отказано.");
                } else {
                    System.out.println("Максимальный6 платеж при доходе " + salary7 + " равен " + paymentMonthMax +
                            " рублей. Платеж по кредиту составляет " + paymentMonthReal + " рублей. Кредит одобрен");
                }
            }
        }

    }}




