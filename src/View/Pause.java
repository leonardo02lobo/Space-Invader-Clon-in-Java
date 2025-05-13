package View;

import java.awt.*;
import javax.swing.*;

import controller.PauseController;

public class Pause extends JPanel {

    private JLabel VolverJuego = new JLabel("Volver al Juego", SwingConstants.CENTER);
    private JLabel SalirConGuardar = new JLabel("Salir y Guardar", SwingConstants.CENTER);
    private JLabel SalirSinGuardar = new JLabel("Salir sin Guardar", SwingConstants.CENTER);
    private JLabel volumen = new JLabel();
    private JPanel panelVolumen = new JPanel();
    private byte i = 0;
    public boolean bandera = false;
    public boolean detener = false;
    public boolean guardarPartida = false;

    public Pause() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.white, 5));
        setBounds(150, 150, 300, 300);

        panel.setLayout(null);
        panel.setBackground(Color.BLACK);
        add(panel, BorderLayout.CENTER);

        panelVolumen.setLayout(new FlowLayout());
        panelVolumen.setBackground(Color.BLACK);
        add(panelVolumen, BorderLayout.SOUTH);

        crearEtiquetas(VolverJuego, 0, 50, 300, 70, 20, false, "");
        crearEtiquetas(SalirSinGuardar, 0, 100, 300, 70, 20, false, "");
        crearEtiquetas(SalirConGuardar, 0, 150, 300, 70, 20, false, "");
        crearEtiquetas(volumen, 210, 250, 50, 50, 0, true, "./../public/extra/aumentar.jpeg");
    }

    JPanel panel = new JPanel();

    private void crearEtiquetas(JLabel label, int x, int y, int ancho, int alto, int tam, boolean band, String ruta) {
        if (band) {
            Image imagen = new ImageIcon(Pause.class.getResource(ruta)).getImage();
            label.setIcon(new ImageIcon(imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        }
        label.setFont(new Font("OCR A Extended", 1, tam));
        label.setBounds(x, y, ancho, alto);
        label.setForeground(Color.white);
        label.addMouseListener(new PauseController(volumen, label, SalirConGuardar, SalirSinGuardar, VolverJuego, ancho, alto, tam, i, band, detener, guardarPartida, bandera));
        if (label.equals(volumen)) {
            panelVolumen.add(label);
        } else {
            panel.add(label);
        }
    }

}
