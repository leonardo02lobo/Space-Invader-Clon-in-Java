package controller;

import javax.swing.*;

import View.*;
import logica.*;
import java.awt.*;
import java.awt.event.*;

public class MenuController extends KeyAdapter {

    public MenuController(int x, int y, JLabel flecha, JLabel salirJuego, JLabel creditos, JLabel instrucciones,
            JLabel iniciarPartida, JLabel guardarPartida) {
        this.x = x;
        this.y = y;
        this.flecha = flecha;
        SalirJuego = salirJuego;
        Creditos = creditos;
        Instrucciones = instrucciones;
        this.iniciarPartida = iniciarPartida;
        GuardarPartida = guardarPartida;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_S) {
            if (y != 350) {
                y += 50;
            }
        } else if (e.getKeyCode() == KeyEvent.VK_W) {
            if (y != 150) {
                y -= 50;
            }
        }
        flecha.setLocation(x, y);
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (flecha.getY() == iniciarPartida.getY()) {

                cambiarPanel(new IniciarJuego());
            } else if (flecha.getY() == GuardarPartida.getY()) {

                cambiarPanel(new GuardarPartida());
            } else if (flecha.getY() == Instrucciones.getY()) {

                cambiarPanel(new Instrucciones());
            } else if (flecha.getY() == Creditos.getY()) {

                cambiarPanel(new Creditos());
            } else if (flecha.getY() == SalirJuego.getY()) {

                System.exit(0);
            }
        }
        try {
            new musica("src/source/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
        }
    }

    private void cambiarPanel(JPanel panel) {
        App.panel.removeAll();
        App.panel.add(panel, BorderLayout.CENTER);
        App.panel.revalidate();
        App.panel.repaint();
    }

    private int x;
    private int y;
    private JLabel flecha;
    private JLabel SalirJuego;
    private JLabel Creditos;
    private JLabel Instrucciones;
    private JLabel iniciarPartida;
    private JLabel GuardarPartida;
}
