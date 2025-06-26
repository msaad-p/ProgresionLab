package org.example;

public abstract class Progresion {
    protected long valor;

    public Progresion() {
        this.valor = 0;
    }

    public Progresion(long s) {
        this.valor = s;
    }

    public long sigValor() {
        long temp = this.valor;
        avanzar();
        return temp;
    }

    protected abstract void avanzar();

    public void imprimirP(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(sigValor() + " ");
        }
        System.out.println();
    }
}