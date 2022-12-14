package jatek;

import static SzemelyekTargyak.Karakter.karakter;
import static SzemelyekTargyak.Slenderman.Slender;
import static SzemelyekTargyak.Slenderman.elkapott;

import Palya.ErvenyesPalya;
import Palya.MozgasSzabalyzas;
import Palya.Palyaletrehozas;
import SzemelyekTargyak.Karakter;
import SzemelyekTargyak.Papir;
import SzemelyekTargyak.Slenderman;


public class Jatek {

    Karakter karakt = new Karakter();
    public static Slenderman slenderman = new Slenderman();
    Mozgas mozgas = new Mozgas();
    Palyaletrehozas palya = new Palyaletrehozas();
    MozgasSzabalyzas mozgasSz = new MozgasSzabalyzas();
    Papir papirHely = new Papir();
    Lapfelvetel lapFel = new Lapfelvetel();
    ErvenyesPalya ervenyesP = new ErvenyesPalya();
    public static boolean nyertel = false, vesztettel = false;
    public static final String zoldszin = "\u001B[32m";
    public static final String alapszin = "\u001B[0m";

    public void jatek() {
        mozgasSz.mehetAlap();
        papirHely.papirAlaphelyzet();
        papirHely.papirFelvetelHelye();
        papirHely.papirLehet();
        papirHely.kivalasztottPapirok();
        papirHely.papirLetesz();
        papirHely.papirLetetele();
        mozgas.mozgas();
        lapFel.lapfelvetel();
        slenderman.slenderman();
        karakt.karakter();
    }

    public void jatek_letrehozva() {
        mozgasSz.mehet();
        papirHely.papirHelyzete();
        papirHely.papirFelvetelHelye();
        papirHely.papirLehet();
        papirHely.kivalasztottPapirok();
        papirHely.papirLetesz();
        papirHely.papirLetetele();
        mozgas.mozgas();
        lapFel.lapfelvetel();
        slenderman.slenderman();
        karakt.karakter();
        palya.palyaLetrehozas();
        ervenyesP.ajtoelott();
        ervenyesP.ervenyespalya();
    }

    public static void veresegVagyGyozelem() {
        if (karakter.getX() == Slender.getX() && karakter.getY() == Slender.getY() || elkapott) {
            vesztettel = true;
            System.err.println("Vesztettél!");
        }
        if (Lapfelvetel.ennyiLapodVanMar == 8) {
            nyertel = true;
            System.out.println(zoldszin + "Nyertél!" + alapszin);
        }
    }
}
