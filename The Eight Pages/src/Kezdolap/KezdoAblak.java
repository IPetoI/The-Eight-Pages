package Kezdolap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KezdoAblak implements ActionListener {

    JFrame ablak = new JFrame("The Eight Pages");
    JLabel foCim = new JLabel();
    JLabel erdo = new JLabel();
    JPanel erdoKep = new JPanel();
    JButton GeneralGomb = new JButton("Generált Játék Indítása");
    JButton SajatGomb = new JButton("Saját Játék Betöltése");
    JButton JleirasGomb = new JButton("Játék Leírása");
    ImageIcon kep = new ImageIcon("src/Kepek/erdo_kezdo.png");
    ImageIcon ikon = new ImageIcon("src/Kepek/ikon.png");
    JLabel Slender = new JLabel();
    ImageIcon SlenderKep = new ImageIcon("src/Kepek/Slender.png");
    JLabel Slender0 = new JLabel();
    ImageIcon SlenderKep0 = new ImageIcon("src/Kepek/Slender0.png");

    public void kezdoAblak() {

        foCim.setText("The Eight Pages");
        foCim.setBackground(new Color(229, 229, 229));
        foCim.setForeground(new Color(127, 127, 127));
        foCim.setFont(new Font("Cooper Black", Font.BOLD, 100));
        foCim.setHorizontalAlignment(JLabel.CENTER);
        foCim.setOpaque(true);

        GeneralGomb.setBounds(410, 200, 180, 40);
        GeneralGomb.setBackground(new Color(229, 229, 229));
        GeneralGomb.setForeground(new Color(127, 127, 127));
        GeneralGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        GeneralGomb.setFocusable(false);
        GeneralGomb.addActionListener(this);

        SajatGomb.setBounds(410, 300, 180, 40);
        SajatGomb.setBackground(new Color(229, 229, 229));
        SajatGomb.setForeground(new Color(127, 127, 127));
        SajatGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        SajatGomb.setFocusable(false);
        SajatGomb.addActionListener(this);

        JleirasGomb.setBounds(410, 400, 180, 40);
        JleirasGomb.setBackground(new Color(229, 229, 229));
        JleirasGomb.setForeground(new Color(127, 127, 127));
        JleirasGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        JleirasGomb.setFocusable(false);
        JleirasGomb.addActionListener(this);

        Slender.setBounds(70,220,250,320);
        Slender.setIcon(SlenderKep);
        ablak.add(Slender);

        Slender0.setBounds(660,220,250,320);
        Slender0.setIcon(SlenderKep0);
        ablak.add(Slender0);

        erdo.setIcon(kep);
        erdoKep.add(erdo);
        ablak.add(erdoKep);

        ablak.add(GeneralGomb);
        ablak.add(SajatGomb);
        ablak.add(JleirasGomb);
        ablak.setIconImage(ikon.getImage());

        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablak.setSize(1000, 830);
        ablak.getContentPane().setBackground(new Color(50, 50, 50));
        ablak.setLayout(new BorderLayout());
        ablak.setVisible(true);
        ablak.add(foCim, BorderLayout.NORTH);
        ablak.add(erdo, BorderLayout.SOUTH);
        ablak.setResizable(false);
        ablak.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==JleirasGomb) {
            ablak.dispose();
            JatekLeiras jatekLeiras = new JatekLeiras();
            jatekLeiras.jatekleiras();
        }
        if (e.getSource()==GeneralGomb) {
            ablak.dispose();
             JatekAblak palya = new JatekAblak();
             palya.jatek_ablak();
        }
        if (e.getSource()==SajatGomb) {
            ablak.dispose();
            FajlBekeres fajlBekeres = new FajlBekeres();
            fajlBekeres.fajlbekeres();
        }
    }
}