package View;

import java.awt.*;

import javax.swing.*;

import Juego.enemigos.Alienigenas;
import Juego.enemigos.Calamar;
import Juego.enemigos.Cangrejo;
import Juego.enemigos.Pulpo;
import Models.*;
import Models.Personaje.*;
import controller.*;

public class Juego extends JPanel {

    public Juego(String nombre) {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        add(new VistaSuperior(nombre), BorderLayout.NORTH);
        panelJuego.setLayout(null);
        panelJuego.setBackground(Color.BLACK);
        add(panelJuego, BorderLayout.CENTER);
        add(new VistaInferior(VidasTotales), BorderLayout.SOUTH);
        InicializarJuego();

        panelJuego.addMouseListener(new PanelJuegoController(labelNave, panelJuego));
    }

    private void InicializarJuego() {
        Image img = new ImageIcon(getClass().getResource(naveEspacial.getUrlImage())).getImage();
        labelNave.setIcon(new ImageIcon(
                img.getScaledInstance(naveEspacial.getAncho(), naveEspacial.getAlto(), Image.SCALE_SMOOTH)));
        labelNave.setBounds(naveEspacial.getX(), naveEspacial.getY(), naveEspacial.getAncho(), naveEspacial.getAlto());
        NaveController naveController = new NaveController(labelNave, panelJuego);
        labelNave.addKeyListener(naveController);
        labelNave.setFocusable(true);
        panelJuego.add(labelNave);
        CrearEnemigos();
    }

    private void CrearEnemigos() {
        for (int i = 0; i < labelEnemigos.length; i++) {
            for (int j = 0; j < labelEnemigos[i].length; j++) {
                labelEnemigos[i][j] = new JLabel();
                enemigos[i][j].setImagen("./../public/Assets/Sprites Color/enemy1_2.png");
                Image img = new ImageIcon(getClass().getResource(enemigos[i][j].getImagen()))
                        .getImage();
                labelEnemigos[i][j].setIcon(
                        new ImageIcon(img.getScaledInstance(enemigos[i][j].getAncho(), enemigos[i][j].getAlto(),
                                Image.SCALE_SMOOTH)));
                labelEnemigos[i][j].setBounds(enemigos[i][j].getX(), enemigos[i][j].getY(), enemigos[i][j].getAncho(),
                        enemigos[i][j].getAlto());
                panelJuego.add(labelEnemigos[i][j]);
            }
        }
        Thread hilo = new Thread(() -> {
            boolean band = true;
            while (true) {
                try {
                    for (int i = 0; i < enemigos.length; i++) {
                        for (int j = 0; j < enemigos[i].length; j++) {
                            if (band) {
                                enemigos[i][j].setImagen("./../public/Assets/Sprites Color/enemy1_1.png");
                                band = false;
                            } else {
                                enemigos[i][j].setImagen("./../public/Assets/Sprites Color/enemy1_2.png");
                                band = true;
                            }
                            Image img = new ImageIcon(getClass().getResource(enemigos[i][j].getImagen()))
                                    .getImage();
                            labelEnemigos[i][j].setIcon(new ImageIcon(
                                    img.getScaledInstance(enemigos[i][j].getAncho(), enemigos[i][j].getAlto(),
                                            Image.SCALE_SMOOTH)));
                        }
                    }
                    System.out.println(band);
                    Thread.sleep(300);
                    panelJuego.revalidate();
                    panelJuego.repaint();
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage());
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        });
        hilo.start();
    }

    private int VidasTotales = 3;
    private JPanel panelJuego = new JPanel();
    private Entity naveEspacial = new Nave(3, 50, 50, 200, 500, "./../public/Assets/personaje/Disparador.png");
    private JLabel labelNave = new JLabel();
    private Alienigenas enemigos[][] = {
            { new Calamar(45, 100), new Calamar(90, 100), new Calamar(135, 100), new Calamar(180, 100),
                    new Calamar(225, 100), new Calamar(270, 100), new Calamar(315, 100), new Calamar(360, 100),
                    new Calamar(405, 100), new Calamar(450, 100), new Calamar(495, 100) },
            { new Cangrejo(45, 145), new Cangrejo(90, 145), new Cangrejo(135, 145), new Cangrejo(180, 145),
                    new Cangrejo(225, 145), new Cangrejo(270, 145), new Cangrejo(315, 145), new Cangrejo(360, 145),
                    new Cangrejo(405, 145), new Cangrejo(450, 145), new Cangrejo(495, 145) },
            { new Cangrejo(45, 190), new Cangrejo(90, 190), new Cangrejo(135, 190), new Cangrejo(180, 190),
                    new Cangrejo(225, 190), new Cangrejo(270, 190), new Cangrejo(315, 190), new Cangrejo(360, 190),
                    new Cangrejo(405, 190), new Cangrejo(450, 190), new Cangrejo(495, 190) },
            { new Pulpo(45, 235), new Pulpo(90, 235), new Pulpo(135, 235), new Pulpo(180, 235), new Pulpo(225, 235),
                    new Pulpo(270, 235), new Pulpo(315, 235), new Pulpo(360, 235), new Pulpo(405, 235),
                    new Pulpo(450, 235), new Pulpo(495, 235) },
            { new Pulpo(45, 280), new Pulpo(90, 280), new Pulpo(135, 280), new Pulpo(180, 280), new Pulpo(225, 280),
                    new Pulpo(270, 280), new Pulpo(315, 280), new Pulpo(360, 280), new Pulpo(405, 280),
                    new Pulpo(450, 280), new Pulpo(495, 280) }, };
    private JLabel[][] labelEnemigos = new JLabel[enemigos.length][enemigos[0].length];
}
