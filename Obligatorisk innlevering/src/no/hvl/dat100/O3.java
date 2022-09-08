package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
	
		long sum=1;
		
		int tallTxt = parseInt(showInputDialog("Skriv inn et tall: ")); 
		

		for(int i=1; i<=tallTxt; i++) {
			
			sum = sum * i; 
			
		}
			
			
		
		
		showMessageDialog(null, "svaret er: "+ sum);
		
	}

}
