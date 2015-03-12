package q3;

import javax.swing.*;
import java.awt.*;

public class PanSouris extends JPanel {
    private int dispX, dispY, nbClics;

    public PanSouris() {
	dispX = dispY = -1;
	nbClics = 0;

	this.setBackground(Color.white);
	this.setPreferredSize(new Dimension(400, 400));
    }

    public void paintComponent(Graphics cg) {
	super.paintComponent(cg);

	cg.drawString("Position : " + Integer.toString(dispX) + ", " + Integer.toString(dispY), 5, getHeight() - 30);
	cg.drawString("Nombre de clics : " + Integer.toString(nbClics), 5, getHeight() - 15);
    }

    public void setPositionSouris(int x, int y) {
	dispX = x;
	dispY = y;
	this.repaint();
    }
    public void setNbClics(int nb) {
	nbClics = nb;
	this.repaint();
    }
}