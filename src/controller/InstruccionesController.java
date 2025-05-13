package controller;

import java.awt.*;
import java.awt.event.*;

import logica.*;

public class InstruccionesController extends KeyAdapter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new musica("src/public/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
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
