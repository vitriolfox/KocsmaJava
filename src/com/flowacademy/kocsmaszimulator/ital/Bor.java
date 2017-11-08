package com.flowacademy.kocsmaszimulator.ital;

public class Bor extends Ital {
    private int evjarat;

    public Bor(String nev, int alkoholtartalom, int ar, int evjarat) {
        super(nev, alkoholtartalom, ar);
        this.evjarat = evjarat;
    }

    public int getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(int evjarat) {
        this.evjarat = evjarat;
    }
}
