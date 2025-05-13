package View;

import java.awt.*;
import javax.swing.*;

public class VistaInferior extends JPanel {

    public VistaInferior(int VidasTotales) {
        this.VidasTotales = VidasTotales;
        setLayout(new BorderLayout());
        setBackground(Color.BLACK);
        panelVidas.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelVidas.setBackground(Color.BLACK);
        add(panelVidas, BorderLayout.WEST);

        PanelCreditos.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        PanelCreditos.setBackground(Color.BLACK);
        add(PanelCreditos, BorderLayout.EAST);

        setBorder(BorderFactory.createMatteBorder(2, 0, 0, 0, Color.GREEN));

        vidas.setText(Integer.toString(VidasTotales));
        vidas.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        vidas.setForeground(Color.white);
        panelVidas.add(vidas);

        InicializarVidas();

        creditos.setText("CREDIT 00");
        creditos.setFont(new Font("OCR A Extended", Font.BOLD, 20));
        creditos.setForeground(Color.white);
        PanelCreditos.add(creditos);
    }

    public void InicializarVidas() {
        JLabel vidasPersonaje[] = new JLabel[VidasTotales];
        
        for (int i = 0; i < vidasPersonaje.length; i++) {
            try {
                vidasPersonaje[i] = new JLabel();
                vidasPersonaje[i].setIcon(new ImageIcon(imagenesVidas.getScaledInstance(50, 25, Image.SCALE_SMOOTH)));
                panelVidas.add(vidasPersonaje[i]);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void QuitarVida() {
        if(VidasTotales > 0){
            VidasTotales--;
            vidas.setText(Integer.toString(VidasTotales));
            panelVidas.removeAll();
            panelVidas.add(vidas);
            InicializarVidas();
        }
    }

    public int getVidasTotales() {
        return VidasTotales;
    }

    private JLabel vidas = new JLabel();
    public int VidasTotales;
    private Image imagenesVidas = new ImageIcon(VistaInferior.class.getResource("./../public/Assets/personaje/Disparador.png")).getImage();
    private JPanel panelVidas = new JPanel();
    private JLabel creditos = new JLabel();
    private JPanel PanelCreditos = new JPanel();
}
