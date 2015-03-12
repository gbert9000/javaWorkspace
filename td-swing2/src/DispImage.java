import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class DispImage extends JPanel {
    
	private int dispX, dispY, nbClics;	
	BufferedImage img;

	public DispImage(BufferedImage imge) {
		img = imge;
		setPreferredSize(new Dimension(img.getWidth(),img.getHeight()));
		setBackground(Color.white);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		//Shape clip = new Ellipse2D.Float((getWidth()-400)/2,(getHeight()-400)/2,400, 400);
		Shape clip = new Ellipse2D.Float((dispX),(dispY),150,150);
		g2D.setClip(clip);
		g2D.drawImage(img, 0, 0,null);
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