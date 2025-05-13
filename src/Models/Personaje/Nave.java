package Models.Personaje;

import Models.Entity;
import Models.Interfaces.IMover;

public class Nave extends Entity implements IMover{

    public Nave(int vida, int ancho, int alto, int x, int y, String urlImage) {
        super(vida, ancho, alto, x, y, urlImage);
    }

    @Override
    public void Movimiento() {
    }
    
}
