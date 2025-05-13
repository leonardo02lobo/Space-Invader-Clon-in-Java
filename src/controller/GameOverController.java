package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Juego.Nivel_1;
import logica.musica;

public class GameOverController implements ActionListener {

    public GameOverController(JButton volver, JButton salir) {
        this.volver = volver;
        this.salir = salir;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new musica("src/source/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
        }
        if (e.getSource().equals(volver)) {
            App.ventana.setVisible(true);
            Nivel_1.band_finalizar_Juego = true;
            App.menu.requestFocus();
        }
        if (e.getSource().equals(salir)) {
            System.exit(0);
        }
    }

    private JButton volver;
    private JButton salir;
}
