package Palya;

import Kezdolap.FajlBekeres;
import Palya.elemek.*;

import java.io.File;
import java.util.Scanner;

public class Palyaletrehozas {

    File palya = new File(String.valueOf(FajlBekeres.FajlHelye));
    Elemek Elem = new Elemek();
    Fu fu = new Fu();
    KisFa kf = new KisFa();
    NagyFa nf = new NagyFa();
    Ko ko = new Ko();
    Auto au = new Auto();
    Hordo hor = new Hordo();
    TeherAuto tehera = new TeherAuto();
    Haz haz = new Haz();
    int sorVege = 0;

    public void palyaLetrehozas() {   // Grafikus elem létrehozása
        Elemek.sora=-48;
        try {
            Scanner szoveg = new Scanner(palya);
            while (szoveg.hasNextInt()) {
                int sor = szoveg.nextInt();
                sorVege++;
                if ((sorVege % 15) == 0) {
                    sorVege = 0;
                }
                Elemek.oszlopa = Elemek.oszlopa + 48;
                if (sorVege == 1) {
                    Elemek.oszlopa = 0;
                }
                if (Elemek.oszlopa == 0) {
                    Elemek.sora = Elemek.sora + 48;
                }
                if (sor == 0) {
                    fu.fu();
                }else if (sor == 1) {
                    kf.kisFa();
                }else if (sor == 21) {
                    nf.nagyFa1();
                }else if (sor == 22) {
                    nf.nagyFa2();
                }else if (sor == 23) {
                    nf.nagyFa3();
                }else if (sor == 24) {
                    nf.nagyFa4();
                }else if (sor == 31) {
                    ko.ko1();
                }else if (sor == 32) {
                    ko.ko2();
                }else if (sor == 33) {
                    ko.ko3();
                }else if (sor == 34) {
                    ko.ko4();
                }else if (sor == 35) {
                    ko.ko5();
                }else if (sor == 36) {
                    ko.ko6();
                }else if (sor == 37) {
                    ko.ko7();
                }else if (sor == 38) {
                    ko.ko8();
                }else if (sor == 39) {
                    ko.ko9();
                }else if (sor == 41) {
                    au.auto1();
                }else if (sor == 42) {
                    au.auto2();
                }else if (sor == 43) {
                    au.auto3();
                }else if (sor == 44) {
                    au.auto4();
                }else if (sor == 45) {
                    au.auto5();
                }else if (sor == 46) {
                    au.auto6();
                }else if (sor == 61) {
                    hor.hordo1();
                }else if (sor == 62) {
                    hor.hordo2();
                }else if (sor == 63) {
                    hor.hordo3();
                }else if (sor == 64) {
                    hor.hordo4();
                }else if (sor == 65) {
                    hor.hordo5();
                }else if (sor == 66) {
                    hor.hordo6();
                }else if (sor == 67) {
                    hor.hordo7();
                }else if (sor == 68) {
                    hor.hordo8();
                }else if (sor == 501) {
                    tehera.teherAuto1();
                }else if (sor == 502) {
                    tehera.teherAuto2();
                }else if (sor == 503) {
                    tehera.teherAuto3();
                }else if (sor == 504) {
                    tehera.teherAuto4();
                }else if (sor == 505) {
                    tehera.teherAuto5();
                }else if (sor == 506) {
                    tehera.teherAuto6();
                }else if (sor == 507) {
                    tehera.teherAuto7();
                }else if (sor == 508) {
                    tehera.teherAuto8();
                }else if (sor == 509) {
                    tehera.teherAuto9();
                }else if (sor == 510) {
                    tehera.teherAuto10();
                }else if (sor == 511) {
                    tehera.teherAuto11();
                }else if (sor == 512) {
                    tehera.teherAuto12();
                }else if (sor == 513) {
                    tehera.teherAuto13();
                }else if (sor == 514) {
                    tehera.teherAuto14();
                }else if (sor == 515) {
                    tehera.teherAuto15();
                }else if (sor == 701) {
                    haz.haz1();
                }else if (sor == 702) {
                    haz.haz2();
                }else if (sor == 703) {
                    haz.haz3();
                }else if (sor == 704) {
                    haz.haz4();
                }else if (sor == 705) {
                    haz.haz5();
                }else if (sor == 706) {
                    haz.haz6();
                }else if (sor == 707) {
                    haz.haz7();
                }else if (sor == 708) {
                    haz.haz8();
                }else if (sor == 709) {
                    haz.haz9();
                }else if (sor == 710) {
                    haz.haz10();
                }else if (sor == 711) {
                    haz.haz11();
                }else if (sor == 712) {
                    haz.haz12();
                }else if (sor == 713) {
                    haz.haz13();
                }else if (sor == 714) {
                    haz.haz14();
                }else if (sor == 715) {
                    haz.haz15();
                }else if (sor == 716) {
                    haz.haz16();
                }else if (sor == 717) {
                    haz.haz17();
                }else if (sor == 718) {
                    haz.haz18();
                }else if (sor == 719) {
                    haz.haz19();
                }else if (sor == 720) {
                    haz.haz20();
                }else if (sor == 721) {
                    haz.haz21();
                }else if (sor == 722) {
                    haz.haz22();
                }else if (sor == 723) {
                    haz.haz23();
                }else if (sor == 724) {
                    haz.haz24();
                }else if (sor == 725) {
                    haz.haz25();
                }else if (sor == 726) {
                    haz.haz26();
                }else if (sor == 727) {
                    haz.haz27();
                }else if (sor == 728) {
                    haz.haz28();
                }else if (sor == 729) {
                    haz.haz29();
                }else if (sor == 730) {
                    haz.haz30();
                }else if (sor == 731) {
                    haz.haz31();
                }else if (sor == 732) {
                    haz.haz32();
                }else if (sor == 733) {
                    haz.haz33();
                }else if (sor == 734) {
                    haz.haz34();
                }else if (sor == 735) {
                    haz.haz35();
                }else if (sor == 736) {
                    haz.haz36();
                }else if (sor == 737) {
                    haz.haz37();
                }else if (sor == 738) {
                    haz.haz38();
                }else if (sor == 739) {
                    haz.haz39();
                }else if (sor == 740) {
                    haz.haz40();
                }else if (sor == 741) {
                    haz.haz41();
                }else if (sor == 742) {
                    haz.haz42();
                }
            }
            szoveg.close();
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
