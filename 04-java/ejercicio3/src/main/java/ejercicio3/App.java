package ejercicio3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int n = getNumber();
        System.out.println(isPrime(n) ? "Es primo" : "No es primo");
    }

    public static int getNumber() {
        System.out.print("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static boolean isPrime(int n) {
        if (n != 2 && n % 2 == 0)
            return false;

        double limit = Math.sqrt(n);
        for (int i = 3; i < limit; i += 2) {
            if (n % i == 0)
                return false;
        }

        return true;
    }
}
