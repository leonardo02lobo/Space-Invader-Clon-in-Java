package Models.enemigo;

import Models.Entity;
import Models.Interfaces.IMover;

public class Enemigo extends Entity implements IMover{

    public Enemigo(int vida, int ancho, int alto, int x, int y, String urlImage,int puntosEnemigo) {
        super(vida, ancho, alto, x, y, urlImage);
        this.puntosEnemigo = puntosEnemigo;
    }

    @Override
    public void Movimiento() {
    }
    private int puntosEnemigo;
}