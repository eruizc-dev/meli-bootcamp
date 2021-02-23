package ejercicio2;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = getMin(scanner);
        int max = getMax(scanner);
        printEvenNumbers(min, max);
        scanner.close();
    }

    public static int getMin(Scanner scanner) {
        System.out.print("Ingrese un número mínimo: ");
        return scanner.nextInt();
    }

    public static int getMax(Scanner scanner) {
        System.out.print("Ingrese un número máximo: ");
        return scanner.nextInt();
    }

    public static void printEvenNumbers(int start, int finish) {
        if (start % 2 == 1)
            start++;
        for (int i = start; i < finish; i += 2)
            System.out.println(i);
    }
}
