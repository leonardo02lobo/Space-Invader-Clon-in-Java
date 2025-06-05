package Juego.enemigos;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Pulpo extends Alienigenas {
    private Image imagenPulpoBlanco[] = {
        new ImageIcon(Pulpo.class.getResource("./../../public/Assets/enemigos/Pulpo 1.png")).getImage(),
        new ImageIcon(Pulpo.class.getResource("./../../public/Assets/enemigos/Pulpo 2.png")).getImage(),
        new ImageIcon(Pulpo.class.getResource("./../../public/Assets/enemigos/Muerte enemigo.png")).getImage(),};
    private Image imagenPulpoColor[] = {
        new ImageIcon(Pulpo.class.getResource("./../../public/Assets/Sprites Color/enemy3_1.png")).getImage(),
        new ImageIcon(Pulpo.class.getResource("./../../public/Assets/Sprites Color/enemy3_2.png")).getImage(),
        new ImageIcon(Pulpo.class.getResource("./../../public/Assets/Sprites Color/explosiongreen.png")).getImage(),};
    private int i = 0;
    private Image imagen[] = null;
    public Pulpo(int x, int y) {
        super(x, y);
    }


    @Override
    public int getPuntos() {
        return 10;
    }
}
