package oblig;

import java.util.Scanner;

public class Oppgave_O3___Obligfatorisk_Innlevering {

	public static void main(String[] args) {
		
		int tall;
		Scanner sc = new Scanner(System.in);
		System.out.println("Skriv inn tallet: ");
		
		
		tall = sc.nextInt();
		sc.close();
		
		long fact = 1;
		int i = 1;
		
		while (i<=tall) 
		{
			fact = fact * i;
			i++;
		}
		System.out.println("Fakultet av " + tall + " er " + fact);
	}
 }