package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class O2 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
			int poengsum = parseInt(showInputDialog("Skriv inn din poengsum:"));
			
			String karakter = "Ugyldig poengsum"; 
			
		
			if (poengsum <= 39) {
				showMessageDialog(null, karakter = "F");
			}
						
			if (poengsum >= 40 && poengsum <= 49){
				showMessageDialog(null, karakter = "E");
			}
				
			if (poengsum >= 50 && poengsum <= 59){
				showMessageDialog(null, karakter = "D");
			}
				
			if (poengsum >= 60 && poengsum <= 79){
				showMessageDialog(null, karakter = "C");
			}
				
			if (poengsum >= 80 && poengsum <= 89){
				showMessageDialog(null, karakter = "B");
			}
				
			if (poengsum >= 90 && poengsum <= 100){
				showMessageDialog(null, karakter = "A");
			}
				
			if(poengsum < 0 | poengsum > 100){
				showMessageDialog(null,"Ugyldig poengsum");
			}
			}
							
					
				showMessageDialog(null,"Din karakter: ");
				
		}
	}


