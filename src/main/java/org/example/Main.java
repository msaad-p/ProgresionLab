package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("-Progresión 1: 5 números, empieza en 6, avanza de uno en uno.");
        Progresion p1 = new Progresion(6);
        p1.imprimirP(5);

        System.out.println("\n-Progresión 2: 6 números, progresión aritmética, empieza en 7, incrementos de 3.");
        Aritmetica ar2 = new Aritmetica(3, 7);
        ar2.imprimirP(6);

        System.out.println("\n-Progresión 3: 5 números, progresión geométrica, empieza en 3, base de 6.");
        Geometrica geo3 = new Geometrica(6, 3);
        geo3.imprimirP(5);

        System.out.println("\n-Progresión 4: 10 números de una progresión de Fibonacci.");
        Fibonacci fib4 = new Fibonacci();
        fib4.imprimirP(10);
    }
}