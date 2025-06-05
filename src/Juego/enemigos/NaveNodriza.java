package Juego.enemigos;

public class NaveNodriza extends Alienigenas {

    private int movimientoX;
    private final int movimientoY = 20;

    public NaveNodriza(int x, int y) {
        super(x, y);
        ancho = 50;
        alto = 30;
    }

    @Override
    public int getPuntos() {
        return (int) (Math.random() * (100 - 50) + 50);
    }
}
