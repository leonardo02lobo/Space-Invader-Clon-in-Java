package Juego.personaje;

import Juego.*;
import java.awt.*;
import javax.swing.*;

public class DisparoPersonaje extends Disparo {

    public DisparoPersonaje(int x, int y) {
        super(x, y);
        setIcon(new ImageIcon(imagenDisparo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
        setBounds(x, y, ancho, alto);
    }

    public int movimientoDisparo() {
        return movimiento;
    }

    @Override
    public Rectangle getRectangle() {
        return this.getBounds();
    }

    public void ExplotarDisparo(JPanel panel) {
        Image img = new ImageIcon(getClass().getResource("./../../public/Assets/Sprites Color/explosiongreen.png"))
                .getImage();
        setIcon(new ImageIcon(img.getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        setSize(30, 30);
        try {
            Thread.sleep(200);
            panel.remove(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Image imagenDisparo = new ImageIcon(
            DisparoPersonaje.class.getResource("./../../public/Assets/personaje/Bala.png")).getImage();
}
