import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Logger logger = Logger.getInstance();
                logger.log("Запускаем программу");
                System.out.println("Привет, введи два числа, размер списка N и верхнюю границу значений элементов в списке M");
                logger.log("Просим пользователя ввести входные данные для списка");
                System.out.println("Введи размер списка:");
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                System.out.println("Введите верхнюю границу для значений:");
                int M = scanner.nextInt();
                logger.log("Создаём и наполняем список");
                Random random = new Random();
                List<Integer> sourse = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    sourse.add(i, random.nextInt(M));
                }
                StringBuilder sb = new StringBuilder();
                sourse.forEach(x -> sb.append(x).append(" "));
                System.out.println("Вот случайный список: " + sb);
                logger.log("Просим пользователя ввести входные данные для фильтрации");
                System.out.println("Введите порог для фильтра:");
                int f = scanner.nextInt();
                Filter filter = new Filter(f);
                logger.log("Запускаем фильтрацию");
                filter.filterOut(sourse);
                logger.log("Завершаем программу");
                break;
            } catch (Exception e) {
                System.out.println("Введи верные значения");
            }
        }
    }
}
