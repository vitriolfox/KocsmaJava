package com.flowacademy.kocsmaszimulator;

import com.flowacademy.kocsmaszimulator.ember.Diak;
import com.flowacademy.kocsmaszimulator.ember.Ember;
import com.flowacademy.kocsmaszimulator.ember.Kidobo;
import com.flowacademy.kocsmaszimulator.ember.Kocsmaros;
import com.flowacademy.kocsmaszimulator.ital.Bor;
import com.flowacademy.kocsmaszimulator.ital.Ital;
import com.flowacademy.kocsmaszimulator.ital.Kevert;
import com.flowacademy.kocsmaszimulator.ital.Sor;

public class Main {
    public static void main(String[] args) {
        Ember jozsi = new Ember("Józsi", 63, true,30);
        Ember karoly = new Ember( "Karcsika",102,true,100);
        Ember petya = new Ember("Petyus",41,true,60);

        Diak imike = new Diak("Imike",20, false, 5);

        Kocsmaros geza = new Kocsmaros("Gézuka",52, true,10);
        Kocsmaros erzsi = new Kocsmaros("Örzsi",49,false, 20);

        Kidobo ubul = new Kidobo("Ubul", 38, true, 100);
        Kidobo odon = new Kidobo("Ödön", 41, true, 100);
        Kidobo olga = new Kidobo("Olga", 71, false, 10000);

        Ital koccintos = new Ital("Koccintós",5,10);
        Ital kommersz = new Ital("Kommersz pálesz",5, 30);
        Ital lonyal = new Ital("Alkoholmentes Lónyál", 0, 10);
        Sor kobanbi = new Sor("Kőbanbi", 5, 10);
        Sor rakoczi = new Sor("Rákóczi", 2, 10);
        Bor kocsanyos = new Bor("Kocsányos", 5, 50, 1002);
        Bor murcis = new Bor("Murcis", 5, 10, 2022);
        Kevert kevert1 = new Kevert(kobanbi, kocsanyos, 10);
        Kevert kevert2 = new Kevert(koccintos, kommersz, rakoczi, murcis,25);



        Ember[] emberek = {jozsi, karoly, petya};

        for (int i = 0; i < emberek.length; i++){
            emberek[i].kiir();
        }
        /*float korSum = 0;
        for (int i = 0; i < emberek.length; i++){
            korSum += emberek[i].getKor();
        }
        System.out.println("Az átlagéletkor: " + korSum/emberek.length);*/



        //System.out.println("Emberek száma: " + Ember.getEMBEREKSZAMA());


        geza.jon();
        System.out.println(geza.getNev() + " kinyitotta a kocsmát.");
        System.out.println("==============================");
        ubul.jon();
        ubul.szolgalatbaAll();
        System.out.println("==============================");
        jozsi.jon();
        petya.jon();
        System.out.println("==============================");
        ubul.iszik(geza, kommersz);
        ubul.iszik(geza, lonyal);
        System.out.println("==============================");
        karoly.jon();
        karoly.iszik(geza, kevert2);
        System.out.println("==============================");
        karoly.kotoszkodik(petya);
        ubul.szolgalatbolKilep();
        karoly.kotoszkodik(jozsi);
        jozsi.kotoszkodik(petya);
        System.out.println("==============================");
        imike.jon();
        imike.iszik(geza, kocsanyos);
        imike.tanul(100);
        imike.iszik(geza, kocsanyos);
        System.out.println("==============================");
        imike.hazamegy();
        jozsi.hazamegy();
        petya.hazamegy();
        geza.elmos();
        geza.hazamegy();
        System.out.println("==============================");








    }
}
