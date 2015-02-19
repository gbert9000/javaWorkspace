package main;

import javax.swing.JFrame;

import mvc.StrCont;
import mvc.StrGUI;
import mvc.StrModel;

public class test {

    public static void main(String[] arg) throws Exception {

    	JFrame frame = new JFrame("Editeur de Texte");

    	//Lancement de la GUI, liens MVC
		StrModel sm = new StrModel();
		StrCont sc = new StrCont(sm);
		StrGUI sv = new StrGUI(sm, sc);
		
    	
		sc.setStrGUI(sv);		
		
		frame.add(sv);
		frame.pack();
		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
    } //fin de main

}//fin de classe

	
