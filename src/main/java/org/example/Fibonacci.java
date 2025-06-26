package org.example;

public class Fibonacci extends Progresion {
    protected long prev;

    public Fibonacci() {
        this(1, 0);
    }

    public Fibonacci(long valorPrev, long valorInicial) {
        super(valorInicial);
        this.prev = valorPrev;
    }

    @Override
    protected void avanzar() {
        long next = this.valor + this.prev;
        this.prev = this.valor;
        this.valor = next;
    }
}