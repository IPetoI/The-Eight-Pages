package SzemelyekTargyak;

import Palya.MozgasSzabalyzas;
import jatek.Mozgas;
import javax.swing.*;
import Kezdolap.JatekAblak;

import static Kezdolap.JatekAblak.hatter;

public class Karakter {

    public static JLabel karakter = new JLabel();

    public void karakter() {
        ImageIcon karakter_kep = new ImageIcon("src/Kepek/Karakter.png");
        if (MozgasSzabalyzas.ellenorzes(672, 0)){
            karakter.setBounds(672,0,48,48);
            Mozgas.xPoz=672/48;
            Mozgas.yPoz=672/48;
            JatekAblak.pozErtek.setText("X: " + Mozgas.xPoz  + "  " + "Y: " + Mozgas.yPoz );
        }else if (MozgasSzabalyzas.ellenorzes(0, 672)) {
            karakter.setBounds(0,672,48,48);
            Mozgas.xPoz=0;
            Mozgas.yPoz=0;
            JatekAblak.pozErtek.setText("X: " + Mozgas.xPoz  + "  " + "Y: " + Mozgas.yPoz );
        }else if (MozgasSzabalyzas.ellenorzes(0, 0)) {
            karakter.setBounds(0,0,48,48);
            Mozgas.xPoz=0;
            Mozgas.yPoz=672/48;
            JatekAblak.pozErtek.setText("X: " + Mozgas.xPoz  + "  " + "Y: " + Mozgas.yPoz );
        }else if (MozgasSzabalyzas.ellenorzes(672, 672)) {
            karakter.setBounds(672, 672, 48, 48);
            Mozgas.xPoz=672/48;
            Mozgas.yPoz=672/48;
            JatekAblak.pozErtek.setText("X: " + Mozgas.xPoz  + "  " + "Y: " + Mozgas.yPoz );
        }else {
            System.err.println("Egyik sarok se szabad!");
            System.exit(0);
        }
        karakter.setVisible(true);
        karakter.setIcon(karakter_kep);
        hatter.add(karakter);
    }

    public int getX() {
        return 0;
    }
}
