import java.util.ArrayList;

import javax.swing.JPanel;

import java.awt.Component;
import java.awt.GridLayout;


public class GrupaSamolotow extends JPanel {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	public GrupaSamolotow(final  ArrayList<PanelSamolot> samoloty) {
		setLayout(new GridLayout(2, 2, 1, 1));
	
	
		for (int i = 0;i<samoloty.size();i++){
			
			add(samoloty.get(i));
		
			
			
		}
		
		

	}

}
