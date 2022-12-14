package Palya.elemek;

import Palya.Elemek;

import javax.swing.*;

import static Kezdolap.JatekAblak.hatter;

public class KisFa extends Elemek {

    public void kisFa() {
        ImageIcon KisFaKep = new ImageIcon("src/Kepek/Palya/1.png");
        JLabel kisFa = new JLabel();

        kisFa.setBounds(oszlopa, sora, 48, 48);
        kisFa.setIcon(KisFaKep);
        hatter.add(kisFa);
    }
}