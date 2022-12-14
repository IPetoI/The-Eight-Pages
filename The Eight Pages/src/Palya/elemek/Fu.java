package Palya.elemek;

import Palya.Elemek;

import javax.swing.*;

import static Kezdolap.JatekAblak.hatter;

public class Fu extends Elemek {

    public void fu() {
        ImageIcon fuKep = new ImageIcon("src/Kepek/Palya/0.png");
        JLabel fu = new JLabel();

        // System.out.println(oszlopa+"  "+sora);

        fu.setBounds(oszlopa, sora, 48, 48);
        fu.setIcon(fuKep);
        hatter.add(fu);
    }
}