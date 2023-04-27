package io.cs.mbnakaya.aula1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Integer result = fibonacci(8);
        System.out.println("That's my Fibonacci: " + result);
    }

    private static Integer fibonacci(Integer index) {
        int n1 = 0, n2 = 1, n3 = 0;

        for(int i = 0; i < index; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }

        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        System.out.println("n3: " + n3);
        System.out.println();
        return n3;
    }
}
