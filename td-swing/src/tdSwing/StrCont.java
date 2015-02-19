package tdSwing;

import java.awt.event.*;


public class StrCont implements ActionListener {
	StrModel data;
	StrGUI interf;
	public StrCont(StrModel sm) {
		data = sm;
	}
	public void setStrGUI(StrGUI sg) {
		interf = sg;
	}
	public void actionPerformed(ActionEvent evt) {
		
		if(evt.getSource()== interf.app)
		try{
			
			data.appendA(); //Met à jour le modele
			interf.majLabel(); //Notifie la vue
		}
		catch(Exception e){
			e.getStackTrace();
		}
		
		if(evt.getSource()== interf.appB)
		try{
			data.appendB(); //Met à jour le modele
			interf.majLabel(); //Notifie la vue
		}
		catch(Exception e){
			e.getStackTrace();
		}

		
		if(evt.getSource()== interf.annule)
		try{
			data.erase(); //Met à jour le modele
			interf.majLabel(); //Notifie la vue
		}
		catch(Exception e){
			e.getStackTrace();
		}
		
		
		//Gestion des événements sélection Checkbox
		if(evt.getSource() == interf.maj)
		{
			interf.majLabel(); //Notifie la vue
		}
		
		if(evt.getSource() == interf.min)
		{
			interf.majLabel(); //Notifie la vue
		}
		
	}
}