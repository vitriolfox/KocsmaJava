package com.flowacademy.kocsmaszimulator.ember;

import com.flowacademy.kocsmaszimulator.ital.Ital;

public class Diak extends Ember {
    private int osztondij;

    public Diak(String nev, int kor, boolean nem, int osztondij) {
        super(nev, kor, nem);
        this.osztondij = osztondij;
    }

    public int getOsztondij() {
        return osztondij;
    }

    public void setOsztondij(int osztondij) {
        this.osztondij = osztondij;
    }

    public void tanul(){
        this.osztondij ++;
        System.out.println(this.getNev() + " leült tanulni, hogy legyen ösztöndíja inni. Ösztöndíj: " + this.osztondij);

    }

    public void tanul(int mennyit){
        this.osztondij += mennyit;
        System.out.println(this.getNev() + " leült tanulni, hogy legyen ösztöndíja inni. Ösztöndíj: " + this.osztondij);

    }

    @Override
    public void iszik(Kocsmaros kocsmaros, Ital ital) {
            if (!this.isKocsmaban()) {
                System.out.println(this.getNev() + " nincs a kocsmában, nem tud inni! :(");
            } else if (osztondij < ital.getAr()) {
                System.out.println(this.getNev() + " sajnos nem ihat, nincs elég pénze kifizetni!");
            } else {
                kocsmaros.setPenz(ital.getAr());
                setReszegseg(ital.getAlkoholtartalom());
                System.out.println(this.getNev() + " lehajtott egy kupica " + ital.getNev() + " Részegség: " + getReszegseg());
                if (this.getReszegseg() > getReszegsegKorlat()) {
                    this.alszik();
                }
            }
        }

    @Override
    public String toString() {
        return  super.toString() +
                ", diák " +
                ", osztondij =" + osztondij;
    }
}
