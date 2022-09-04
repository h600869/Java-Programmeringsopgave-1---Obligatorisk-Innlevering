package oblig;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave_B4___Trinnskatt {

	public static void main(String[] args) {
		
		String bruttolonn = showInputDialog(" BRUTTOINNTEKT");
		
		int resultat = Integer.parseInt(bruttolonn);
		
	
		
		
		
		if (resultat<= 164_100 ) {
			showMessageDialog(null, "trinnskatten = " + resultat*0 + " kr ");
		}
		else if (resultat >=164_101 && resultat <= 230_950){
			showMessageDialog(null, " trinnskatten = " + resultat/100*0.93 + " kr ");
		}
		else if (resultat >=230_951 && resultat <=580_650) {
			showMessageDialog(null, " trinnskatten = " + resultat/100*2.41 + " kr ");
		}
		else if (resultat >= 580_651 && resultat <=934_050) {
			showMessageDialog(null, " trinnskatten = " + resultat/100*11.52 + " kr ");
		}
		else if (resultat >= 934051) {
			showMessageDialog(null, " trinnskatten = " + resultat/100*14.52 + " kr ");
		}
	}

}
