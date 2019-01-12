package Classi;
import java.util.InputMismatchException;
import java.util.Scanner;
import Metodi.Esercizio2Metodi;
public class Esercizio2 
{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Esercizio2Metodi objMetodi=new Esercizio2Metodi();
		
		int scelta=1;
		int [] [] matrix = null;
		int max=0;
		int min=0;
		int lun=0;
		int alt=0;
		
		while((lun<1 || lun>10) || (alt<1 || alt>10))
		{
			System.out.println("Inserisci la lunghezza (MIN 1,MAX 10)");
			lun=sc.nextInt();
			System.out.println("Inserisci l'altezza (MIN 1,MAX 10)");
			alt=sc.nextInt();
			
			if (lun<1 || lun>10)
			{
				System.out.println("Valore lunghezza errato");
			}
			
			if (alt<1 || alt>10)
			{
				System.out.println("Valore altezza errato");
			}
			
		}
		
		matrix=objMetodi.creaMatrice(lun, alt);
		
		while (scelta!=0)
		{
			try
			{
				System.out.println("");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("Inserire '1' per: visualizzare il valore massimo e minimo della matrice");
				System.out.println("Inserire '2' per: Visualizzare i vettori contententi le somme di ogni riga e di ogni colonna");
				System.out.println("Inserire '3' per: Definire una seconda matrice con numeri da 0 a 1000 senza doppi nella stessa riga");
				System.out.println("Inserire '4' per: Definire una terza matrice con numeri da 0 a 1000 senza doppi nella stessa colonna");
				System.out.println("Inserire '5' per: Definire una quarta matrice con numeri da 0 a 1000 senza doppi");
				System.out.println("Inserire '0' per uscire dal programma");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				
				scelta=sc.nextInt();
				
				switch(scelta)
				{
				
					
				case 0:	System.out.println("Uscita dal programma in corso..");
						break;
					
				case 1:	objMetodi.minMax(matrix, lun, alt,max,min);
						break;
			
				case 2:	objMetodi.rigCol(matrix, lun, alt);
						break;
				
				case 3:	objMetodi.secMatrix(lun, alt);
						break;
			
				case 4:	objMetodi.terzaMatrix(lun, alt);
						break;
				
				case 5:	objMetodi.quartaMatrix(lun, alt);
						break;
						
					
				default:	System.out.println("Numero inserito errato, ritorno al menu...");
							System.out.println("");
							break;
			
				}
			}
			
			catch(InputMismatchException e)
			{
				System.out.println("Devi inserire un numero!");
				scelta=0;
			}
			
		}
		sc.close();
	}
	
}
