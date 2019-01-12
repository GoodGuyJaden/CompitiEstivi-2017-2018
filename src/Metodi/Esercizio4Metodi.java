package Metodi;
public class Esercizio4Metodi 
{
	public void contrario(String str)
	{
		String strCon="";
		for(int i=1;i<=str.length();i++)
		{
			
			strCon=strCon+str.charAt(str.length()-i);
		
		}
		System.out.println(strCon);
	}
	
	public void soloVocali(String str)
	{
		char [] vettore=new char[str.length()];
		for (int i=0;i<str.length();i++)
		{
			vettore[i]=str.charAt(i);
			if(vettore[i]=='a' || vettore[i]=='e' || vettore[i]=='i' || vettore[i]=='o' || vettore[i]=='u')
			{
				System.out.println("Nella posizione [" +(i+1)+"] è contenuta la vocale: "+vettore[i]);
			}
		}
	}
	
	public void concatenazione(String str)

	{
		String strCon="";
		for(int i=1;i<=str.length();i++)
		{
			
			strCon=strCon+str.charAt(str.length()-i);
		
		}
		strCon=str+strCon;
		System.out.println(strCon);
	}
	
	public void Matrice(String str)
	{
		String [][] matrix=new String[str.length()][1];
		for (int i=0;i<str.length();i++)
		{
			System.out.println("");
			for (int j=0;j<1;j++)
			{
				matrix[i][j]=str.substring(i,str.length());
				System.out.print(matrix[i][j]);
			}
		}
	}
}
