package ejercicio1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n = getNumber();
        printEvenNumbers(0, n);
    }

    public static int getNumber() {
        System.out.print("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static void printEvenNumbers(int start, int finish) {
        if (start % 2 == 1)
            start++;
        for (int i = start; i < finish; i += 2)
            System.out.println(i);
    }
}
