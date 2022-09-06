package oblig;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class OppgaveB5_Karkaterskala {
	public static void main(String[] args) {
		
		for ( int i=1;i <= 10; i++) {
			
		String Poeng = showInputDialog(" Hvor mange poeng fikk du? ");
		
		int resultat = Integer.parseInt(Poeng);
		
			
			
			if (resultat<0 && resultat > 100 ) {
			showMessageDialog(null, "Ugyldig Poeng. Prøv igjen");
			}
			else if (resultat >=0 && resultat <= 39) {
			showMessageDialog(null, "Karakter = F" );
			}
			else if (resultat >=40 && resultat <=49) {
			showMessageDialog(null,"Karakter = E");
			}
			else if (resultat>=50 && resultat<=59) {
			showMessageDialog(null, "Karakter = D");
			}
			else if (resultat>=60 && resultat <=79) {
			showMessageDialog(null, "Karakter = C");
			}
			else if (resultat>=80 && resultat<= 89) {
			showMessageDialog(null, "Karakter = B");
			}
			else if (resultat>=90 && resultat <=100) {
			showMessageDialog(null, "Karkater = A");
			}
		}
	}
}