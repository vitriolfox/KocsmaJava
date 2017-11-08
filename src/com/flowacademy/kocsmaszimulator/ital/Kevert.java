package com.flowacademy.kocsmaszimulator.ital;

public class Kevert extends Ital {

    public Kevert(Ital ital1, Ital ital2, int ar) {
        super (ar);
        this.setAlkoholtartalom((ital1.getAlkoholtartalom() + ital2.getAlkoholtartalom()) / 2);
    }

    public Kevert(Ital ital1, Ital ital2, Ital ital3, int ar) {
        super (ar);
        this.setAlkoholtartalom((ital1.getAlkoholtartalom() + ital2.getAlkoholtartalom()
                + ital3.getAlkoholtartalom()) / 3);
    }

    public Kevert(Ital ital1, Ital ital2, Ital ital3, Ital ital4, int ar) {
        super (ar);
        this.setAlkoholtartalom((ital1.getAlkoholtartalom() + ital2.getAlkoholtartalom()
                + ital3.getAlkoholtartalom() + ital4.getAlkoholtartalom()) / 4);
    }


}
