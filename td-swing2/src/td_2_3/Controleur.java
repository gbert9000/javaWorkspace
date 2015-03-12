package td_2_3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Controleur extends MouseAdapter {

	private JPanel pan;
	private Graphics g;
	private int x,y;
	
	public Controleur(JPanel pan){
		this.pan=pan;
	}
	
	public void mousePressed(MouseEvent evt) {
			g = pan.getGraphics();

			if (SwingUtilities.isLeftMouseButton(evt)) {
				g.setColor(Color.black);
				System.out.println("clic gauche = couleur noir");
			} else {
				g.setColor(Color.red);
				System.out.println("clic droit = couleur rouge");
			}
			
			x = evt.getX();
			y = evt.getY();
			System.out.println("Clicked = Début du trait"+"Position départ : "+x+" , "+y);

	} 

	public void mouseReleased(MouseEvent evt) {
			int nextX = evt.getX();
			int nextY = evt.getY();
			
			g.drawLine(x , y, nextX, nextY);
			
			x = nextX;
			y = nextY;
			System.out.println("Released = Fin du trait"+"Position arrivée : "+x+" , "+y);
			g.dispose();
		}       
}

