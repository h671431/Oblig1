import static javax.swing.JOptionPane.*;
		import static java.lang.Integer.*; 
		
public class G4 {
		
	public static void main(String[] args) {

		
		String tallTxt = showInputDialog("Gi et tall:");

		int tall = parseInt(tallTxt);
		for (int i =0; i<5; i++) {
			
			tallTxt = showInputDialog("Gi et tall:");
		System.out.println (tallTxt);
		}
		
		
	
	}	

}
