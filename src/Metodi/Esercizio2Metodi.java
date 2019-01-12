package Metodi;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Esercizio2Metodi 
{

	public int[][] creaMatrice(int lun, int alt)
	{
		int [] [] matrix= new int [alt] [lun];
		
		for (int i=0;i<alt;i++)
		{
			System.out.println("");
			for (int j=0;j<lun;j++)
			{
				matrix[i][j]=ThreadLocalRandom.current().nextInt(0,100);
				System.out.print(matrix[i][j]+ " ");
			}
			
		}
		System.out.println("");
		System.out.println("");
		return matrix;
	}
	
	public void minMax(int [][] matrix, int lun, int alt,int max,int min)
	{
		min=101;
		max=0;
		for (int i=0;i<alt;i++)
		{
			for (int j=0;j<lun;j++)
			{
				if(matrix[i][j]>=max)
				
				{
					max=matrix[i][j];
				}
				
				if(matrix[i][j]<=min)
				
				{
					min=matrix[i][j];
				}
			}
		}
		System.out.println("Il valore massimo è: " + max);
		System.out.println("Il valore minimo è: " + min);
	}

	public void rigCol(int [][] matrix, int lun, int alt)
	{
		int [] riga=new int [alt];
		int [] colonna=new int [lun];
		for (int i=0;i<alt;i++)
		{
			for (int j=0;j<lun;j++)
			{
				riga[i]=riga[i]+matrix[i][j];
				colonna[j]=colonna[j]+matrix[i][j];			
			}
		}
		System.out.println("Le somme delle righe sono queste: "+Arrays.toString(riga));
		System.out.println("Le somme delle colonne sono queste: " +Arrays.toString(colonna));
	}

	public void secMatrix(int lun, int alt)
	{
		int [] [] matrix= new int [alt] [lun];
		
		for (int i=0;i<alt;i++)
		{
			for (int j=0;j<lun;j++)
				{
					matrix[i][j]=ThreadLocalRandom.current().nextInt(0,1000);
				}	
		}
		
		for (int i=0;i<alt;i++)
		{
			for(int k=0;k<lun;k++)
			{
				for (int j=0;j<lun;j++)
				{
					if (k==(lun-1) && k==j)
					{
						
					}
					else if (k!=(lun-1) && k==j)
					{
						if(matrix[i][k]==matrix[i][j+1])
						{
							matrix[i][k]=ThreadLocalRandom.current().nextInt(0,1000);
							j=-1;
						}
					}
					else if(k!=(lun-1) && k!=j) 
					{
						if(matrix[i][k]==matrix[i][j])
						{
							matrix[i][k]=ThreadLocalRandom.current().nextInt(0,1000);
							j=-1;
						}
					}
					
				}
			}
		}
		for (int i=0;i<alt;i++)
		{
			System.out.println("");
			for (int j=0;j<lun;j++)
			{
				System.out.print(matrix[i][j]+ " ");
			}
			
		}
		
	}

	public void terzaMatrix(int lun, int alt)
	{
		int [] [] matrix= new int [alt] [lun];
		
		for (int i=0;i<alt;i++)
		{
			for (int j=0;j<lun;j++)
				{
					matrix[i][j]=ThreadLocalRandom.current().nextInt(0,1000);
				}	
		}
		
		for (int j=0;j<lun;j++)
		{
			for(int k=0;k<alt;k++)
			{
				for (int i=0;i<alt;i++)
				{
					if(k!=(alt-1) && k==i)
					{
						if(matrix[k][j]==matrix[i+1][j])
						{
							matrix[k][j]=ThreadLocalRandom.current().nextInt(0,1000);
							i=-1;
						}
					}
					else if(k!=(alt-i) && k!=i)
					{
						if(matrix[k][j]==matrix[i][j])
						{
							matrix[k][j]=ThreadLocalRandom.current().nextInt(0,1000);
							i=-1;
						}
					}
					else if(k==(alt-i) && k==i)
					{
						
					}
				}
			}
		}
		
		for (int i=0;i<alt;i++)
		{
			if(i!=0) {
			System.out.println("");}
			for (int j=0;j<lun;j++)
			{
				
				System.out.print(matrix[i][j]+" ");
			}
		}
		
	}
	
	public void quartaMatrix(int lun, int alt)
	{
		int [] [] matrix= new int [alt] [lun];
		
		for (int i=0;i<alt;i++)
		{
			for (int j=0;j<lun;j++)
				{
					matrix[i][j]=ThreadLocalRandom.current().nextInt(0,1000);
				}	
		}
		
		for (int k=0;k<alt;k++)
		{
			for (int x=0;x<lun;x++)
			{
				for (int i=0;i<alt;i++)
				{
					for (int j=0;j<lun;j++)
					{
						if (k==i && x==j)
						{
							
						}
						else
						{
							if(matrix[k][x]==matrix[i][j])
							{
								matrix[k][x]=ThreadLocalRandom.current().nextInt(0,1000);
								j=lun-1;
								i=-1;
							}
						}
						
					}
				}
			}
		}
		
		for (int i=0;i<alt;i++)
		{
			if(i!=0) {
			System.out.println("");}
			for (int j=0;j<lun;j++)
			{
				
				System.out.print(matrix[i][j]+" ");
			}
		}
	}

}

