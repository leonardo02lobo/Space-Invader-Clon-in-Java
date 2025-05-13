package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaSuperiorController implements ActionListener{

    public VistaSuperiorController(boolean band) {
        this.band = band;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        band = true;
    }
    private boolean band;
}
