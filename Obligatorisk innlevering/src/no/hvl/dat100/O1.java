package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {
	
	public static void main(String[] args) {

		int tallTxt = parseInt(showInputDialog("Bruttoinntekt: ")); 
	
		
	if (tallTxt <= 164100) {
		showMessageDialog(null, "Ingen trinnskatt");
		showMessageDialog(null,"Nettoinntekt:" + tallTxt *0.0);
		
	} else
		if(tallTxt >=164101 && tallTxt <=230950) {
			showMessageDialog(null, "Trinnskatt: 1");
			showMessageDialog(null,"Skatt:" + tallTxt *0.0093);
			
	} else
		if(tallTxt >=230951 && tallTxt <=580650) {
			showMessageDialog(null, "Trinnskatt: 2");
			showMessageDialog(null, "Skatt:" + tallTxt * 0.0241);
			
	} else
		if(tallTxt >=580651 && tallTxt <=934050) {
			showMessageDialog(null, "Trinnskatt: 3");
			showMessageDialog(null, "Skatt:" + tallTxt * 0.1152);
			
	}else
		if(tallTxt >=2934051) {
			showMessageDialog(null, "Trinnskatt: 4");
			showMessageDialog(null, "Skatt:" + tallTxt * 0.1452);
			
	}
	
	
	
	}

}
