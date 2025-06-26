package org.example;

public class Triangulo implements Shape {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        // Triángulo isósceles (?)
        double lado = Math.sqrt(Math.pow((this.base / 2), 2) + Math.pow(this.altura, 2));
        return 2 * lado + this.base;
    }
}