package oblig;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveB5_Karkaterskala {
	public static void main(String[] args) {
		String Poeng = showInputDialog(" Hvor mange poeng fikk du? ");
		
		int resultat = Integer.parseInt(Poeng);
		
		if (resultat<0 && resultat > 100 ) {
			showMessageDialog(null, "Ugyldig program. Prøv igjen");
		}
		
		showMessageDialog(null, " Karkater : " + resultat);
	}
}