package Classi;
import java.util.concurrent.ThreadLocalRandom;

public class Esercizio3 
{
	public static void main(String[]args)
	{
		String [] mesi=new String[] {"gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre"};
		int [][] mese=new int[5][6];
		int totMese=0;
		int ggmax=0;
		int giornomax=0;
		int ggmaxmax=0;
		int mesemaxmax=0;
		int giornomaxmax=0;
		int count=0;
		
		while (count<12)
		{
			System.out.println("|"+mesi[count]+"|");
			for (int i=0;i<5;i++)
			{
				System.out.println("");
				for (int j=0;j<6;j++)
				{
					mese[i][j]=ThreadLocalRandom.current().nextInt(6000,8000);
					System.out.print(mese[i][j]+" ");
					totMese=totMese+mese[i][j];
					if (mese[i][j]>ggmax)
					{
						ggmax=mese[i][j];
						giornomax=(i*6)+j+1;
						
							if (ggmax>ggmaxmax)
							{
								ggmaxmax=ggmax;
								mesemaxmax=count;
								giornomaxmax=giornomax;
							}
						
					
					}
				}
			}
			System.out.println("");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("Il totale delle copie vendute nel mese di "+mesi[count]+" è: "+totMese);
			System.out.println("");
			System.out.println("La media giornaliera delle copie vendute nel mese di "+mesi[count]+" è: "+(totMese/30));
			System.out.println("");
			System.out.println("Il "+giornomax+" sono state vendute più copie del mese, per un totale di: " +ggmax);
			System.out.println("");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			totMese=0;
			ggmax=0;
			giornomax=0;
			count++;
		
		}
		System.out.println("");
		System.out.println("La vendita massima dell'anno è stata il: "+giornomaxmax+" " +mesi[mesemaxmax]+" con un totale di: "+ggmaxmax+" copie vendute");
		
		
	}
}
