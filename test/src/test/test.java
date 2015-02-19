package test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;
 
 
public class test implements ActionListener {
	private JFrame frame;
	private JTabbedPane tab;
	private JButton open, save;
	private FileFilter filter;
 
	public test() {
		frame = new JFrame("Mon éditeur");
 
		tab = new JTabbedPane();
		frame.add(tab, BorderLayout.CENTER);
		for(int i=0; i<5; i++){
			tab.addTab(i+"", new JTextArea());
		}
 
		open = new JButton("Ouvrir");
		open.addActionListener(this);
		frame.add(open, BorderLayout.NORTH);		
 
		save = new JButton("Sauvegarder");
		save.addActionListener(this);
		frame.add(save, BorderLayout.SOUTH);
 
		filter = new FileFilter() {
 
			@Override
			public String getDescription() {
				return "Fichiers textes";
			}
 
			@Override
			public boolean accept(File f) {
				if(f.getName().endsWith("txt"))return true;
				return false;
			}
		};
 
		frame.setSize(250, 400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
	}
 
 
	public void saveFile(String contenu, String file) {
		try {
			PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
 
			writer.write(contenu);
 
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 
	public String readFile(String file) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String ligne;
			StringBuffer fichier = new StringBuffer();
 
			while((ligne = reader.readLine()) != null){
				fichier.append(ligne);
				fichier.append("\n");			
			}
			reader.close();
 
			return fichier.toString();		
		} catch (IOException e) {
			return e.getMessage();
		}
	}
 
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==open){
			JFileChooser chooser = new JFileChooser();
			chooser.setFileFilter(filter);
 
			int returnVal = chooser.showOpenDialog(frame);
 
			if(returnVal==JFileChooser.APPROVE_OPTION){
				String s = readFile(chooser.getSelectedFile().getPath());
				((JTextArea)tab.getSelectedComponent()).setText(s);				
			}
		}else if(e.getSource()==save){
			JFileChooser chooser = new JFileChooser();
			chooser.setFileFilter(filter);
 
			int returnVal = chooser.showSaveDialog(frame);
 
			if(returnVal==JFileChooser.APPROVE_OPTION){
				String s = chooser.getSelectedFile().getPath();
				s = s.endsWith(".txt")?s:s+".txt";
 
				saveFile(((JTextArea)tab.getSelectedComponent()).getText(), s);
			}
		}
	}
 
	public static void main(String[] args) {
		new test();
	}
}