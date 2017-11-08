package com.flowacademy.kocsmaszimulator.ember;

import com.flowacademy.kocsmaszimulator.ital.Ital;

public class Ember {
    private String nev;
    private int kor;
    private boolean nem;
    private int penz;



    private int reszegseg = 0;
    private boolean isKocsmaban = false;
    private static int EMBEREKSZAMA = 0;
    private static final int RESZEGSEG_KORLAT = 40;


    public static int getReszegsegKorlat() {
        return RESZEGSEG_KORLAT;
    }


    public void setReszegseg(int reszegseg) {
        this.reszegseg = reszegseg;
    }

    public int getReszegseg() {
        return reszegseg;
    }

    public boolean isKocsmaban() {
        return isKocsmaban;
    }

    public Ember(String nev, int kor, boolean nem) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.EMBEREKSZAMA++;
    }

    public String getNev() {
        return nev;
    }

    public Ember(String nev, int kor, boolean nem, int penz) {
        this.nev = nev;
        this.kor = kor;
        this.nem = nem;
        this.penz = penz;
        this.EMBEREKSZAMA++;
    }

    public static int getEMBEREKSZAMA() {
        return EMBEREKSZAMA;
    }

    public void kiir(){
        System.out.println("Szia! Az én nevem " + nev + " " + kor + " éves, " + ((nem == true) ? "férfi" : "nő") + " vagyok.");
    }

    public void iszik(Kocsmaros kocsmaros){
        if ( isKocsmaban != true ){
            System.out.println(this.nev + " nincs a kocsmában, nem tud inni! :(");
        } else {
            penz -= 1;
            reszegseg += 1;
            kocsmaros.setKoszosPoharakSzama(Kocsmaros.getKoszosPoharakSzama() + 1);
            kocsmaros.setPenz(kocsmaros.getPenz() + 1);
            if (this.reszegseg > RESZEGSEG_KORLAT) {
                this.alszik();
            }
        }
    }

    public void alszik(){
        reszegseg = 0;
        System.out.println(this.nev + " elaludt.");
    }

    public void hazamegy(){
        isKocsmaban = false;
        System.out.println(this.nev + " hazament.");
    }

    public void jon(){
        isKocsmaban = true;
        System.out.println(this.nev + " megjött a kocsmába.");
    }

    public Integer getKor(){
        return kor;
    }

    public void iszik(Kocsmaros kocsmaros, Ital ital){
        if (!isKocsmaban) {
            System.out.println(this.nev + " nincs a kocsmában, nem tud inni! :(");
        } else if (penz < ital.getAr()) {
            System.out.println(this.nev + " sajnos nem ihat, nincs elég pénze kifizetni!");
        } else {
            kocsmaros.setPenz(kocsmaros.getPenz() + ital.getAr());
            this.reszegseg += ital.getAlkoholtartalom();
            System.out.println(this.nev + " lehajtott egy kupica " + ital.getNev() + " Részegség: " + reszegseg);
            if (this.reszegseg > RESZEGSEG_KORLAT) {
                this.alszik();
            }
        }
    }

    public void kotoszkodik(Ember kivel){
        if (!this.isKocsmaban) {
            System.out.println(this.nev + " Nincs a kocsmában, max magával kötözködhet a tükörben!");
        } else if (this.isKocsmaban && Kidobo.getDolgozoKidobokSzama() > 0){
            System.out.println(this.nev + " belekötött " + kivel.getNev() + "-be, de kidobták a kocsmából! "
                             + this.nev + " mennyé haza me lesz pofon!");
            this.hazamegy();
        } else {
            System.out.println(this.nev + " jót kötözködött " + kivel.getNev() + "-vel!");
        }
    }



    @Override
    public String toString() {
        return     nev +
                ", kor = " + kor +
                ", nem = " + nem;
    }
}
