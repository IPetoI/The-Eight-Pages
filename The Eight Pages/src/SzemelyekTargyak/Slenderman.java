package SzemelyekTargyak;

import jatek.Jatek;
import jatek.Lapfelvetel;
import jatek.Mozgas;

import javax.swing.*;

import static Kezdolap.JatekAblak.hatter;
import static SzemelyekTargyak.Karakter.karakter;

public class Slenderman{

    ImageIcon Slender_kep = new ImageIcon("src/Kepek/Slenderman.png");
    public  static JLabel Slender = new JLabel();
    Papir papir = new Papir();
    public Lapfelvetel lapfel = new Lapfelvetel();
    public static int megragad=0;
    public static boolean elkapott = false;

    public void slenderman() {

        Slender.setBounds(5*48,5*48,48,48);
        Slender.setIcon(Slender_kep);
        Slender.setVisible(false);
        hatter.add(Slender);

    }

    public static void slendLathato(int X, int Y) {
        int tavolsag = 0;

        tavolsag = Math.abs(X/48-Slender.getX()/48) + Math.abs(Y/48-Slender.getY()/48);

        System.out.println("tavolsag Slenderman-tol: "+tavolsag +"\n");

        if (tavolsag < 4 && Lapfelvetel.ennyiLapodVanMar > 0){
            Slender.setVisible(true);
        }
        else{
            Slender.setVisible(false);
        }
    }

    public void teleportalas(){

        System.out.println("Lepesszam: "+Mozgas.lepesszam+"\nFelvett lapok szama: "+Lapfelvetel.ennyiLapodVanMar);
       
         if(karakter.getY() == Slender.getY() && karakter.getX() == Slender.getX()) {
            Jatek.veresegVagyGyozelem();
        }

        if(Lapfelvetel.ennyiLapodVanMar < 2 && Mozgas.lepesszam % 5 != 0){
            for(int i = 0; i < 5; i++){

                int X = (int)(Math.random()*(14-0+1)+0);
                int Y = (int)(Math.random()*(14-0+1)+0);

                int szam = Math.abs(karakter.getX()/48-X) + Math.abs(karakter.getY()/48-Y);
               
                if(szam >= 5){
                    Slender.setLocation(X*48,Y*48);
                    break;
                }
                else if(szam < 5){
                    i--;
                }
            }
        }
        else if(Lapfelvetel.ennyiLapodVanMar >1 && Lapfelvetel.ennyiLapodVanMar <4 && Mozgas.lepesszam % 5 != 0){
            for(int i = 0; i < 5; i++){

                int X = (int)(Math.random()*(14-0+1)+0);
                int Y = (int)(Math.random()*(14-0+1)+0);

                int szam = Math.abs(karakter.getX()/48-X) + Math.abs(karakter.getY()/48-Y);

                if(szam < 6){
                    Slender.setLocation(X*48,Y*48);
                    break;
                }
                else if(szam > 5){
                    i--;
                }
            }
        }
        else if(Lapfelvetel.ennyiLapodVanMar >3 && Lapfelvetel.ennyiLapodVanMar <6 && Mozgas.lepesszam % 5 != 0){
            for(int i = 0; i < 5; i++){

                int X = (int)(Math.random()*(14-0+1)+0);
                int Y = (int)(Math.random()*(14-0+1)+0);

                int szam = Math.abs(karakter.getX()/48-X) + Math.abs(karakter.getY()/48-Y);

                if(szam < 5){
                    Slender.setLocation(X*48,Y*48);
                    break;
                }
                else if(szam > 4){
                    i--;
                }
            }
        }
        else if(Lapfelvetel.ennyiLapodVanMar >5 && Mozgas.lepesszam % 5 != 0){
            for(int i = 0; i < 5; i++){

                int X = (int)(Math.random()*(14-0+1)+0);
                int Y = (int)(Math.random()*(14-0+1)+0);

                int szam = Math.abs(karakter.getX()/48-X) + Math.abs(karakter.getY()/48-Y);

                if(szam < 4){
                    Slender.setLocation(X*48,Y*48);
                    break;
                }
                else if(szam > 3){
                    i--;
                }
            }
        }else if (Mozgas.lepesszam % 5 == 0){
            if (Lapfelvetel.ennyiLapodVanMar <2) {

                for (int i = 0; i < 5; i++) {

                    int X = ((int)(Math.random()*(14-0+1)+0));
                    int Y = ((int)(Math.random()*(14-0+1)+0));

                    if (karakter.getY()==Y*48 && karakter.getX()==X*48) {
                            i--;
                    }else {
                        Slender.setLocation(X*48,Y*48);
                        break;
                    }
                }
            } else {
                int X = ((int)(Math.random()*(14-0+1)+0));
                int Y = ((int)(Math.random()*(14-0+1)+0));
                Slender.setLocation(X*48,Y*48);
            }
        }
    }

    public void elkaplak(){
        int Slendkaraktertavolsag = Math.abs(karakter.getX()/48-Slender.getX()/48) + 
            Math.abs(karakter.getY()/48-Slender.getY()/48);

        if(Slendkaraktertavolsag == 1){
            megragad++;

            if(megragad == 3){
                megragad=0;
                kezbenMarad();
            }else {
                System.out.println(megragad+". alkalommal van melletted Slenderman! " );
            }
        } else if(Slendkaraktertavolsag > 1){
            megragad = 0;
        }
    }

    public void kezbenMarad() {
        int szaz = (int)(Math.random()*(100-0+1)+0);

        if(Lapfelvetel.ennyiLapodVanMar >1 && Lapfelvetel.ennyiLapodVanMar <4){
            if(szaz < 32){
                elkapott = true;
            }else {
                System.out.println("Sikerült elszökni 3 húzós helyzet után is!");
            }
        } else if(Lapfelvetel.ennyiLapodVanMar >3 && Lapfelvetel.ennyiLapodVanMar <6){
            if(szaz < 49){
                elkapott = true;
            }else {
                System.out.println("Sikerült elszökni 3 húzós helyzet után is!");
            }
        } else if(Lapfelvetel.ennyiLapodVanMar >5){
            if(szaz < 65){
                elkapott = true;
            }else {
                System.out.println("Sikerült elszökni 3 húzós helyzet után is!");
            }
        }
    }
}
