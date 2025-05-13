package View;

import java.awt.*;
import javax.swing.*;

import controller.VistaSuperiorController;

public class VistaSuperior extends JPanel {

    public VistaSuperior(String nombre){
        System.out.println(nombre);
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());
        panelPuntos.setBackground(Color.BLACK);
        add(panelPuntos,BorderLayout.WEST);
        
        panelBoton.setBackground(Color.BLACK);
        add(panelBoton,BorderLayout.EAST);
        
        
        Score.setText("NAME: "+nombre);
        Score.setFont(new Font("OCR A Extended",2,20));
        Score.setForeground(Color.WHITE);
        panelPuntos.add(Score);
        
        Points.setFont(new Font("OCR A Extended",2,20));
        Points.setText("    POINTS: "+puntos);
        Points.setForeground(Color.WHITE);
        panelPuntos.add(Points);
        
        JButton boton = new JButton();
        boton.setForeground(Color.WHITE);
        boton.setBackground(Color.BLACK);
        boton.setFont(new Font("OCR A Extended",2,20));
        boton.setText("Menu");
        boton.setBounds(400, 10, 100,30);
        boton.setFocusable(false);
        boton.addActionListener(new VistaSuperiorController(band));
        panelBoton.add(boton);
        
    }

    public void SumarPuntos(int suma){
        puntos += suma;
        Points.setText("    POINTS: "+puntos);
    }

    public int getPuntos() {
        return puntos;
    }    
 
    private JLabel Points = new JLabel();
    private int puntos = 0;
    private JPanel panelPuntos = new JPanel();
    private JPanel panelBoton = new JPanel();
    private boolean band = false;
    private JLabel Score = new JLabel();
}
