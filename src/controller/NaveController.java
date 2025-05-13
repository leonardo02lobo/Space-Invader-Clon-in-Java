package controller;

import java.awt.event.*;

import javax.swing.*;

public class NaveController extends KeyAdapter implements ActionListener{

    public NaveController(JLabel labelNave,JPanel panelJuego) {
        this.labelNave = labelNave;
        this.panelJuego = panelJuego;
        x = this.labelNave.getX();
        y = this.labelNave.getY();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_D){
            if(x != panelJuego.getWidth() - labelNave.getWidth()){
                x+=5;
            }
        }
        if(e.getKeyCode() == KeyEvent.VK_A){
            if(x != 0){
                x-=5;
            }
        }
        labelNave.setLocation(x,y);
    }

    private JLabel labelNave;
    private JPanel panelJuego;
    private int x;
    private int y;
}