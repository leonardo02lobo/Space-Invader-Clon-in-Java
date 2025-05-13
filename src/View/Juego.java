package View;

import java.awt.*;

import javax.swing.*;

import Models.Entity;
import Models.Personaje.Nave;
import controller.NaveController;

public class Juego extends JPanel{
    
    public Juego(String nombre){
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        add(new VistaSuperior(nombre),BorderLayout.NORTH);
        panelJuego.setLayout(null);
        panelJuego.setBackground(Color.BLACK);
        add(panelJuego,BorderLayout.CENTER);
        add(new VistaInferior(VidasTotales),BorderLayout.SOUTH);
        InicializarJuego();
    }

    private void InicializarJuego(){
        Image img = new ImageIcon(getClass().getResource(naveEspacial.getUrlImage())).getImage();
        labelNave.setIcon(new ImageIcon(img.getScaledInstance(naveEspacial.getAncho(), naveEspacial.getAlto(), Image.SCALE_SMOOTH)));
        labelNave.setBounds(naveEspacial.getX(),naveEspacial.getY(),naveEspacial.getAncho(),naveEspacial.getAlto());
        labelNave.addKeyListener(new NaveController(labelNave,panelJuego));
        labelNave.setFocusable(true);
        panelJuego.add(labelNave);
    }

    private String nombre;
    private int VidasTotales = 3;
    private JPanel panelJuego = new JPanel();
    private Entity naveEspacial = new Nave(3, 50,50, 200, 500, "./../public/Assets/personaje/Disparador.png");
    private JLabel labelNave = new JLabel();
}
