import java.util.ArrayList;
import java.util.Scanner;

public class TDList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();

        System.out.println("Список дел");
        while (true) {
            System.out.println("\n1. Добавить задачу");
            System.out.println("2. Показать все задачи");
            System.out.println("3. Выход");
            System.out.print("Выберите пункт: ");

            int choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Введите задачу: ");
                scanner.nextLine();
                String task = scanner.nextLine();
                tasks.add(task);
                System.out.println("Задача была добавлена");
            } else if(choice == 2){
                System.out.println("Ваши задачи");
                if (tasks.isEmpty()){
                    System.out.println("Ваш список задач пуст");
                } else {
                    for (int i = 0; i < tasks.size(); i++){
                        System.out.println((i + 1) + "." + tasks.get(i));
                    }
                }
            } else if (choice == 3){
                System.out.println("Всего доброго!");
                break;
            } else {
                System.out.println("Ошибка. Проверьте выбранный вами номер");
            }
        }
        scanner.close();
    }
}
