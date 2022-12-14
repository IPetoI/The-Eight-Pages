package jatek;

import javax.swing.*;

import SzemelyekTargyak.Papir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Kezdolap.JatekAblak.papirokSzama;
import static SzemelyekTargyak.Karakter.karakter;

public class Lapfelvetel implements ActionListener {

    public Action felveszem;
    Papir papir = new Papir();
    public static int ennyiLapodVanMar = 0;

    public void lapfelvetel() {

        felveszem = new felveszem();

        karakter.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "felveszem");
        karakter.getActionMap().put("felveszem", felveszem);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class felveszem extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (papir.papirLathato11(karakter.getX(),karakter.getY())) {
                Papir.papir11.setVisible(false);
                Papir.papir11.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirlathato12(karakter.getX(),karakter.getY())) {
                Papir.papir12.setVisible(false);
                Papir.papir12.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato13(karakter.getX(),karakter.getY())) {
                Papir.papir13.setVisible(false);
                Papir.papir13.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato14(karakter.getX(),karakter.getY())) {
                Papir.papir14.setVisible(false);
                Papir.papir14.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato1(karakter.getX(),karakter.getY())) {
                Papir.papir1.setVisible(false);
                Papir.papir1.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else  if (papir.papirLathato2(karakter.getX(),karakter.getY())) {
                Papir.papir2.setVisible(false);
                Papir.papir2.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato3(karakter.getX(),karakter.getY())) {
                Papir.papir3.setVisible(false);
                Papir.papir3.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato4(karakter.getX(),karakter.getY())) {
                Papir.papir4.setVisible(false);
                Papir.papir4.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato5(karakter.getX(),karakter.getY())) {
                Papir.papir5.setVisible(false);
                Papir.papir5.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato6(karakter.getX(),karakter.getY())) {
                Papir.papir6.setVisible(false);
                Papir.papir6.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato7(karakter.getX(),karakter.getY())) {
                Papir.papir7.setVisible(false);
                Papir.papir7.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato8(karakter.getX(),karakter.getY())) {
                Papir.papir8.setVisible(false);
                Papir.papir8.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato9(karakter.getX(),karakter.getY())) {
                Papir.papir9.setVisible(false);
                Papir.papir9.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }else if (papir.papirLathato10(karakter.getX(),karakter.getY())) {
                Papir.papir10.setVisible(false);
                Papir.papir10.setBounds(1300,1300,48,48);
                ennyiLapodVanMar++;
            }
            Jatek.veresegVagyGyozelem();
            System.out.println("Összegyüjtött papírjaid száma: "+ Lapfelvetel.ennyiLapodVanMar);
            papirokSzama.setText(Lapfelvetel.ennyiLapodVanMar + "/8 Papír");
            Kezdolap.JatekAblak.vegeajateknak();
        }
    }
}
