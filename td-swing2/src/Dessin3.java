import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Dessin3 {
		
	public static void main(String[] args) {
		JFrame jf;
		DispImage panelImage;
		BufferedImage bImg;
		ContSouris cont;

		jf = new JFrame("Images et clip");
		jf.setLocation(250,250);
		jf.setPreferredSize(new Dimension(500, 500));
		
		try {
			bImg = ImageIO.read(new File("valier.jpg"));
			panelImage = new DispImage(bImg);
			cont = new ContSouris(panelImage);
			jf.addMouseListener(cont);
			jf.addMouseMotionListener(cont);
			jf.add(panelImage);
			jf.pack();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setVisible(true);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}


}