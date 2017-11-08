package com.flowacademy.kocsmaszimulator.ember;

public class Kocsmaros extends Ember {
    private int penz;
    private static int KOSZOS_POHARAK_SZAMA = 0;

    public static int getKoszosPoharakSzama() {
        return KOSZOS_POHARAK_SZAMA;
    }



    public Kocsmaros(String nev, int kor, boolean nem, int penz) {
        super(nev, kor, nem);
        this.penz = penz;
    }

    public void setPenz(int penz) {
        this.penz += penz;
    }

    public static void setKoszosPoharakSzama(int koszosPoharakSzama) {
        KOSZOS_POHARAK_SZAMA += koszosPoharakSzama;
    }

    public void elmos(){
        if (KOSZOS_POHARAK_SZAMA < 1){
            System.out.println("Nincs koszos pohár, nincs mit elmosni.");
        } else {
            KOSZOS_POHARAK_SZAMA -= 1;
            System.out.println("A kocsmáros elmosott egy poharat. A maradék koszos poharak száma: " + KOSZOS_POHARAK_SZAMA);
        }
    }

    @Override
    public String toString() {
        return "Kocsmaros{" +
                "penz=" + penz +
                "} " + super.toString();
    }

    public int getPenz() {
        return penz;
    }
}
