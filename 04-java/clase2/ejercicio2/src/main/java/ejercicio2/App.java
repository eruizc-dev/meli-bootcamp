package ejercicio2;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

class Contador {
    private int value = 0;

    public Contador() {
    }

    public Contador(int start) {
        this.value = start;
    }

    public Contador(Contador c) {
        this.value = c.getValue();
    }

    public int getValue() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }
}
