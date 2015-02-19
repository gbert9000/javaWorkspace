package mvc;

import java.awt.event.*;

import javax.swing.JFileChooser;

/*le controleur */
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

		if(evt.getSource()== interf.open){
			JFileChooser chooser = new JFileChooser();
			//chooser.setFileFilter(filter);
 
			int returnVal = chooser.showOpenDialog(interf);
 
			if(returnVal==JFileChooser.APPROVE_OPTION){
				String s = data.readFile(chooser.getSelectedFile().getPath());
				interf.affichage.setText(s);	
			}
		}else if(evt.getSource()== interf.save){
			JFileChooser chooser = new JFileChooser();
			//chooser.setFileFilter(filter);

			int returnVal = chooser.showSaveDialog(interf);
	
			if(returnVal==JFileChooser.APPROVE_OPTION){
				String s = chooser.getSelectedFile().getPath();
				s = s.endsWith(".txt")?s:s+".txt";
	
				data.saveFile((interf.affichage).getText(), s);
			}
		}
		
		if(evt.getSource()== interf.affiche)
		try{
			//Met à jour le modele
			interf.majAffichage(); //Notifie la vue
		}
		catch(Exception e){
			e.getStackTrace();
		}
		
		if(evt.getSource()== interf.cancel)
		try{
			//data.eraseContentSaisie(interf.saisie); //Met à jour le modele
			interf.majAll(); //Notifie la vue
		}
		catch(Exception e){
			e.getStackTrace();
		}
				
	}
}