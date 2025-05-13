package controller;

import java.awt.event.*;

import javax.swing.*;

import View.*;

import java.awt.*;

import logica.*;

public class IniciarJuegoController extends MouseAdapter implements ActionListener, KeyListener {

    

    public IniciarJuegoController(JLabel imagenBlancoNegro, JLabel imagenColor, byte tipoJuego, JButton iniciarJuego,
            JButton volver, JTextField nombre) {
        this.imagenBlancoNegro = imagenBlancoNegro;
        this.imagenColor = imagenColor;
        this.tipoJuego = tipoJuego;
        this.iniciarJuego = iniciarJuego;
        this.volver = volver;
        this.nombre = nombre;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource().equals(imagenBlancoNegro)) {
            imagenBlancoNegro.setBorder(BorderFactory.createLineBorder(Color.white, 3));
            imagenColor.setBorder(BorderFactory.createLineBorder(Color.white, 0));
            tipoJuego = 0;
        } else if (e.getSource().equals(imagenColor)) {
            imagenBlancoNegro.setBorder(BorderFactory.createLineBorder(Color.white, 0));
            imagenColor.setBorder(BorderFactory.createLineBorder(Color.white, 3));
            tipoJuego = 1;
        }
        try {
            new musica("src/public/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            new musica("src/public/music/clic.wav").reproducirClic();
        } catch (Exception ex) {
        }
        if (e.getSource().equals(iniciarJuego)) {
            validarJuego(e);
        } else if (e.getSource().equals(volver)) {
            PanelMenu();
        }
    }

    private void validarJuego(ActionEvent e) {
        if (!(nombre.getText().equals("") && (tipoJuego != 0 || tipoJuego != 1))) {
            JFrame ventana = new JFrame();
            Toolkit miPantalla =   Toolkit.getDefaultToolkit();
            Image miIcono = miPantalla.getImage("src/public/extra/spaceinvaders_512_icon.png");
            ventana.setIconImage(miIcono);
            ventana.setSize(600, 700);
            ventana.setLocationRelativeTo(null);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            ventana.setResizable(false);
            ventana.setTitle("Space Invader");
            ventana.add(new Juego(nombre.getText()));
            ventana.setVisible(true);

            App.ventana.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa el nombre y un tipo de enemigo para continuar");
        }
    }

    private void PanelMenu() {
        App.panel.removeAll();
        App.panel.add(App.menu, BorderLayout.CENTER);
        App.panel.revalidate();
        App.panel.repaint();
        App.menu.requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            volverMenu();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    private void volverMenu() {
        App.panel.removeAll();
        App.panel.add(App.menu, BorderLayout.CENTER);
        App.panel.revalidate();
        App.panel.repaint();
        App.menu.requestFocus();
    }

    private JLabel imagenBlancoNegro;
    private JLabel imagenColor;
    private byte tipoJuego;
    private JButton iniciarJuego;
    private JButton volver;
    private JTextField nombre;
}
