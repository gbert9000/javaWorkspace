package main;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

//TD2 - Evenement souris
public class MListen implements MouseListener, MouseMotionListener {
	private int compteur = 0;

	SuitSouris Vue;
	
	public MListen(	SuitSouris maVue){
		Vue = maVue;
	}
	
  public void mouseMoved(MouseEvent me) {
	System.out.println("Bouge : position : " + me.getX() + "," + me.getY());
	Vue.majLabelX(me.getX());
	Vue.majLabelY(me.getY());
  }
  public void mouseDragged(MouseEvent me) {
	System.out.println("DND : position : " + me.getX() + "," + me.getY());       	
  }
  public void mouseClicked(MouseEvent me) {
	compteur ++;
	System.out.println("clic : " + me.getClickCount());
	Vue.majLabelClic(compteur);
  }
  public void mousePressed(MouseEvent me) {
	System.out.println("Pressé");	
  }
  public void mouseReleased(MouseEvent me) {
	System.out.println("Relaché");		
  }
  public void mouseEntered(MouseEvent me) {
	System.out.println("Entré");			
  }
  public void mouseExited(MouseEvent me) {
	System.out.println("Sorti");				
  }
}