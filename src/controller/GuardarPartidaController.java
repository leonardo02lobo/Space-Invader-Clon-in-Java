package controller;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import logica.*;

public class GuardarPartidaController extends KeyAdapter implements ActionListener {

    public GuardarPartidaController(JButton boton, JButton boton2) {
        this.boton = boton;
        this.boton2 = boton2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(boton)) {
            try {
                new musica("src/public/music/clic.wav").reproducirClic();
            } catch (Exception ex) {
            }
            volverMenu();
        } else if(e.getSource().equals(boton2)){
            // Para cargar Juego
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            volverMenu();
        }
    }

    private void volverMenu() {
        App.panel.removeAll();
        App.panel.add(App.menu, BorderLayout.CENTER);
        App.panel.revalidate();
        App.panel.repaint();
        App.menu.requestFocus();
    }

    private JButton boton;
    private JButton boton2;
}
