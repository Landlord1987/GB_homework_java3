import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    /**
     * A program that guesses a random number from 0 to 9 and the user is given 3 attempts to guess!
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
        } while (counter != 3);
        System.out.println("�� �� �������, �� �� ������ ������ ����������� �����\n");

    }

    public static void task2() {
        String[] words = {"apple"
//                , "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
//                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
//                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };

        char[] answer = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};


        Random rand = new Random();
        int index = rand.nextInt(words.length);
        String str = words[index];
        int i = 0;
        System.out.println(words[index]);

        System.out.println("����� ������� ����� �� ����� �����:");
        System.out.println("\"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\", \"avocado\", \"broccoli\", \"carrot\",\n" +
                "                \"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", \"mushroom\", \"nut\", \"olive\", \"pea\",\n" +
                "                \"peanut\", \"pear\", \"pepper\", \"pineapple\", \"pumpkin\", \"potato\"");
        System.out.println("���������� ������� ���!");

        String enter;

        do {
            enter = scanner.nextLine();
            //char[] ent = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
//            for(int j = 0; j < enter.length(); j++){
//                System.out.println(enter.length());
//
//                ent[j] = enter.charAt(j);
//            }
            //char ent = enter.charAt(i);
            //char a = str.charAt(i);
            for (int j = 0; j < enter.length(); j++) {
                if (enter.charAt(j) == str.charAt(j)) {
                    answer[j] = enter.charAt(j);
                    System.out.print(answer[j]);
                }

                //System.out.print(answer[i]);
            }

            i++;
            if (enter == words[index]) {
                System.out.println("�� ������� �����!");
            }
        } while (enter != words[index]);
    }

    public static void main(String[] args) {

        boolean f = true;
        while (f) {
            System.out.println("�������� �������:");
            System.out.println("1 - ������ ����� �� 0 �� 9");
            System.out.println("2 - �������, ����� �����, ��� ��� ������ Task2. ��� �� ����");
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