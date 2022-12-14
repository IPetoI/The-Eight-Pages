package jatek;

import Palya.MozgasSzabalyzas;
import SzemelyekTargyak.Papir;
import SzemelyekTargyak.Slenderman;

import javax.swing.*;

import Kezdolap.JatekAblak;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Kezdolap.JatekAblak.pozErtek;
import static SzemelyekTargyak.Karakter.karakter;

public class Mozgas implements ActionListener {

    public Action elore;
    public Action hatra;
    public Action balra;
    public Action jobbra;
    
    public static int lepesszam=0;

    public static int xPoz=14;
    public static int yPoz=14;

    Slenderman slender = new Slenderman();
    Papir papir = new Papir();


    public void mozgas() {

        elore = new elore();
        hatra = new hatra();
        balra = new balra();
        jobbra = new jobbra();

        karakter.getInputMap().put(KeyStroke.getKeyStroke("UP"), "elore");
        karakter.getActionMap().put("elore", elore);
        karakter.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "hatra");
        karakter.getActionMap().put("hatra", hatra);
        karakter.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "balra");
        karakter.getActionMap().put("balra", balra);
        karakter.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "jobbra");
        karakter.getActionMap().put("jobbra", jobbra);
    }

    public void lepes() {
        lepesszam++;
        slender.teleportalas();
        Slenderman.slendLathato(karakter.getX(),karakter.getY());
        slender.elkaplak();
        papir.papirLathato1(karakter.getX(),karakter.getY());
        papir.papirLathato2(karakter.getX(),karakter.getY());
        papir.papirLathato3(karakter.getX(),karakter.getY());
        papir.papirLathato4(karakter.getX(),karakter.getY());
        papir.papirLathato5(karakter.getX(),karakter.getY());
        papir.papirLathato6(karakter.getX(),karakter.getY());
        papir.papirLathato7(karakter.getX(),karakter.getY());
        papir.papirLathato8(karakter.getX(),karakter.getY());
        papir.papirLathato9(karakter.getX(),karakter.getY());
        papir.papirLathato10(karakter.getX(),karakter.getY());
        papir.papirLathato11(karakter.getX(),karakter.getY());
        papir.papirlathato12(karakter.getX(),karakter.getY());
        papir.papirLathato13(karakter.getX(),karakter.getY());
        papir.papirLathato14(karakter.getX(),karakter.getY());
        Jatek.veresegVagyGyozelem();
        JatekAblak.vegeajateknak();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    public class elore extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (karakter.getY() - 48 >= 0) {
                if (MozgasSzabalyzas.ellenorzes(karakter.getX(), karakter.getY() - 48) && !Jatek.nyertel && !Jatek.vesztettel) {
                    karakter.setLocation(karakter.getX(), karakter.getY() - 48);
                    System.out.println("Karakter pozíciója:  " + "X: " + (karakter.getX() / 48) + "  " + "Y: " +
                         (14 - karakter.getY() / 48));
                    xPoz = (karakter.getX() / 48);
                    yPoz = (14 - karakter.getY() / 48);
                    pozErtek.setText("X: " + xPoz  + "  " + "Y: " + yPoz );
                    lepes();
                }
            }
        }
    }

    public class hatra extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (karakter.getY() + 48 <= 672) {

                if (MozgasSzabalyzas.ellenorzes(karakter.getX(), karakter.getY() + 48) && !Jatek.nyertel && !Jatek.vesztettel) {
                    karakter.setLocation(karakter.getX(), karakter.getY() + 48);
                    System.out.println("Karakter pozíciója:  " + "X: " + (karakter.getX() / 48) + "  " + "Y: " + 
                        (14 - karakter.getY() / 48));
                    xPoz = (karakter.getX() / 48);
                    yPoz = (14 - karakter.getY() / 48);
                    pozErtek.setText("X: " + xPoz  + "  " + "Y: " + yPoz );
                    lepes();
                }
            }
        }
    }

    public class balra extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (karakter.getX() - 48 >= 0) {

                if (MozgasSzabalyzas.ellenorzes(karakter.getX() - 48, karakter.getY()) && !Jatek.nyertel && !Jatek.vesztettel) {
                    karakter.setLocation(karakter.getX() - 48, karakter.getY());
                    System.out.println("Karakter pozíciója:  " + "X: " + (karakter.getX() / 48) + "  " + "Y: " + 
                        (14 - karakter.getY() / 48));
                    xPoz = (karakter.getX() / 48);
                    yPoz = (14 - karakter.getY() / 48);
                    pozErtek.setText("X: " + xPoz  + "  " + "Y: " + yPoz );
                    lepes();
                }
            }
        }
    }

    public class jobbra extends AbstractAction {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (karakter.getX() + 48 <= 672) {

                if (MozgasSzabalyzas.ellenorzes(karakter.getX() + 48, karakter.getY()) && !Jatek.nyertel && !Jatek.vesztettel) {
                    karakter.setLocation(karakter.getX() + 48, karakter.getY());
                    System.out.println("Karakter pozíciója:  " + "X: " + (karakter.getX() / 48) + "  " + "Y: " + 
                        (14 - karakter.getY() / 48));
                    xPoz = (karakter.getX() / 48);
                    yPoz = (14 - karakter.getY() / 48);
                    pozErtek.setText("X: " + xPoz  + "  " + "Y: " + yPoz );
                    lepes();
                }
            }
        }
    }
}