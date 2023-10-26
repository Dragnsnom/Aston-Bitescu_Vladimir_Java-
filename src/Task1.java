import java.util.Scanner;

// Составить алгоритм: если введенное число больше 7, то вывести “Привет”

public class Task1 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        number = scanner.nextInt();

        if (number > 7){
            System.out.print("Привет");
        }
    }
}