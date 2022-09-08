package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {
	
	public static void main(String[] args) {

		int tallTxt = parseInt(showInputDialog("Bruttoinntekt: ")); 
		
		String Inntekt = null;
		String sats = null;
		
	switch (tallTxt) {
	case 0:
	Inntekt= ("x>=0 && x<=164100");{
	sats=("x/100*0,00");
	}
	break;
	
	case 1:
	Inntekt= ("x>=164101 && x<=240950");
	sats= ("x/100*0,93");
	break;
	
	case 2:
	Inntekt= ("x>=230951 && x<=580650");
	sats= ("x/100*2.41");
	break;
	
	case 3:
	Inntekt= ("x>=580651 && x<=934050");
	sats= ("x/100*11.52");
	break;
	
	case 4:
	Inntekt= ("x=>934051");
	sats= ("x/100*14.52");
	break;
	
	default:
	Inntekt = "Ugyldig tall";

	
	}
	
		String utTxt = ("Trinnskatt:");
		
		
		showMessageDialog(null, utTxt);

	
	}

}
