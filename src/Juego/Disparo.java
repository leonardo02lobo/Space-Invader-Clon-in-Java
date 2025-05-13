package Juego;

import java.awt.*;
import javax.swing.*;

public abstract class Disparo extends JLabel {
    /**
     * Variabloesdeclaradas que determinan las proporcion de la imagen
     * y la velocidad del movimiento con la que va el disparo
     */
    protected final int ancho = 10;
    protected final int alto = 20;
    private int x;
    private int y;
    protected final int movimiento = 30;

    public Disparo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getMovimiento() {
        return movimiento;
    }

    /**
     * Este metodo genera un objeto de la clase rectangle que ayuda a las colisiones
     * del programa
     * 
     * @return
     */
    public Rectangle getRectangle() {
        return this.getBounds();
    }
}
