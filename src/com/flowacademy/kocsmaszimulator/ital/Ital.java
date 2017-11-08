package com.flowacademy.kocsmaszimulator.ital;

public class Ital {
    public Ital(int ar) {
        this.ar = ar;
    }

    public void setAlkoholtartalom(int alkoholtartalom) {
        this.alkoholtartalom = alkoholtartalom;
    }

    private String nev;
    private int alkoholtartalom;
    private int ar;

    public String getNev() {
        return nev;
    }

    public Ital(String nev, int alkoholtartalom, int ar) {
        this.nev = nev;
        this.alkoholtartalom = alkoholtartalom;
        this.ar = ar;
    }

    public int getAlkoholtartalom() {
        return alkoholtartalom;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return   nev +
                " alkoholtartalom = " + alkoholtartalom +
                ", ár = " + ar;
    }
}
