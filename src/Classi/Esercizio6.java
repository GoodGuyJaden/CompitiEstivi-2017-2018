package Classi;
import java.io.*;
import java.util.Scanner;

public class Esercizio6 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		File fileFrasi = new File("Frasi.txt");
		File fileCodifica = new File("Codifica.txt");
		int Dim=2;
		String str;
		String cod;
		char [] alfabeto=new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char [] caratteri=new char[] {'!','£','$','%','&','/','(',')','=','?','^',',',';',':','.','-','_','[',']','+','*',' '};
		int n=0;
		
		while(n<1 || n>26)
		{
			System.out.println("Inserisci un numero da 1 a 26 che sarà la chiave di codifica");
			n=sc.nextInt();
			sc.nextLine();   //Stesso problema dell'altro esercizio, mi andrebbe in errore la seconda linea sc.nextLine()
		}
		
		try
		{
			PrintWriter pw = new PrintWriter(fileFrasi);
			PrintWriter pwCod = new PrintWriter(fileCodifica);
			
			for (int i=0;i<Dim;i++)
			{
				cod="";
				System.out.println("Inserisci la frase: ");
				str=sc.nextLine();
				pw.write(str);
				pw.write('\n');
				
				for (int j=0;j<str.length();j++)
				{
					for (int x=0;x<caratteri.length;x++) 
					{
						if (str.charAt(j)==caratteri[x])
						{
							cod=cod+caratteri[x];
						}
					}
					
					for (int k=0;k<alfabeto.length;k++)
					{
						if (k+n>25 && str.charAt(j)==alfabeto[k])
						{
							cod=cod+alfabeto[(k+n)-alfabeto.length];
						}
						else if(str.charAt(j)==alfabeto[k])
						{
							cod=cod+alfabeto[k+n];
						}
					}
				}
				
				pwCod.write(cod);
				pwCod.write('\n');
				System.out.println(cod);
			
			}
						
			pw.close();
			pwCod.close();
			sc.close();
		}
		catch(IOException e)
		{
			System.out.println("FileNotFound");
		}
	}
}
