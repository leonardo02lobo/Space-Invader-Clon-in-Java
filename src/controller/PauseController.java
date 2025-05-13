package controller;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import View.Pause;

public class PauseController extends MouseAdapter {

    
    

    public PauseController(JLabel volumen, JLabel label, JLabel salirConGuardar, JLabel salirSinGuardar,
            JLabel volverJuego, int ancho, int alto, int tam, byte i, boolean band, boolean detener,
            boolean guardarPartida, boolean bandera) {
        this.volumen = volumen;
        this.label = label;
        SalirConGuardar = salirConGuardar;
        SalirSinGuardar = salirSinGuardar;
        VolverJuego = volverJuego;
        this.ancho = ancho;
        this.alto = alto;
        this.tam = tam;
        this.i = i;
        this.band = band;
        this.detener = detener;
        this.guardarPartida = guardarPartida;
        this.bandera = bandera;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(volumen)) {
            i++;
            Image imagen = null;
            if (i % 2 == 0) {
                App.Musica.reproducir();
                imagen = new ImageIcon(Pause.class.getResource("./../public/Assets/extra/aumentar.jpeg")).getImage();
            } else {
                App.Musica.detener();
                imagen = new ImageIcon(Pause.class.getResource("./../public/Assets/extra/silenciar.jpeg")).getImage();
            }
            volumen.setIcon(new ImageIcon(imagen.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
            if (i > 127) {
                i = 0;
            }
        } else if (e.getSource().equals(VolverJuego)) {
            bandera = true;
        } else if (e.getSource().equals(SalirConGuardar) || e.getSource().equals(SalirSinGuardar)) {
            if (e.getSource().equals(SalirConGuardar)) {
                guardarPartida = true;
            }
            detener = true;
            App.ventana.setVisible(true);
            App.menu.requestFocus();
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (!(label.equals(volumen))) {
            e.getComponent().setFont(new Font("OCR A Extended", Font.TRUETYPE_FONT, tam));
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (!(label.equals(volumen))) {
            e.getComponent().setFont(new Font("OCR A Extended", Font.BOLD, tam));
        }
    }

    private JLabel volumen,label,SalirConGuardar,SalirSinGuardar,VolverJuego;
    private int ancho,alto,tam;
    private byte i;
    private boolean band, detener,guardarPartida,bandera;
}
