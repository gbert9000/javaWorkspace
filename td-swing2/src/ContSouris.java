
import java.awt.event.*;


public class ContSouris implements MouseListener, MouseMotionListener {
    
	private DispImage panSouris;
    private int nbClics = 0;

    public ContSouris(DispImage pan) {
	panSouris = pan;
    }

    public void mouseMoved(MouseEvent me) {
	panSouris.setPositionSouris(me.getX(), me.getY());
    }
    public void mouseDragged(MouseEvent me) {
	panSouris.setPositionSouris(me.getX(), me.getY());
     	
    }
    public void mouseClicked(MouseEvent me) {
	nbClics++;
	panSouris.setNbClics(nbClics);
    }
    public void mousePressed(MouseEvent me) {
	System.out.println("Pressé");	
    }
    public void mouseReleased(MouseEvent me) {
	System.out.println("Relaché");		
    }
    public void mouseEntered(MouseEvent me) {
    	panSouris.setPositionSouris(me.getX(), me.getY());
    }
    public void mouseExited(MouseEvent me) {
    	panSouris.setPositionSouris((panSouris.getWidth()/2), (panSouris.getHeight()/2));
    	//panSouris.setPositionSouris(-1,-1);
    }
}