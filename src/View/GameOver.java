package View;

import java.awt.*;
import javax.swing.*;
import controller.*;

public class GameOver extends JPanel {

    public GameOver() {
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        setBorder(BorderFactory.createLineBorder(Color.white, 5));
        setBounds(100, 150, 350, 200);
        add(new TituloPerdido(), BorderLayout.CENTER);
        add(new Botones(), BorderLayout.SOUTH);
    }
}

class TituloPerdido extends JPanel {

    public TituloPerdido() {
        setBackground(Color.BLACK);
        titulo.setText("Game Over");
        titulo.setFont(new Font("OCR A Extended", Font.BOLD, 40));
        titulo.setForeground(Color.white);
        add(titulo);
    }
    JLabel titulo = new JLabel();
}

class Botones extends JPanel {

    public Botones() {
        setBackground(Color.BLACK);
        CrearBoton(volver,"volver");
        CrearBoton(salir,"salir del Juego");
    }

    private void CrearBoton(JButton boton, String texto) {
        boton.setText(texto);
        boton.setFont(new Font("OCR A Extended", 1, 15));
        boton.setBackground(Color.BLACK);
        boton.setFocusable(false);
        boton.setForeground(Color.white);
        boton.addActionListener(new GameOverController(volver,salir));
        add(boton);
    }
    JButton volver = new JButton();
    JButton salir = new JButton();
}
