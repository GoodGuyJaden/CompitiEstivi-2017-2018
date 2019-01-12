package Classi;
import Metodi.Esercizio4Metodi;
import java.util.*;
public class Esercizio4 
{
	public static void main(String[]args)
	{
		Esercizio4Metodi objMetodi=new Esercizio4Metodi();
		Scanner sc=new Scanner(System.in);
		
		int opzione=0;
		try
		{
			while(opzione!=9)
			{
				System.out.println("Premere 0 per: visualizzare la stringa al contrario.");
				System.out.println("Premere 1 per: visualizzare le posizioni delle vocali.");
				System.out.println("Premere 2 per: concatenare la stringa inserita con il suo opposto.");
				System.out.println("Premere 3 per: visualizzare progressivamente la stringa inserita senza la prima lettera.");
				System.out.println("Premere 9 per: uscire dal programma.");
				opzione=sc.nextInt();
				sc.nextLine(); // Se si omette, il nextLine() alla riga 45 non funzionerà più.
				switch(opzione) 
				{
		
					case 0:	System.out.println("Inserisci la stringa da scrivere al contrario");
							String stringa=sc.next();
							objMetodi.contrario(stringa);
							System.out.println("");
							break;
					
					case 1:	System.out.println("Inserisci la stringa di cui vuoi conoscere le vocali e la loro posizione");
							String stringa2=sc.next();
							objMetodi.soloVocali(stringa2);
							System.out.println("");
							break;
			
					case 2:	System.out.println("Inserisci la stringa a cui aggiungere il suo contrario");
							String stringa3=sc.next();
							objMetodi.concatenazione(stringa3);
							System.out.println("");
							break;
				
					case 3:	System.out.println("Inserisci la stringa da visionare senza la prima lettere in modo progressivo");
							String stringa4=sc.nextLine();
							objMetodi.Matrice(stringa4);
							System.out.println("");
							System.out.println("");
							break;
							
					case 9:	System.out.println("Uscita dal programma in corso..");
							break;
						
					
					default: System.out.println("Numero inserito errato, ritorno al menu...");
							 System.out.println("");
							 break;
			
				}
			}
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Devi inserire un numero!");
			opzione=9;
		}
		
		sc.close();
	}
}
