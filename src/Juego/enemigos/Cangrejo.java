package Juego.enemigos;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Cangrejo extends Alienigenas {

    private Image imagenCangrejoBlanco[] = {
        new ImageIcon(Cangrejo.class.getResource("./../../public/Assets/enemigos/Cangrejo 1.png")).getImage(),
        new ImageIcon(Cangrejo.class.getResource("./../../public/Assets/enemigos/Cangrejo 2.png")).getImage(),};
    private Image imagenCangrejoColor[] = {
        new ImageIcon(Cangrejo.class.getResource("./../../public/Assets/Sprites Color/enemy2_1.png")).getImage(),
        new ImageIcon(Cangrejo.class.getResource("./../../public/Assets/Sprites Color/enemy2_1.png")).getImage(),};
    private int i = 0;
    private Image imagen[] = null;

    public Cangrejo(int x, int y) {
        super(x, y);
    }

    @Override
    public int getPuntos() {
        return 20;
    }

}
