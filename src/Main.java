import java.time.LocalDate;

public class Main {

    public static int printIsLeapYear(int year) {
        boolean leapYear = (year % 400 == 0) || year % 4 == 0 && year % 100 != 0;
        if (leapYear) {
            System.out.printf("Год является високосным - %d \n", year);
        } else {
            System.out.printf("Год не является високосным - %d \n", year);
        }
        return year;
    }

    public static byte model(int operatingSystem) {
        byte clientOS2 = 0;
        byte Android2 = 1;
        if (operatingSystem == clientOS2) {
            System.out.println("Установите версию приложения для iOS");
        }
        if (operatingSystem == Android2) {
            System.out.println("Установите версию приложения для Android");
        }
        return clientOS2;
    }


    public static int yearOfRelease(int realese) {
        int currentYear = LocalDate.now().getYear();
        if (realese == currentYear) {
            System.out.println("полную.");
        } else {
            System.out.println("облегченную.");
        }
        return currentYear;
    }

    public static int deliveryDistance(int distance) {
        int day = 1;
        if (distance <= 20) {
            System.out.printf("дней на доставку - %d \n", day);
        }
        if (distance > 20 && distance <= 60) {
            System.out.printf("дней на доставку - %d \n", day + 1);
        }
        if (distance > 60 && distance <= 100) {
            System.out.printf("дней на доставку - %d \n", day + 2);
        }
        if (distance > 100) {
            System.out.println("Доставки нет!");
        }
        return day;
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1.");
        printIsLeapYear(2024);

    }

    public static void task2() {
        System.out.println("Задача 2.");
        model(1);
        yearOfRelease(2023);
    }

    public static void task3() {
        System.out.println("Задача 3.");
        deliveryDistance(36);
    }
}


