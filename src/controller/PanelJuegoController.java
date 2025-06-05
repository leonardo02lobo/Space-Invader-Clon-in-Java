package controller;

import java.awt.event.*;

import javax.swing.*;

import Juego.personaje.*;

public class PanelJuegoController extends MouseAdapter {

    public PanelJuegoController(JLabel labelNave, JPanel panelJuego) {
        this.labelNave = labelNave;
        this.panelJuego = panelJuego;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (animacionEnCurso)
            return;

        animacionEnCurso = true;
        DisparoPersonaje disparoPersonaje = new DisparoPersonaje(labelNave.getX() + (labelNave.getWidth() / 2),
                labelNave.getY());
        panelJuego.add(disparoPersonaje);

        Thread hilo = new Thread(() -> {
            try {
                int y = disparoPersonaje.getY();
                while (animacionEnCurso) {
                    if(y <= 0){
                        disparoPersonaje.ExplotarDisparo(panelJuego);
                        animacionEnCurso = false;
                    }
                    y -= disparoPersonaje.movimientoDisparo();
                    Thread.sleep(100);
                    disparoPersonaje.setY(y);
                    panelJuego.revalidate();
                    panelJuego.repaint();
                }
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }

        });
        hilo.start();
    }

    private JLabel labelNave;
    private JPanel panelJuego;
    private boolean animacionEnCurso = false;
}
