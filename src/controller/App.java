package controller;

import java.awt.*;
import javax.swing.*;

import View.Menu;
import logica.*;

public class App {

    public static JFrame ventana = new JFrame();
    public static int ancho = 500;
    public static int alto = 500;
    public static JPanel panel = new JPanel();
    public static Menu menu = new Menu();
    public static musica Musica = new musica("src/public/music/tema_fondo.wav");

    public static void main(String[] args) {
        Toolkit miPantalla =   Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/public/extra/spaceinvaders_512_icon.png");
        ventana.setIconImage(miIcono);
        ventana.setSize(ancho, alto);
        ventana.setLocationRelativeTo(null);
        panel.setLayout(new BorderLayout());
        panel.add(menu, BorderLayout.CENTER);
        ventana.add(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setTitle("Space Invader");
        ventana.setVisible(true);
        try {
            Musica.reproducir();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
