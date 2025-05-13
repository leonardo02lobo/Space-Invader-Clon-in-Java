package Juego;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nivel_1 extends Logica_Juego {

    private JFrame ventana = new JFrame();

    public Nivel_1(byte tipoJuego) {
        this.tipoJuego = tipoJuego;
    }

    public Nivel_1() {
    }

    public void inicializarFrame() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/public/extra/spaceinvaders_512_icon.png");
        ventana.setIconImage(miIcono);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setTitle("Space Invader-Nivel 1");
        ventana.setSize(600, 750);
        ventana.setLocationRelativeTo(null);
        ventana.setResizable(false);
        ventana.add(principal);
        ventana.setVisible(true);

        //agregando el panel
        principal.setBackground(Color.BLACK);
        principal.setLayout(new BorderLayout());
        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        ventana.setVisible(true);

        //metodo que se encarga de la logica del juego y llamar a la nave y los enemigos 
        CrearNave();
        CrearEnemigos();
        Logica();

        ventana.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                minave.mover(e);

                //crear el disparo
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    crearDisparo();
                }
            }
        });
        ventana.setFocusable(true);

        //llamar al metodo que se encarga de la animacion del juego
        hiloJuego(ventana);
    }
}
