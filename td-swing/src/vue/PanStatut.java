package vue;

import javax.swing.*;

import java.awt.*;


public class PanStatut extends JPanel {
    private JLabel labLegCoords, labCoords, labLegClics, labClics;
    
    public String msg = new String();
	private int abs, ord;
    
    public PanStatut() {
		labLegCoords = new JLabel("Position : ");
		labCoords = new JLabel("-1, -1");
		labLegClics = new JLabel("Nombre de clics : ");
		labClics = new JLabel("0");
		
		this.setLayout(new GridLayout(2,2));
		//this.add(labLegCoords);
		this.add(labCoords);
		this.add(labLegClics);
		//this.add(labClics);
    }

    @Override
    public void paintComponent(Graphics g){
    	super.paintComponent(g);
    	g.setColor(Color.black);
    	g.drawString(msg, getWidth()/2, 15);
    }
       
    public void setPositionSouris(int x, int y) {
		labCoords.setText(Integer.toString(x) + ", " + Integer.toString(y));
		msg = "Position X : "+x+ " et Position Y : "+y;
		abs=x;
		ord=y;
		repaint();
    }

    public void setNbClics(int nb) {
		labClics.setText(Integer.toString(nb));
		msg = "Les coordonnées X et Y sont : "+abs+" et "+ord+" Nombre de clics : "+nb;
		repaint();
    }
}