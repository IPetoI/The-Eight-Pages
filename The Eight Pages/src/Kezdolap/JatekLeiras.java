package Kezdolap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JatekLeiras implements ActionListener {

    JFrame ablakJatekL = new JFrame("The eight pages");
    JButton visszaGomb = new JButton("Vissza");
    JLabel focimJatekL = new JLabel();
    JLabel nyilakMozgas = new JLabel();
    JLabel spaceMozgas = new JLabel();
    JLabel erdoJatekL = new JLabel();
    JLabel nyilakJatekL = new JLabel();
    JLabel spaceJatekL = new JLabel();
    JPanel erdoKepJatekL = new JPanel();
    JPanel szovegAla = new JPanel();
    ImageIcon ikon = new ImageIcon("src/Kepek/ikon.png");
    ImageIcon kep = new ImageIcon("src/Kepek/erdo_kezdo.png");
    ImageIcon nyilak = new ImageIcon("src/Kepek/nyilak.png");
    ImageIcon space = new ImageIcon("src/Kepek/space.png");
    JTextArea szoveg = new JTextArea(
            "A játékban egy eltévedt fiatalt alakítunk, akinek meg kell találnia a sötét erdőben " +
                    "elrejtett 8 darab papírt, mielőtt a legendás szörny, Slenderman elkapja." +
                    "A játék kétféleképpen érhet véget: a játékos megtalálja az erdőben elrejtett 8 papírt, " +
                    "ekkor legyőzi a veszedelmes Slendermant. " +
                    "Ha Slenderman elkapja a játékost, a játéknak vége, a játékos veszített." +
                    "A játék egy 15*15-ös méretű pályán játszódik, a játékos a pálya egyik sarkában kezd." +
                    "A pálya bal alsó sarka a (0,0), jobb felső sarka a (14,14) pozíció. " +
                    "A játék kezdetén Slenderman nincs az erdőben, azon \n kívül várakozik, amíg a játékos " +
                    "fel nem veszi az első papírt." +
                    "Az első papír fel- \n vételekor indul meg a játék a túlélésért, hiszen ekkor indul el " +
                    "Slenderman \n az erdőben és próbálja meg megtalálni a játékost. " +
                    "De a játékossal ellentétben, \n Slenderman nem sétál az erdőben, hanem " +
                    "teleportál, a játékos lépését követően.   ",

            3,
            14);

    public void jatekleiras() {

        szovegAla.setBounds(100,190,800,300);
        szovegAla.setBackground(new Color(50,50,50));

        szoveg.setFont(new Font("Serif", Font.ITALIC, 16));
        szoveg.setLineWrap(true);
        szoveg.setWrapStyleWord(true);
        szoveg.setOpaque(false);
        szoveg.setEditable(false);
        szoveg.setBounds(100,190,800,400);
        szoveg.setForeground(new Color(127, 127, 127));

        nyilakJatekL.setBounds(648,300,250,180);
        nyilakJatekL.setIcon(nyilak);
        ablakJatekL.add(nyilakJatekL);

        nyilakMozgas.setText("Nyilakkal tudsz mozogni.");
        nyilakMozgas.setBounds(650,475,250,30);
        nyilakMozgas.setBackground(new Color(50,50,50));
        nyilakMozgas.setForeground(new Color(127, 127, 127));
        nyilakMozgas.setFont(new Font("Cooper Black", Font.PLAIN, 16));
        nyilakMozgas.setHorizontalAlignment(JLabel.CENTER);
        ablakJatekL.add(nyilakMozgas);

        spaceJatekL.setBounds(200,385,300,90);
        spaceJatekL.setIcon(space);
        ablakJatekL.add(spaceJatekL);

        spaceMozgas.setText("Space-el tudod felvenni a lapokat.");
        spaceMozgas.setBounds(200,475,300,30);
        spaceMozgas.setBackground(new Color(50,50,50));
        spaceMozgas.setForeground(new Color(127, 127, 127));
        spaceMozgas.setFont(new Font("Cooper Black", Font.PLAIN, 16));
        spaceMozgas.setHorizontalAlignment(JLabel.CENTER);
        ablakJatekL.add(spaceMozgas);

        szovegAla.add(szoveg);
        ablakJatekL.add(szovegAla);

        visszaGomb.setBounds(20, 135, 180, 40);
        visszaGomb.setBackground(new Color(229, 229, 229));
        visszaGomb.setForeground(new Color(127, 127, 127));
        visszaGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        visszaGomb.setFocusable(false);
        visszaGomb.addActionListener(this);

        ablakJatekL.add(visszaGomb);

        focimJatekL.setText("The eight pages");
        focimJatekL.setBackground(new Color(229, 229, 229));
        focimJatekL.setForeground(new Color(127, 127, 127));
        focimJatekL.setFont(new Font("Cooper Black", Font.BOLD, 100));
        focimJatekL.setHorizontalAlignment(JLabel.CENTER);
        focimJatekL.setOpaque(true);

        erdoJatekL.setIcon(kep);
        erdoKepJatekL.add(erdoJatekL);
        ablakJatekL.add(erdoKepJatekL);

        ablakJatekL.setIconImage(ikon.getImage());

        ablakJatekL.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakJatekL.setSize(1000, 830);
        ablakJatekL.getContentPane().setBackground(new Color(50, 50, 50));
        ablakJatekL.setLayout(new BorderLayout());
        ablakJatekL.setVisible(true);
        ablakJatekL.add(focimJatekL, BorderLayout.NORTH);
        ablakJatekL.add(erdoJatekL, BorderLayout.SOUTH);
        ablakJatekL.setResizable(false);
        ablakJatekL.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==visszaGomb) {
            ablakJatekL.dispose();
            KezdoAblak kezdoAblak = new KezdoAblak();
            kezdoAblak.kezdoAblak();
        }
    }
}
