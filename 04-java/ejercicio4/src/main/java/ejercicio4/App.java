package ejercicio4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        int n = getNumber();
        List<Integer> primes = getPrimes(n + 1);
        System.out.println(primes);
    }

    public static int getNumber() {
        System.out.print("Ingrese un número: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static List<Integer> getPrimes(int max) {
        if (max <= 2)
            return new ArrayList<Integer>();

        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);

        for (int i = 3; i < max; i += 2) {
            boolean isPrime = true;
            for (int p: primes) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes.add(i);
        }

        return primes;
    }
}
