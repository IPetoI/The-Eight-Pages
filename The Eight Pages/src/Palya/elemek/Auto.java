package Palya.elemek;
import Palya.Elemek;
import javax.swing.*;
import static Kezdolap.JatekAblak.hatter;

public class Auto extends Elemek {

    public void auto1() {
        ImageIcon autoKep1 = new ImageIcon("src/Kepek/Palya/41.png");
        JLabel auto1 = new JLabel();

        auto1.setBounds(oszlopa, sora, 48, 48);
        auto1.setIcon(autoKep1);
        hatter.add(auto1);
    }

    public void auto2() {
        ImageIcon autoKep2 = new ImageIcon("src/Kepek/Palya/42.png");
        JLabel auto2 = new JLabel();

        auto2.setBounds(oszlopa, sora, 48, 48);
        auto2.setIcon(autoKep2);
        hatter.add(auto2);
    }

    public void auto3() {
        ImageIcon autoKep3 = new ImageIcon("src/Kepek/Palya/43.png");
        JLabel auto3 = new JLabel();

        auto3.setBounds(oszlopa, sora, 48, 48);
        auto3.setIcon(autoKep3);
        hatter.add(auto3);
    }

    public void auto4() {
        ImageIcon autoKep4 = new ImageIcon("src/Kepek/Palya/44.png");
        JLabel auto4 = new JLabel();

        auto4.setBounds(oszlopa, sora, 48, 48);
        auto4.setIcon(autoKep4);
        hatter.add(auto4);
    }

    public void auto5() {
        ImageIcon autoKep5 = new ImageIcon("src/Kepek/Palya/45.png");
        JLabel auto5 = new JLabel();

        auto5.setBounds(oszlopa, sora, 48, 48);
        auto5.setIcon(autoKep5);
        hatter.add(auto5);
    }

    public void auto6() {
        ImageIcon autoKep6 = new ImageIcon("src/Kepek/Palya/46.png");
        JLabel auto6 = new JLabel();

        auto6.setBounds(oszlopa, sora, 48, 48);
        auto6.setIcon(autoKep6);
        hatter.add(auto6);
    }
}