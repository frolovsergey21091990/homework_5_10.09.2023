public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        {
            int clientOS = 0;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        System.out.println("Задание 2");
        {
            int clientOS = 0;
            int clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else if (clientOS == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию для iOS по ссылке");
            } else if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию для Android по ссылке");
            }
        }
        System.out.println("Задание 3");
        {
            int year = 1585;
            int leapYear = 1584;
            if (year < leapYear) {
                System.out.println("в " + year + " году високосного года не было");
            }
            if (year > leapYear && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }

        }
        System.out.println("Задание 4");
        {
            int deliveryDistance = 101;
            int day = 1;
            if (deliveryDistance > 100) {
                System.out.println("Доставки нет");
            } else {
                if (deliveryDistance > 20) {
                    day++;
                }
                if (deliveryDistance > 60) {
                    day++;
                }
                System.out.println("Потребуется дней: " + day);
            }
        }
        System.out.println("Задание 5");
        {
            char monthNumber = 13;
            switch (monthNumber) {
                case 1, 2, 12:
                    System.out.println("Зима");
                    break;
                case 3, 4, 5:
                    System.out.println("Весна");
                    break;
                case 6, 7, 8:
                    System.out.println("Лето");
                    break;
                case 9, 10, 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("В году всего 12 месяцев");
            }
        }
    }
}
