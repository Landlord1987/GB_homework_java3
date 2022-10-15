import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    /** A program that guesses a random number from 0 to 9 and the user is given 3 attempts to guess!
     *
     */
    public static void task1() {
        int random = (int) (Math.random() * 10);
        int enter = 0;
        int counter = 0;
        System.out.println("Робот загадал число от 0 до 9. у Вас 3 попытки, что бы угадать.");

        do {
            counter++;
            System.out.println("Введите число. Попытка №" + counter + ":");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                enter = scanner.nextInt();
                if (enter == random) {
                    System.out.println("Вы угадали, Вы победитель по жизни\n");
                    return;
                } else if (enter > random) {
                    System.out.println("Неверно. Ваше число больше");
                } else if (enter < random) {
                    System.out.println("Неверно. Ваше число меньше");
                }
            } else {
                System.out.println("Вы ввели некорректное число. Повторите попытку ввода.");
                scanner.nextLine();
            }
        } while (counter !=3);
        System.out.println("Вы не угадали, но Вы всегда можете попробовать снова\n");

    }

    public static void task2() {
        System.out.println("Process task2...");
    }

    public static void main(String[] args) {

        boolean f = true;
        while (f) {
            System.out.println("1 - Угадай число от 0 до 9");
            System.out.println("2 - Task2");
            System.out.print("Введите номер задачи (0 - выход из программы): ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();
                switch (num) {
                    case 0:
                        System.out.println("Работа приложения завершена");
                        f = false;
                        break;
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    default:
                        System.out.println("такого действия не существует. Введите номер задачи вновь:");
                }
            } else {
                System.out.print("Данные введены не корректно. Введите номер задачи заново: ");
                scanner.nextLine();
            }
        }
    }
}