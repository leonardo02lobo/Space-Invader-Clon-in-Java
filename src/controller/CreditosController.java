package controller;

import java.awt.*;
import java.awt.event.*;

import logica.musica;

public class CreditosController extends KeyAdapter implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new musica("src/public/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
        }
        volverMenu();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        try {
            new musica("src/public/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
        }
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
}
