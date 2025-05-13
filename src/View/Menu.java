package View;

import controller.*;

import java.awt.*;
import javax.swing.*;


public class Menu extends JPanel {

    public Menu() {
        setLayout(null);
        setSize(App.ancho, App.alto);
        setBackground(Color.BLACK);

        crearEtiquetas(titulo, 60, 50, 350, 70, false, 35);
        crearEtiquetas(iniciarPartida, 163, 150, 180, 30, false, 20);
        crearEtiquetas(GuardarPartida, 150, 200, 200, 30, false, 20);
        crearEtiquetas(Instrucciones, 160, 250, 180, 30, false, 20);
        crearEtiquetas(Creditos, 160, 300, 180, 30, false, 20);
        crearEtiquetas(SalirJuego, 160, 350, 200, 30, false, 20);
        crearEtiquetas(flecha, 105, 150, 30, 30, true, 20);
        flecha.setFocusable(true);
    }

    public void requestFocus() {
        flecha.requestFocusInWindow();
    }

    private void crearEtiquetas(JLabel label, int x, int y, int ancho, int alto, boolean band, int tam) {
        if (band) {
            Image imagenFlecha = new ImageIcon(Menu.class.getResource("./../public/Assets/flecha_menu.png")).getImage();
            label.setIcon(new ImageIcon(imagenFlecha.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        }
        if (label.equals(titulo)) {
            label.setForeground(Color.YELLOW);
        } else {
            label.setForeground(Color.white);
        }
        label.setFont(new Font("OCR A Extended", Font.BOLD, tam));
        label.setBounds(x, y, ancho, alto);
        label.addKeyListener(
                new MenuController(x, y, flecha, SalirJuego, Creditos, Instrucciones, iniciarPartida, GuardarPartida));
        add(label);
    }

    private JLabel titulo = new JLabel(" Space Invader", SwingConstants.CENTER);
    private JLabel iniciarPartida = new JLabel("Iniciar Juego", SwingConstants.CENTER);
    private JLabel GuardarPartida = new JLabel("Guardar Partida", SwingConstants.CENTER);
    private JLabel Instrucciones = new JLabel("Instrucciones", SwingConstants.CENTER);
    private JLabel Creditos = new JLabel("Creditos", SwingConstants.CENTER);
    private JLabel SalirJuego = new JLabel("Salir Del Juego", SwingConstants.CENTER);
    private JLabel flecha = new JLabel();
}
