package View;

import controller.App;
import controller.GuardarPartidaController;

import java.awt.*;
import javax.swing.*;


public class GuardarPartida extends JPanel {

    public GuardarPartida() {
        JButton boton = new JButton("atras");
        JButton boton2 = new JButton("cargar partida");
        GuardarPartidaController guardarPartidaController = new GuardarPartidaController(boton,boton2);
        setBackground(Color.BLACK);

        boton.addActionListener(guardarPartidaController);
        add(boton);
  
        boton2.addActionListener(guardarPartidaController);
        add(boton2);

        App.panel.setFocusable(true);
        App.panel.addKeyListener(guardarPartidaController);

    }
}
