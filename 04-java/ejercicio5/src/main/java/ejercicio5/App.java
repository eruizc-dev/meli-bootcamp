package ejercicio5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        InputReader reader = new InputReader();
        int n = reader.readInt("Cantidad de números a buscar(n): ");
        int m = reader.readInt("Cantidad de dígitos repetidos(m): ");
        int d = reader.readInt("Dígito repetido(d): ");
        List<Integer> nums = findNumbers(n, m, d);
        System.out.println(nums);
    }

    private static List<Integer> findNumbers(int n, int m, int d) {
        List<Integer> nums = new ArrayList<Integer>(n);

        for (int i = 1; nums.size() < n; i++) {
            int count = 0;
            char[] charArray = toCharArray(String.valueOf(i));

            for (char c: charArray) {
                if (c == String.valueOf(d).charAt(0))
                    count++;
            }

            if (count == m)
                nums.add(i);
        }

        return nums;
    }

    private static char[] toCharArray(String str) {
        int len = str.length();
        char[] chArray = new char[len];
        for (int i = 0; i < len; i++) {
            chArray[i] = str.charAt(i);
        }
        return chArray;
    }
}

class InputReader {

    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    protected void finalize() {
        scanner.close();
    }

    public int readInt(String text) {
        System.out.print(text);
        int n = scanner.nextInt();
        return n;
    }
}
