package Juego.enemigos;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Calamar extends Alienigenas {

    private Image imagenCalamarBlanco[] = {
        new ImageIcon(Calamar.class.getResource("./../../public/Assets/enemigos/Calamar 1.png")).getImage(),
        new ImageIcon(Calamar.class.getResource("./../../public/Assets/enemigos/Calamar 2.png")).getImage(),};
    private Image imagenCalamarColor[] = {
        new ImageIcon(Calamar.class.getResource("./../../public/Assets/Sprites Color/enemy1_1.png")).getImage(),
        new ImageIcon(Calamar.class.getResource("./../../public/Assets/Sprites Color/enemy1_2.png")).getImage(),};
    private int i = 0;
    private Image imagen[] = null;

    public Calamar(int x, int y) {
        super(x, y);
    }
    

    public Image[] getImagenCalamarBlanco() {
        return imagenCalamarBlanco;
    }


    public Image[] getImagenCalamarColor() {
        return imagenCalamarColor;
    }

    @Override
    public int getPuntos() {
        return 30;
    }

}
