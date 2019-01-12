package Classi;
import java.util.*;
import Metodi.Esercizio1Metodi;;
public class Esercizio1 
{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Esercizio1Metodi objMetodi=new Esercizio1Metodi();
		
		int opzione=0;
		
			while(opzione!=9) 
			{
				try
				{
					System.out.println("Inserire 0 per utilizzare il metodo 'invertiPrimaUltima'");
					System.out.println("Inserire 1 per utilizzare il metodo 'nomCogn'");
					System.out.println("Inserire 2 per utilizzare il metodo 'contrario'");
					System.out.println("Inserire 3 per utilizzare il metodo 'soloVocali'");
					System.out.println("Inserire 4 per utilizzare il metodo 'punteggiatura'");
					System.out.println("Inserire 9 per uscire dal programma");
					opzione=sc.nextInt();
					sc.nextLine(); // Se si omette, il nextLine() alla riga 42 non funzionerà più.
					
					
						switch(opzione) 
						{
					
							case 0:	System.out.println("Inserisci una parola: ");
									String parola=sc.next();
									objMetodi.invertiPrimaUltima(parola);
									break;
								
							case 1:	System.out.println("Inserisci il tuo nome: ");
									String nome=sc.next();
									System.out.println("Inserisci il tuo cognome: ");
									String cognome=sc.next();
									objMetodi.nomCogn(nome,cognome);
									break;
						
							case 2:	System.out.println("Inserisci la stringa: ");
									String str=sc.nextLine();	
									objMetodi.contrario(str);
									break;
							
							case 3:	System.out.println("Inserisci la frase: ");
									String stringa=sc.nextLine();
									objMetodi.soloVocali(stringa);
									break;
						
							case 4:	System.out.println("Inserisci la frase: ");
									String frase=sc.nextLine();
									objMetodi.punteggiatura(frase);
									break;
							
							case 9: System.out.println("Uscita dal programma in corso..");
									break;
									
								
							default:	System.out.println("Numero inserito errato, ritorno al menu...");
										System.out.println("");
										break;
						
						}
				}
				
				catch(InputMismatchException e)
				{
					System.out.println("Devi inserire un numero!");
					opzione=9;
				}
			
			}
		
		
		
		sc.close();
	}
}
