public class Main {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void printOSVersion(byte clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Некорректное значение clientOS: " + clientOS);
        }
    }

    public static int calcDeliveryDays(int distance) {
        int deliveryDays = 1;

        if (distance > 20) {
            deliveryDays++;
        }
        if (distance > 60) {
            deliveryDays++;
        }
        if (distance > 100) {
            deliveryDays = -1; // no delivery to that area
        }
        return deliveryDays;
    }

    // Метод для задачи: homeworkConditionals -> Task3
    public static void Task1() {
        int year = 40;

        if (isLeapYear(year)) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    // Метод для задачи: homeworkConditionals -> Task2
    public static void Task2() {
        byte clientOS = 4; // 0 — iOS, 1 — Android
        int clientDeviceYear = 2018;

        printOSVersion(clientOS, clientDeviceYear);
    }

    // Метод для задачи: homeworkConditionals -> Task4
    public static void Task3() {
        int deliveryDistance = 21;
        int deliveryDays = calcDeliveryDays(deliveryDistance);

        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставка в ваш регион недоступна");
        }
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }
}