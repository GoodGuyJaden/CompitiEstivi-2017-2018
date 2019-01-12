package Classi;
import java.util.*;
//leggere sotto e abilitare in caso affermativo
// import java.lang.*; 

public class Esercizio5 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int Dim=2;
		String [] vettore=new String[Dim];
		String [] codifica=new String[Dim];
		char [] alfabeto=new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [] caratteri=new char[] {'!','£','$','%','&','/','(',')','=','?','^',',',';',':','.','-','_','[',']','+','*',' '};
		int n=0;
		while(n<1 || n>26)
		{
			System.out.println("Inserisci un numero da 1 a 26 che sarà la chiave di codifica");
			n=sc.nextInt();
			sc.nextLine();   //Stesso problema dell'altro esercizio, mi andrebbe in errore la seconda linea sc.nextLine()
		}
		
		for (int i=0;i<Dim;i++)
		{
			System.out.println("Inserisci una frase: ");
			vettore[i]=sc.nextLine();
			codifica[i]="";
			for (int j=0;j<vettore[i].length();j++)
			{
				for (int x=0;x<caratteri.length;x++)
				{
					if (vettore[i].charAt(j)==caratteri[x]) 
					{
						codifica[i]=codifica[i]+caratteri[x];
					}
				}
				
				for(int k=0;k<alfabeto.length;k++)
				{
						if (k+n>25 && vettore[i].charAt(j)==alfabeto[k])
						{
							codifica[i]=codifica[i]+alfabeto[(k+n)-alfabeto.length];
						}
						else if(vettore[i].charAt(j)==alfabeto[k])
						{
							codifica[i]=codifica[i]+alfabeto[k+n];
						}
						
				}
				
			}
		System.out.println(codifica[i]);
		System.out.println("");
		}
		//Se si vuole la stampa instantanea di tutto l'array abilitare il comando sotto..
		//System.out.println(Arrays.toString(codifica)); 
		sc.close();
	}
}
