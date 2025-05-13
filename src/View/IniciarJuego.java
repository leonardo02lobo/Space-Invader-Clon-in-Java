package View;

import controller.*;

import java.awt.*;
import javax.swing.*;


public class IniciarJuego extends JPanel {

    public IniciarJuego() {
        setLayout(null);
        setBackground(Color.BLACK);

        crearEtiquetas(new JLabel("Space Invader", SwingConstants.CENTER), 100, 50, 300, 70, 35, false, "");
        crearEtiquetas(etiquetaNombre, 140, 130, 200, 30, 15, false, "");
        crearEtiquetas(imagenBlancoNegro, 100, 250, 100, 100, 20, true, "./../public/Assets/enemigos/Calamar 2.png");
        crearEtiquetas(imagenColor, 300, 250, 100, 100, 20, true, "./../public/Assets/Sprites Color/enemy1_1.png");
        Cajas(nombre, 100, 180, 300, 30);
        CrearBoton(iniciarJuego, 120, 420, 100, 30, "Iniciar");
        CrearBoton(volver, 270, 420, 100, 30, "volver");
    }

    private void crearEtiquetas(JLabel label, int x, int y, int ancho, int alto, int tam, boolean band, String ruta) {
        if (band) {
            Image imagen = new ImageIcon(IniciarJuego.class.getResource(ruta)).getImage();
            label.setIcon(new ImageIcon(imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
            label.setBorder(BorderFactory.createLineBorder(Color.blue, 1));
        }
        label.setFont(new Font("OCR A Extended", Font.BOLD, tam));
        label.setBounds(x, y, ancho, alto);
        label.setForeground(Color.white);
        label.addMouseListener(iniciarJuegoController);
        add(label);
    }

    private void Cajas(JTextField caja, int x, int y, int ancho, int alto) {
        caja.setFont(new Font("calibri", Font.PLAIN, 25));
        caja.setBounds(x, y, ancho, alto);
        caja.setBackground(Color.BLACK);
        caja.setForeground(Color.white);
        caja.setOpaque(false);
        add(caja);
    }

    private void CrearBoton(JButton boton, int x, int y, int ancho, int alto, String texto) {
        boton.setText(texto);
        boton.setFont(new Font("OCR A Extended", 1, 15));
        boton.setBackground(Color.BLACK);
        boton.setFocusable(false);
        boton.setForeground(Color.white);
        boton.setBounds(x, y, ancho, alto);

        boton.addActionListener(iniciarJuegoController);

        App.panel.setFocusable(true);
        App.panel.addKeyListener(iniciarJuegoController);
        add(boton);
    }

    private JLabel etiquetaNombre = new JLabel("Ingrese su nombre:", SwingConstants.CENTER);
    private JLabel imagenBlancoNegro = new JLabel();
    private JLabel imagenColor = new JLabel();
    private JTextField nombre = new JTextField();
    private JButton iniciarJuego = new JButton();
    private JButton volver = new JButton();
    private byte tipoJuego;
    private IniciarJuegoController iniciarJuegoController = new IniciarJuegoController(imagenBlancoNegro, imagenColor, tipoJuego,iniciarJuego,volver,nombre);
}
