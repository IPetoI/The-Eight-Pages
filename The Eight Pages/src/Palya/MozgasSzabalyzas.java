package Palya;
import Kezdolap.FajlBekeres;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MozgasSzabalyzas {

    File palyaBeker = new File(String.valueOf(FajlBekeres.FajlHelye));
    File palya = new File("src/Palya/palyak/Alap_Palya.txt");
    public static int[][] mehetTomb = new int[15][15];
    Elemek elem = new Elemek();
    int x=-1, y=0, sorVege = 0;;

    public void mehet() {
        try {
            Scanner szoveg = new Scanner(palyaBeker);
            while (szoveg.hasNextInt()) {
                int sor = szoveg.nextInt();
                x++;
                mehetTomb[x][y]=sor;

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
            szoveg.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void mehetAlap() {
        try {
            Scanner szoveg = new Scanner(palya);
            while (szoveg.hasNextInt()) {
                int sor = szoveg.nextInt();
                x++;
                mehetTomb[x][y]=sor;
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
            szoveg.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean ellenorzes(int posX,int posY) {
        posX=posX/48;
        posY=posY/48;
        int szam = mehetTomb[posX][posY];

        if (szam==0 || szam == 1 || szam == 739 || szam == 732 || szam == 731 || szam == 730 ||
         szam == 21 || szam == 22 || szam == 23 || szam == 24|| szam == 725 || szam == 720 ||
          szam == 719 || szam == 718 || szam == 717 || szam == 716 || szam == 709 || szam == 712 ||
           szam == 734 || szam == 727) {
            return true;
        }else {
            return false;
        }
    }
}