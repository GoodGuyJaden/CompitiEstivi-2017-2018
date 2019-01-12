package Metodi;

public class Esercizio1Metodi 
{

	public void invertiPrimaUltima(String parola)
	{
		parola=parola.substring(parola.length()-1)+parola.substring(1,parola.length()-1)+parola.substring(0,1);
		System.out.println(parola);
		System.out.println("");
		
	}
	
	public void nomCogn(String nome, String cognome)
	{
		String nomCogn=nome.substring(0, 3)+cognome.substring(0, 3);
		System.out.println(nomCogn);
		System.out.println("");
		
	}
	
	public void contrario(String str) 
	{
		String strCon="";
		for(int i=1;i<=str.length();i++)
		{
			
			strCon=strCon+str.charAt(str.length()-i);
		
		}
		System.out.println(strCon);
		System.out.println("");
	}
	
	public void soloVocali(String parola) 
	{
		String vocali="";
		for(int i=0;i<parola.length();i++)
		{
			
			if(parola.charAt(i)=='a' || parola.charAt(i)=='e' || parola.charAt(i)=='i' || parola.charAt(i)=='o' || parola.charAt(i)=='u')
			{
				
				vocali=vocali+parola.charAt(i);
				
			}
		
		}
		System.out.println(vocali);
		System.out.println("");
	}
	
	public void punteggiatura(String frase)
	{
		int count=0;
		for(int i=0;i<frase.length();i++)
		{
			
			if(frase.charAt(i)=='.' || frase.charAt(i)==',' || frase.charAt(i)==';' || frase.charAt(i)==':' || frase.charAt(i)=='!' || frase.charAt(i)=='?')
			{
				
				count++;
				
			}
		
		}
		System.out.println(count);
		System.out.println("");
	}
}
