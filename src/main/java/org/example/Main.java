package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-Progresión 1: 3 números de una progresión aritmética que empieza en 5 y avanza con incrementos de 3.");
        Aritmetica ar1 = new Aritmetica(3, 5);
        ar1.imprimirP(3);

        System.out.println("\n-Progresión 2: 3 números de una progresión geométrica que empieza en 3 y avanza con una base de 2.");
        Geometrica geo2 = new Geometrica(2, 3);
        geo2.imprimirP(3);

        System.out.println("\n-Progresión 3: 10 números de una progresión de Fibonacci.");
        Fibonacci fib3 = new Fibonacci();
        fib3.imprimirP(10);

        System.out.println("\n-Círculo: radio 2.");
        Circulo circulo1 = new Circulo(2);
        System.out.println("Área: " + circulo1.calcularArea());
        System.out.println("Perímetro: " + circulo1.calcularPerimetro());

        System.out.println("\n-Rectángulo: ancho 5 y altura 10.");
        Rectangulo rectangulo1 = new Rectangulo(5, 10);
        System.out.println("Área: " + rectangulo1.calcularArea());
        System.out.println("Perímetro: " + rectangulo1.calcularPerimetro());

        System.out.println("\n-Triángulo: base 2 y altura 3.");
        Triangulo triangulo1 = new Triangulo(2, 3);
        System.out.println("Área: " + triangulo1.calcularArea());
        System.out.println("Perímetro: " + triangulo1.calcularPerimetro());
    }
}