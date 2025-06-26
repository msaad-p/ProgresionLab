package org.example;

public class Geometrica extends Progresion {
    protected long base;

    public Geometrica() {
        this(2, 1);
    }

    public Geometrica(long b) {
        this(b, 1);
    }

    public Geometrica(long b, long s) {
        super(s);
        this.base = b;
    }

    @Override
    protected void avanzar() {
        this.valor *= this.base;
    }
}