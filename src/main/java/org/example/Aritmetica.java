package org.example;

public class Aritmetica extends Progresion {
    protected long incremento;

    public Aritmetica() {
        this(1, 0);
    }

    public Aritmetica(long in) {
        this(in, 0);
    }

    public Aritmetica(long in, long s) {
        super(s);
        this.incremento = in;
    }

    @Override
    protected void avanzar() {
        this.valor += this.incremento;
    }
}