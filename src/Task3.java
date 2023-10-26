import java.util.Scanner;
// Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
public class Task3 {

    public static void main(String[] args) {
        int[] myArray;
        int size;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        size = scanner.nextInt();

        myArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            int number = scanner.nextInt();
            myArray[i] = number;
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 3 == 0) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}
