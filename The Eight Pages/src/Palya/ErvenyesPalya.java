package Palya;
import Kezdolap.FajlBekeres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ErvenyesPalya {

    File palya2 = new File(String.valueOf(FajlBekeres.FajlHelye));
    Elemek eleme = new Elemek();
    public int x=-1, y=0, sorVege = 0;
    public static String txt = null;

    public static void txt() {
        if (FajlBekeres.FajlHelye.length() == 4) {
            txt = FajlBekeres.FajlHelye;
        } else if (FajlBekeres.FajlHelye.length() > 4) {
            txt = FajlBekeres.FajlHelye.substring(FajlBekeres.FajlHelye.length() - 4);
        }
    }

    public void ervenyespalya() {
        try {
            Scanner szoveg1 = new Scanner(palya2);
            while (szoveg1.hasNextInt()) {
                int sor = szoveg1.nextInt();
                x++;
                MozgasSzabalyzas.mehetTomb[x][y]=sor;
                if (x ==14) {
                    y++;
                    x=-1;
                }
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
            }
            szoveg1.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (x !=-1 && y != 15) {
            System.err.println("A pálya mérete nem megfelelő!");
            System.exit(0);
        }
    }

    public void ajtoelott() {
        for (int i = 1; i < MozgasSzabalyzas.mehetTomb.length-1; i++) {
            for (int j = 1; j < MozgasSzabalyzas.mehetTomb.length-1; j++) {
                int szam = MozgasSzabalyzas.mehetTomb[j][i];

                if (szam==739) {
                    if (MozgasSzabalyzas.mehetTomb[j][i+1]>24) {
                        System.err.println("Az ajtó torlaszolva van, írd át a pályád!");
                        System.exit(0);
                    }
                }
            }
        }
    }
}
