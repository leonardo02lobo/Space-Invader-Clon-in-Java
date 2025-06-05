package Juego.enemigos;

public abstract class Alienigenas {

    protected int ancho = 25;
    protected int alto = 25;
    private int x;
    private int y;
    protected final int movimiento = 10;
    private String imagen;

    public Alienigenas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
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

    public int getY() {
        return y;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void moverX() {
        x += movimiento;
    }

    public void moverY() {
        y += 30;
    }

    public void moverXNegativo() {
        x -= movimiento;
    }
    
    public abstract int getPuntos();
}
