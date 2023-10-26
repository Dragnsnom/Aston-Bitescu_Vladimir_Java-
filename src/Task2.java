import java.util.Objects;
import java.util.Scanner;
// Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
public class Task2 {

    public static void main(String[] args){

        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        name = scanner.next();

        System.out.println(name);

        String out = (Objects.equals(name, "Вячеслав")) ? "Привет, Вячеслав":"Нет такого имени";
        System.out.println(out);
    }
}
