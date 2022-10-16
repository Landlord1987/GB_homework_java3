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
        } while (counter != 3);
        System.out.println("Вы не угадали, но Вы всегда можете попробовать снова\n");

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

        System.out.println("Робот загадал слово из этого спика:");
        System.out.println("\"apple\", \"orange\", \"lemon\", \"banana\", \"apricot\", \"avocado\", \"broccoli\", \"carrot\",\n" +
                "                \"cherry\", \"garlic\", \"grape\", \"melon\", \"leak\", \"kiwi\", \"mango\", \"mushroom\", \"nut\", \"olive\", \"pea\",\n" +
                "                \"peanut\", \"pear\", \"pepper\", \"pineapple\", \"pumpkin\", \"potato\"");
        System.out.println("Попробуйте угадать его!");

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
                System.out.println("Вы угадали слово!");
            }
        } while (enter != words[index]);
    }

    public static void main(String[] args) {

        boolean f = true;
        while (f) {
            System.out.println("Выберите вариент:");
            System.out.println("1 - Угадай число от 0 до 9");
            System.out.println("2 - Учитель, дайте совет, как мне решить Task2. Сам не смог");
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