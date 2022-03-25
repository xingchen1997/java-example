package org.piki;

public class App {
    public static void main(String[] args) {
        System.out.println("Here are some Fibonacci numbers:");
        for (int i=1; i<=10; i++) {
            System.out.println(i + ": " + fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n <= 2) return 1;

        long a = 1, b = 1;
        for (int i=2; i<n; i++) {
            long t = a;
            a = b;
            b = b + t;
        }

        return b;
    }
}
