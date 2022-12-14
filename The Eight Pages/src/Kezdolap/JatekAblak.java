package Kezdolap;
import jatek.Jatek;
import jatek.Lapfelvetel;
import jatek.Mozgas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static jatek.Jatek.nyertel;
import static jatek.Jatek.vesztettel;

public class JatekAblak implements ActionListener {

    public JButton visszaGomb = new JButton("Játék feladása");
    public static JFrame ablakJatek = new JFrame("The eight pages");
    public static JLabel papirokSzama = new JLabel();
    public static JLabel begyujtve = new JLabel();
    public static JLabel poz = new JLabel();
    public static JLabel poz2 = new JLabel();
    public static JLabel pozErtek = new JLabel();
    public static JPanel jatekAla = new JPanel();
    public static JLabel hatter = new JLabel();
    public static ImageIcon hatterkep = new ImageIcon("src/Kepek/kesz.png");
    public static JLayeredPane gyozelemVagyVereseg = new JLayeredPane();
    public static ImageIcon vereseg = new ImageIcon("src/Kepek/Vesztettel.png");
    public static ImageIcon gyozelem = new ImageIcon("src/Kepek/Nyertel.png");
    public static JLabel veresege = new JLabel(vereseg);
    public static JLabel gyozelme = new JLabel(gyozelem);
    JLabel Slenderke = new JLabel();
    ImageIcon SlenderkeKep0 = new ImageIcon("src/Kepek/Slenderke.png");


    public void jatek_ablak() {
        papirokSzama.setText(Lapfelvetel.ennyiLapodVanMar+ "/8 Papír");
        papirokSzama.setBackground(new Color(120,120,120)); 
        papirokSzama.setForeground(new Color(70, 70, 70));
        papirokSzama.setFont(new Font("Cooper Black", Font.BOLD, 20));
        papirokSzama.setBounds(54,160,130,24);
        papirokSzama.setOpaque(true);

        begyujtve.setText("Begyujtve");
        begyujtve.setBackground(new Color(120,120,120)); 
        begyujtve.setForeground(new Color(70, 70, 70));
        begyujtve.setFont(new Font("Cooper Black", Font.BOLD, 20));
        begyujtve.setBounds(50,184,130,24);
        begyujtve.setOpaque(true);

        poz.setText("Jelenlegi");
        poz.setBackground(new Color(120,120,120)); 
        poz.setForeground(new Color(70, 70, 70));
        poz.setFont(new Font("Cooper Black", Font.BOLD, 20));
        poz.setBounds(55,300,130,24);
        poz.setOpaque(true);

        poz2.setText("Pozíció:");
        poz2.setBackground(new Color(120,120,120)); 
        poz2.setForeground(new Color(70, 70, 70));
        poz2.setFont(new Font("Cooper Black", Font.BOLD, 20));
        poz2.setBounds(64,324,130,24);
        poz2.setOpaque(true);

        pozErtek.setText("X: " + Mozgas.xPoz  + "  " + "Y: " + Mozgas.yPoz );
        pozErtek.setBackground(new Color(120,120,120)); 
        pozErtek.setForeground(new Color(70, 70, 70));
        pozErtek.setFont(new Font("Cooper Black", Font.BOLD, 20));
        pozErtek.setBounds(47,348,130,24);
        pozErtek.setOpaque(true);

        visszaGomb.setBounds(20, 20, 180, 40);
        visszaGomb.setBackground(new Color(229, 229, 229));
        visszaGomb.setForeground(new Color(127, 127, 127));
        visszaGomb.setFont(new Font("Cooper Black", Font.ITALIC, 12));
        visszaGomb.setFocusable(false);
        visszaGomb.addActionListener(this);

        ablakJatek.add(visszaGomb);

        jatekAla.setBounds(225,30,730,730);
        jatekAla.setBackground(new Color(50,50,50));

        Slenderke.setBounds(10,450,200,320);
        Slenderke.setIcon(SlenderkeKep0);
        ablakJatek.add(Slenderke);

        hatter.setIcon(hatterkep);
        jatekAla.add(hatter);
        ablakJatek.add(jatekAla);
        ablakJatek.add(begyujtve);
        ablakJatek.add(papirokSzama);
        ablakJatek.add(poz);
        ablakJatek.add(poz2);
        ablakJatek.add(pozErtek);

        ablakJatek.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ablakJatek.setSize(1000, 830);
        ablakJatek.getContentPane().setBackground(new Color(120, 120, 120));
        ablakJatek.setLayout(null);
        ablakJatek.setVisible(true);
        ablakJatek.setLocationRelativeTo(null);
        ablakJatek.setResizable(false);

        ImageIcon ikon = new ImageIcon("src/Kepek/ikon.png");
        ablakJatek.setIconImage(ikon.getImage());

        if (FajlBekeres.FajlHelye != null) {
            Jatek asd = new Jatek();
            asd.jatek_letrehozva();
            FajlBekeres.FajlHelye = null;
        }else {
            Jatek bakj = new Jatek();
            bakj.jatek();
        }
    }

    public static void vegeajateknak() {

        if (vesztettel) {

            ablakJatek.getContentPane().removeAll();
            ablakJatek.repaint();
            papirokSzama.removeAll();
            papirokSzama.repaint();
            begyujtve.removeAll();
            begyujtve.repaint();

            gyozelemVagyVereseg.setBounds(0,0,1000, 830);
            ablakJatek.add(gyozelemVagyVereseg);

            veresege.setOpaque(true);
            veresege.setBounds(0,0,1000, 830);
            gyozelemVagyVereseg.add(veresege);
        }
        if (nyertel) {

            ablakJatek.getContentPane().removeAll();
            ablakJatek.repaint();
            papirokSzama.removeAll();
            papirokSzama.repaint();
            begyujtve.removeAll();
            begyujtve.repaint();

            gyozelemVagyVereseg.setBounds(0,0,1000, 830);
            ablakJatek.add(gyozelemVagyVereseg);

            gyozelme.setOpaque(true);
            gyozelme.setBounds(0,0,1000, 830);
            gyozelemVagyVereseg.add(gyozelme);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == visszaGomb) {
            
            String[] lehetosegek2 = {"Igen", "Maradok!"};
            ImageIcon ikon2 = new ImageIcon("src/Kepek/ikon1.png");

            int x2 = JOptionPane.showOptionDialog(null, "Biztosan? Elveszik az eredményed!",
                    "Abbahagyod?", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, ikon2, lehetosegek2, 0);
            if (x2 == 0) {
                ablakJatek.remove(jatekAla);
                ablakJatek.remove(hatter);
                ablakJatek.dispose();
            }
        }
    }
}