package q2;

import java.awt.event.*;

import vue.*;

public class ContSouris implements MouseListener, MouseMotionListener {
    private PanStatut panStatut;
    private int nbClics = 0;

    public ContSouris(PanStatut stat) {
	panStatut = stat;
	
    }

    public void mouseMoved(MouseEvent me) {
	panStatut.setPositionSouris(me.getX(), me.getY());
    }
    public void mouseDragged(MouseEvent me) {
	panStatut.setPositionSouris(me.getX(), me.getY());
    }
    public void mouseClicked(MouseEvent me) {
	nbClics++;
	panStatut.setNbClics(nbClics);
    }
    public void mousePressed(MouseEvent me) {
	System.out.println("Pressé");	
    }
    public void mouseReleased(MouseEvent me) {
	System.out.println("Relaché");		
    }
    public void mouseEntered(MouseEvent me) {
	panStatut.setPositionSouris(me.getX(), me.getY());
    }
    public void mouseExited(MouseEvent me) {
	panStatut.setPositionSouris(-1,-1);
    }
}