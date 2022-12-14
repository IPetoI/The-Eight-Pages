package Kezdolap;

import Palya.ErvenyesPalya;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class FajlBekeres implements ActionListener {


    JFrame ablakFajlB = new JFrame("The eight pages");
    JButton visszaGomb = new JButton("Vissza");
    JButton FajlBGomb = new JButton("Fájl Betöltése");
    JLabel focimFajlB = new JLabel();
    JLabel erdoFajlB = new JLabel();
    JPanel erdoKepFajlB = new JPanel();
    ImageIcon kep = new ImageIcon("src/Kepek/erdo_kezdo.png");
    ImageIcon ikon = new ImageIcon("src/Kepek/ikon.png");
    JLabel Slender = new JLabel();
    ImageIcon SlenderKep = new ImageIcon("src/Kepek/Slender.png");
    JLabel Slender0 = new JLabel();
    ImageIcon SlenderKep0 = new ImageIcon("src/Kepek/Slender0.png");
    public static String FajlHelye;

    public void fajlbekeres() {

        visszaGomb.setBounds(20, 135, 180, 40);
        visszaGomb.setBackground(new Color(229, 229, 229));
        visszaGomb.setForeground(new Color(127, 127, 127));
        visszaGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        visszaGomb.setFocusable(false);
        visszaGomb.addActionListener(this);

        ablakFajlB.add(visszaGomb);

        FajlBGomb.setBounds(410, 300, 180, 40);
        FajlBGomb.setBackground(new Color(229, 229, 229));
        FajlBGomb.setForeground(new Color(127, 127, 127));
        FajlBGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        FajlBGomb.setFocusable(false);
        FajlBGomb.addActionListener(this);

        ablakFajlB.add(FajlBGomb);

        focimFajlB.setText("The eight pages");
        focimFajlB.setBackground(new Color(229, 229, 229));
        focimFajlB.setForeground(new Color(127, 127, 127));
        focimFajlB.setFont(new Font("Cooper Black", Font.BOLD, 100));
        focimFajlB.setHorizontalAlignment(JLabel.CENTER);
        focimFajlB.setOpaque(true);

        Slender.setBounds(70,220,250,320);
        Slender.setIcon(SlenderKep);
        ablakFajlB.add(Slender);

        Slender0.setBounds(660,220,250,320);
        Slender0.setIcon(SlenderKep0);
        ablakFajlB.add(Slender0);

        erdoFajlB.setIcon(kep);
        erdoKepFajlB.add(erdoFajlB);
        ablakFajlB.add(erdoKepFajlB);

        ablakFajlB.setIconImage(ikon.getImage());

        ablakFajlB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakFajlB.setSize(1000, 830);
        ablakFajlB.getContentPane().setBackground(new Color(50, 50, 50));
        ablakFajlB.setLayout(new BorderLayout());
        ablakFajlB.setVisible(true);
        ablakFajlB.add(focimFajlB, BorderLayout.NORTH);
        ablakFajlB.add(erdoFajlB, BorderLayout.SOUTH);
        ablakFajlB.setResizable(false);
        ablakFajlB.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==visszaGomb) {
            ablakFajlB.dispose();
            KezdoAblak letrehoz = new KezdoAblak();
            letrehoz.kezdoAblak();
        }

        if (e.getSource()==FajlBGomb) {
           JFileChooser Fajl =new JFileChooser();
            Fajl.setFileFilter(new FileNameExtensionFilter("TXT file", "txt"));

           int lesz = Fajl.showOpenDialog(null);

           if (lesz == 0) {
               String file = new String(Fajl.getSelectedFile().getAbsolutePath());
               File fajl = new File(Fajl.getSelectedFile().getAbsolutePath());
               FajlHelye = file;
               if (fajl.exists()) {
                   System.out.println("Van ilyen Fájl!");
               }else {
                   System.out.println("Nincs ilyen fájl!");
                   FajlHelye = null;
               }

               System.out.println(FajlHelye);
           }else {
               System.out.println("Nincs ilyen");
           }
           if (FajlHelye != null ) {
               ErvenyesPalya.txt();
               System.out.println(ErvenyesPalya.txt);
                if (ErvenyesPalya.txt.equals(".txt")) {
                    ablakFajlB.dispose();
                    JatekAblak palya = new JatekAblak();
                    palya.jatek_ablak();
                }else {
                    System.out.println("Nem .txt fájl!");
                }
           }
        }
    }
}
