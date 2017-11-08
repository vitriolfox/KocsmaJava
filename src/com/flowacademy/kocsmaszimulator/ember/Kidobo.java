package com.flowacademy.kocsmaszimulator.ember;
import com.flowacademy.kocsmaszimulator.ital.Ital;

public class Kidobo extends Ember{

    private boolean dolgozik;
    private static int DOLGOZO_KIDOBOK_SZAMA = 0;


    public Kidobo(String nev, int kor, boolean nem, int penz) {
        super(nev, kor, nem, penz);
        this.dolgozik = false;
    }

    public static int getDolgozoKidobokSzama() {
        return DOLGOZO_KIDOBOK_SZAMA;
    }

    public static void setDolgozoKidobokSzama(int dolgozoKidobokSzama) {
        Kidobo.DOLGOZO_KIDOBOK_SZAMA = dolgozoKidobokSzama;
    }

    public boolean isDolgozik() {
        return dolgozik;
    }

    public void szolgalatbaAll() {
        if (this.dolgozik){
            System.out.println(this.getNev() + " már dolgozik.");
        } else {
            this.dolgozik = true;
            this.DOLGOZO_KIDOBOK_SZAMA ++;
            System.out.println(this.getNev() + " munkába állt.");
        }
    }

    public void szolgalatbolKilep() {
        if (!this.dolgozik){
            System.out.println(this.getNev() + " eddig sem dolgozott.");
        } else {
            this.dolgozik = false;
            this.DOLGOZO_KIDOBOK_SZAMA --;
            System.out.println(this.getNev() + " letette a munkát.");
        }
    }

    @Override
    public void iszik(Kocsmaros kocsmaros, Ital ital) {
        if (this.dolgozik && ital.getAlkoholtartalom() > 0){
            System.out.println(this.getNev() + " szolgálatban van, csak alkoholmentes italt ihat, amíg le nem teszi a munkát.");
        } else if (!this.dolgozik || ital.getAlkoholtartalom() <= 0){
            super.iszik(kocsmaros, ital);
        }
    }

    @Override
    public String toString() {
        return   super.toString() +
                ", dolgozik = " + dolgozik;
    }

}
