package Models;


public abstract class Entity {
    private int vida;
    private int ancho;
    private int alto;
    private int x;
    private int y;
    private String urlImage;

    public Entity(int vida,int ancho,int alto,int x,int y,String urlImage){
        this.vida = vida;
        this.ancho = ancho;
        this.alto = alto;
        this.x = x;
        this.y = y;
        this.urlImage = urlImage;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
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

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
