package SzemelyekTargyak;

import Kezdolap.FajlBekeres;
import Palya.Elemek;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
// import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static Kezdolap.JatekAblak.hatter;
import static SzemelyekTargyak.Karakter.karakter;

public class Papir {

    File palya = new File(String.valueOf(FajlBekeres.FajlHelye));
    File palyaalap = new File("src/Palya/palyak/Alap_Palya.txt");
    Elemek elem = new Elemek();
    int sorVege = 0 ,sorVeg = 0;
    int k = -1, l = 0;
    int x = -1, y = 0;
    Elemek Eleme = new Elemek();
    Random random = new Random();
    public static int[][] papirTomb = new int[17][17];
    int[] papirLehetTomb = new int[28];
    int[] papirId = new int[10];
    int[] papirIdHaz = new int[4];
    int[] kivalasztottLapok = new int[8];
    public int papir1x =-500, papir1y=-500;
    public int papir2x =-500, papir2y=-500;
    public int papir3x =-500, papir3y=-500;
    public int papir4x =-500, papir4y=-500;
    public int papir5x =-500, papir5y=-500;
    public int papir6x =-500, papir6y=-500;
    public int papir7x =-500, papir7y=-500;
    public int papir8x =-500, papir8y=-500;
    public int papir9x =-500, papir9y=-500;
    public int papir10x =-500, papir10y=-500;
    public int papir11x =-500, papir11y=-500;
    public int papir12x =-500, papir12y=-500;
    public int papir13x =-500, papir13y=-500;
    public int papir14x =-500, papir14y=-500;
    public static JLabel papir1 = new JLabel();
    public static JLabel papir2 = new JLabel();
    public static JLabel papir3 = new JLabel();
    public static JLabel papir4 = new JLabel();
    public static JLabel papir5 = new JLabel();
    public static JLabel papir6 = new JLabel();
    public static JLabel papir7 = new JLabel();
    public static JLabel papir8 = new JLabel();
    public static JLabel papir9 = new JLabel();
    public static JLabel papir10 = new JLabel();
    public static JLabel papir11 = new JLabel();
    public static JLabel papir12 = new JLabel();
    public static JLabel papir13 = new JLabel();
    public static JLabel papir14 = new JLabel();

    public static int randomszam(int min, int max){
        int temp = (int)(Math.random()*(max-min+1)+min);
        return temp;
    }

    public void papirAlaphelyzet() {
        try {
            Scanner szoveg = new Scanner(palyaalap);
            while (szoveg.hasNextInt()) {
                int sor = szoveg.nextInt();
                if (sor > 1) {
                    if (sor > 30 && sor < 40) {
                        if (sor == 35) {
                            sor = 103;
                        } else {
                            sor = 3;
                        }
                    } else if (sor > 40 && sor < 47) {
                        if (sor == 42) {
                            sor = 104;
                        } else {
                            sor = 4;
                        }
                    } else if (sor > 60 && sor < 69) {
                        if (sor == 66) {
                            sor = 106;
                        } else {
                            sor = 6;
                        }
                    } else if (sor > 500 && sor < 516) {
                        if (sor == 505) {
                            sor = 105;
                        } else {
                            sor = 5;
                        }
                    } else if (sor > 700 && sor < 743) {
                        if (sor == 735) {
                            sor = 107;
                        } else if (sor == 708) {
                            sor = 108;
                        } else if (sor == 711) {
                            sor = 109;
                        } else if (sor == 729) {
                            sor = 110;
                        } else {
                            sor = 7;
                        }
                    }
                }
                k++;
                papirTomb[k+1][l+1] = sor;
                if (k == 14) {
                    l++;
                    k = -1;
                }
                sorVeg++;
                if ((sorVeg % 15) == 0) {
                    sorVeg = 0;
                }
                Elemek.oszlopa = Elemek.oszlopa + 48;
                if (sorVeg == 1) {
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

    public void papirHelyzete() {
        try {
            Scanner szoveg = new Scanner(palya);
            while (szoveg.hasNextInt()) {
                int sor = szoveg.nextInt();
                if (sor > 1) {
                    if (sor > 30 && sor < 40) {
                        if (sor == 35) {
                            sor = 103;
                        } else {
                            sor = 3;
                        }
                    } else if (sor > 40 && sor < 47) {
                        if (sor == 42) {
                            sor = 104;
                        } else {
                            sor = 4;
                        }
                    } else if (sor > 60 && sor < 69) {
                        if (sor == 66) {
                            sor = 106;
                        } else {
                            sor = 6;
                        }
                    } else if (sor > 500 && sor < 516) {
                        if (sor == 505) {
                            sor = 105;
                        } else {
                            sor = 5;
                        }
                    } else if (sor > 700 && sor < 743) {
                        if (sor == 735) {
                            sor = 107;
                        } else if (sor == 708) {
                            sor = 108;
                        } else if (sor == 711) {
                            sor = 109;
                        } else if (sor == 729) {
                            sor = 110;
                        } else {
                            sor = 7;
                        }
                    }
                }
                x++;
                papirTomb[x+1][y+1] = sor;
                if (x == 14) {
                    y++;
                    x = -1;
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

    public void papirFelvetelHelye() {

        // System.out.println(Arrays.deepToString(papirTombAlap));

        for (int i = 1; i < papirTomb.length-1; i++) {
            for (int l = 1; l < papirTomb.length-1; l++) {
               if (papirTomb[l][i] > 20 && papirTomb[l][i] < 25) {
                   if (papirTomb[l-1][i]==0 || papirTomb[l-1][i]==1) {
                       papirTomb[l-1][i]=00;
                   }if (papirTomb[l+1][i]==0 || papirTomb[l+1][i]==1) {
                       papirTomb[l+1][i]=100;
                   }if (papirTomb[l][i-1]==0 || papirTomb[l][i-1]==1) {
                       papirTomb[l][i-1]=100;
                   }if (papirTomb[l][i+1]==0 || papirTomb[l][i+1]==1) {
                       papirTomb[l][i+1]=100;
                   }if (papirTomb[l-1][i-1]==0 || papirTomb[l-1][i-1]==1) {
                       papirTomb[l-1][i-1]=100;
                   }if (papirTomb[l+1][i+1]==0 || papirTomb[l+1][i+1]==1) {
                       papirTomb[l+1][i+1]=100;
                   }if (papirTomb[l+1][i-1]==0 || papirTomb[l+1][i-1]==1) {
                       papirTomb[l+1][i-1]=100;
                   }if (papirTomb[l-1][i+1]==0 || papirTomb[l-1][i+1]==1) {
                       papirTomb[l-1][i+1]=100;
                   }
               }

               for (int z = 3; z < 7; z++) {

                    if (papirTomb[l][i]== z) {
                        if (papirTomb[l-1][i]==0 || papirTomb[l-1][i]==1) {
                            papirTomb[l-1][i]=100;
                        }if (papirTomb[l+1][i]==0 || papirTomb[l+1][i]==1) {
                            papirTomb[l+1][i]=100;
                        }if (papirTomb[l][i-1]==0 || papirTomb[l][i-1]==1) {
                            papirTomb[l][i-1]=100;
                        }if (papirTomb[l][i+1]==0 || papirTomb[l][i+1]==1) {
                            papirTomb[l][i+1]=100;
                        }if (papirTomb[l-1][i-1]==0 || papirTomb[l-1][i-1]==1) {
                            papirTomb[l-1][i-1]=100;
                        }if (papirTomb[l+1][i+1]==0 || papirTomb[l+1][i+1]==1) {
                            papirTomb[l+1][i+1]=100;
                        }if (papirTomb[l+1][i-1]==0 || papirTomb[l+1][i-1]==1) {
                            papirTomb[l+1][i-1]=100;
                        }if (papirTomb[l-1][i+1]==0 || papirTomb[l-1][i+1]==1) {
                            papirTomb[l-1][i+1]=100;
                        }
                    }
               }
            }
        }

        for (int i = 1; i < papirTomb.length - 1; i++) {
            for (int l = 1; l < papirTomb.length - 1; l++) {
                if (papirTomb[l][i] > 20 && papirTomb[l][i] < 25) {
                    if (papirTomb[l][i] == 21) {
                        papirTomb[l][i] = 102;
                    } else {
                        papirTomb[l][i] = 100;
                    }
                }
            }
        }

        //  System.out.println("---------------------------------------------------------------------------");
        //  System.out.println(Arrays.deepToString(papirTomb));
    }

    public void papirLehet() {

        int e = 0,n=200,k=220;
        for (int i = 0; i < papirTomb.length; i++) {
            for (int j = 0; j < papirTomb.length; j++) {
                if (papirTomb[i][j] > 101 && papirTomb[i][j] < 107) {
                    papirLehetTomb[e] = j-1;
                    papirLehetTomb[e + 1] = i-1;
                    e = e + 2;
                    n++;
                    papirTomb[i][j]=n;
                    papirId[n-201]=papirTomb[i][j];
                }
            }
        }
        for (int i = 0; i < papirTomb.length; i++) {
            for (int j = 0; j < papirTomb.length; j++) {
                if (papirTomb[i][j] > 106 && papirTomb[i][j] < 111) {
                    papirLehetTomb[e] = j-1;
                    papirLehetTomb[e + 1] = i-1;
                    e = e + 2;
                    k++;
                    papirTomb[i][j] = k;
                    papirIdHaz[k - 221] = papirTomb[i][j];
                }
            }
        }
    }

    public void kivalasztottPapirok() {

        int min = papirId[0];
        int max = papirId[0];
        int minHaz = papirIdHaz[0];
        int maxHaz = papirIdHaz[0];

        for(int i=1;i < papirId.length;i++){
            if(papirId[i] > max){
                max = papirId[i];
            }
        }
        for(int i=1;i < papirId.length;i++){
            if(papirId[i] < min){
                if (papirId[i] != 0){
                    min = papirId[i];
                }
            }
        }
        for(int i=1;i < papirIdHaz.length;i++){
            if(papirIdHaz[i] > maxHaz){
                maxHaz = papirIdHaz[i];
            }
        }
        for(int i=1;i < papirIdHaz.length;i++){
            if(papirIdHaz[i] < minHaz){
                if (papirIdHaz[i] != 0){
                    minHaz = papirIdHaz[i];
                }

            }
        }

        // System.out.println(Arrays.toString(papirIdHaz));
        // System.out.println(Arrays.toString(papirId));

        for (int i = 0; i < 7; i++) {
            kivalasztottLapok[i] = randomszam(min, max);

            for (int j = 0; j < i; j++) {
                if (kivalasztottLapok[i] == kivalasztottLapok[j]) {
                    i--;
                    break;
                }
            }
        }

        kivalasztottLapok[7] = randomszam(minHaz, maxHaz);
    }

    public void papirLetesz() {

        for (int i = 0; i < kivalasztottLapok.length; i++) {
            if (kivalasztottLapok[i] == 201) {
                papir1y=papirLehetTomb[0]*48;
                papir1x=papirLehetTomb[1]*48;
            }else if (kivalasztottLapok[i] == 202) {
                papir2y=papirLehetTomb[2]*48;
                papir2x=papirLehetTomb[3]*48;
            }else if (kivalasztottLapok[i] == 203) {
                papir3y=papirLehetTomb[4]*48;
                papir3x=papirLehetTomb[5]*48;
            }else if (kivalasztottLapok[i] == 204) {
                papir4y=papirLehetTomb[6]*48;
                papir4x=papirLehetTomb[7]*48;
            }else if (kivalasztottLapok[i] == 205) {
                papir5y=papirLehetTomb[8]*48;
                papir5x=papirLehetTomb[9]*48;
            }else if (kivalasztottLapok[i] == 206) {
                papir6y=papirLehetTomb[10]*48;
                papir6x=papirLehetTomb[11]*48;
            }else if (kivalasztottLapok[i] == 207) {
                papir7y=papirLehetTomb[12]*48;
                papir7x=papirLehetTomb[13]*48;
            }else if (kivalasztottLapok[i] == 208) {
                papir8y=papirLehetTomb[14]*48;
                papir8x=papirLehetTomb[15]*48;
            }else if (kivalasztottLapok[i] == 209) {
                papir9y=papirLehetTomb[16]*48;
                papir9x=papirLehetTomb[17]*48;
            }else if (kivalasztottLapok[i] == 210) {
                papir10y=papirLehetTomb[18]*48;
                papir10x=papirLehetTomb[19]*48;
            }else if (kivalasztottLapok[i] == 221) {
                papir11y=papirLehetTomb[20]*48;
                papir11x=papirLehetTomb[21]*48;
            }else if (kivalasztottLapok[i] == 222) {
                papir12y=papirLehetTomb[22]*48;
                papir12x=papirLehetTomb[23]*48;
            }else if (kivalasztottLapok[i] == 223) {
                papir13y=papirLehetTomb[24]*48;
                papir13x=papirLehetTomb[25]*48;
            }else if (kivalasztottLapok[i] == 224) {
                papir14y=papirLehetTomb[26]*48;
                papir14x=papirLehetTomb[27]*48;
            }
        }
    }

    public void papirLetetele() {                                                       // Grafikus elem létrehozása
        ImageIcon papir_kep = new ImageIcon("src/Kepek/Papir.png");

        papir1.setBounds(papir1x,papir1y,48,48);
        papir1.setVisible(false);
        papir1.setIcon(papir_kep);
        hatter.add(papir1);
        
        papir2.setBounds(papir2x,papir2y,48,48);
        papir2.setVisible(false);
        papir2.setIcon(papir_kep);
        hatter.add(papir2);
        
        papir3.setBounds(papir3x,papir3y,48,48);
        papir3.setVisible(false);
        papir3.setIcon(papir_kep);
        hatter.add(papir3);
        
        papir4.setBounds(papir4x,papir4y,48,48);
        papir4.setVisible(false);
        papir4.setIcon(papir_kep);
        hatter.add(papir4);
        
        papir5.setBounds(papir5x,papir5y,48,48);
        papir5.setVisible(false);
        papir5.setIcon(papir_kep);
        hatter.add(papir5);
        
        papir6.setBounds(papir6x,papir6y,48,48);
        papir6.setVisible(false);
        papir6.setIcon(papir_kep);
        hatter.add(papir6);
        
        papir7.setBounds(papir7x,papir7y,48,48);
        papir7.setVisible(false);
        papir7.setIcon(papir_kep);
        hatter.add(papir7);
        
        papir8.setBounds(papir8x,papir8y,48,48);
        papir8.setVisible(false);
        papir8.setIcon(papir_kep);
        hatter.add(papir8);
        
        papir9.setBounds(papir9x,papir9y,48,48);
        papir9.setVisible(false);
        papir9.setIcon(papir_kep);
        hatter.add(papir9);
        
        papir10.setBounds(papir10x,papir10y,48,48);
        papir10.setVisible(false);
        papir10.setIcon(papir_kep);
        hatter.add(papir10);
        
        papir11.setBounds(papir11x,papir11y,48,48);
        papir11.setVisible(false);
        papir11.setIcon(papir_kep);
        hatter.add(papir11);
        
        papir12.setBounds(papir12x,papir12y,48,48);
        papir12.setVisible(false);
        papir12.setIcon(papir_kep);
        hatter.add(papir12);
        
        papir13.setBounds(papir13x,papir13y,48,48);
        papir13.setVisible(false);
        papir13.setIcon(papir_kep);
        hatter.add(papir13);
        
        papir14.setBounds(papir14x,papir14y,48,48);
        papir14.setVisible(false);
        papir14.setIcon(papir_kep);
        hatter.add(papir14);
    }


    public boolean papirLathato1(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir1.getX()/48), 2)
         + (int) Math.pow((posY/48-papir1.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;

        // System.out.println(karakterx+"   "+karaktery+" - "+ papirTomb[karakterx][karaktery]);
        
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir1.setVisible(true);
            return true;
        } else {
            papir1.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato2(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir2.getX()/48), 2) +
         (int) Math.pow((posY/48-papir2.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir2.setVisible(true);
            return true;
        }else {
            papir2.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato3(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir3.getX()/48), 2) +
         (int) Math.pow((posY/48-papir3.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir3.setVisible(true);
            return true;
        }else {
            papir3.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato4(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir4.getX()/48), 2) +
         (int) Math.pow((posY/48-papir4.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir4.setVisible(true);
            return true;
        }else {
            papir4.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato5(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir5.getX()/48), 2) +
         (int) Math.pow((posY/48-papir5.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir5.setVisible(true);
            return true;
        }else {
            papir5.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato6(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir6.getX()/48), 2) +
         (int) Math.pow((posY/48-papir6.getY()/48), 2));

        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir6.setVisible(true);
            return true;
        }else {
            papir6.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato7(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir7.getX()/48), 2) +
         (int) Math.pow((posY/48-papir7.getY()/48), 2));

        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir7.setVisible(true);
            return true;
        }else {
            papir7.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato8(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir8.getX()/48), 2) +
         (int) Math.pow((posY/48-papir8.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir8.setVisible(true);
            return true;
        }else {
            papir8.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato9(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir9.getX()/48), 2) +
         (int) Math.pow((posY/48-papir9.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir9.setVisible(true);
            return true;
        }else {
            papir9.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato10(int posX,int posY) {

        int tavolsag = 0,karakterx=0,karaktery=0;

        tavolsag = (int)Math.sqrt((int) Math.pow((posX/48-papir10.getX()/48), 2) +
         (int) Math.pow((posY/48-papir10.getY()/48), 2));
        
        karakterx=karakter.getX()/48+1;
        karaktery=karakter.getY()/48+1;
        if (tavolsag < 3 && papirTomb[karakterx][karaktery]==100){
            papir10.setVisible(true);
            return true;
        }else {
            papir10.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato11(int posX,int posY) {

        if (posX-96==papir11.getX() && posY-48==papir11.getY() || posX-48==papir11.getX() &&
         posY==papir11.getY() || posX-48==papir11.getX() && posY-48==papir11.getY()) {
            papir11.setVisible(true);
            return true;
        }else {
            papir11.setVisible(false);
            return false;
        }
    }

    public boolean papirlathato12(int posX,int posY) {

        if (posX-48==papir12.getX() && posY==papir12.getY() || posX-96==papir12.getX() &&
         posY==papir12.getY()) {
            papir12.setVisible(true);
            return true;
        }else {
            papir12.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato13(int posX,int posY) {

        if (posX-96==papir13.getX() && posY-48==papir13.getY() || posX-48==papir13.getX() &&
         posY==papir13.getY() || posX-48==papir13.getX() && posY-48==papir13.getY()) {
            papir13.setVisible(true);
            return true;
        }else {
            papir13.setVisible(false);
            return false;
        }
    }

    public boolean papirLathato14(int posX,int posY) {

        if (posX+48==papir14.getX() && posY==papir14.getY()) {
            papir14.setVisible(true);
            return true;
        }else {
            papir14.setVisible(false);
            return false;
        }
    }
}