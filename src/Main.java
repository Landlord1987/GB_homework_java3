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
        System.out.println("����� ������� ����� �� 0 �� 9. � ��� 3 �������, ��� �� �������.");

        do {
            counter++;
            System.out.println("������� �����. ������� �" + counter + ":");
            boolean isNumber = scanner.hasNextInt();
            if (isNumber) {
                enter = scanner.nextInt();
                if (enter == random) {
                    System.out.println("�� �������, �� ���������� �� �����\n");
                    return;
                } else if (enter > random) {
                    System.out.println("�������. ���� ����� ������");
                } else if (enter < random) {
                    System.out.println("�������. ���� ����� ������");
                }
            } else {
                System.out.println("�� ����� ������������ �����. ��������� ������� �����.");
                scanner.nextLine();
            }
        } while (counter !=3);
        System.out.println("�� �� �������, �� �� ������ ������ ����������� �����\n");

    }

    public static void task2() {
        System.out.println("Process task2...");
    }

    public static void main(String[] args) {

        boolean f = true;
        while (f) {
            System.out.println("1 - ������ ����� �� 0 �� 9");
            System.out.println("2 - Task2");
            System.out.print("������� ����� ������ (0 - ����� �� ���������): ");

            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine();
                switch (num) {
                    case 0:
                        System.out.println("������ ���������� ���������");
                        f = false;
                        break;
                    case 1:
                        task1();
                        break;
                    case 2:
                        task2();
                        break;
                    default:
                        System.out.println("������ �������� �� ����������. ������� ����� ������ �����:");
                }
            } else {
                System.out.print("������ ������� �� ���������. ������� ����� ������ ������: ");
                scanner.nextLine();
            }
        }
    }
}