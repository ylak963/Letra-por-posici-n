package es.studium.LetraPorPosicion;

import java.util.Scanner;

public class LetraPorPosicion
{

	public static void main(String[] args)
	{
		String matriz [][]= new String [3][3];
		int matriz2 [][] = new int [3][3];
				
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println("Ingrese los valores de la primera matriz: ("+i+"-"+j+")");
				matriz[i][j]= teclado.next();
			}
		}
		System.out.println("La matriz 1 es:\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print("\t"+matriz[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("La matriz 2 con el número de orden de cada letra en el abecedario es:\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				matriz2[i][j]=(int)(matriz[i][j]).charAt(0)-96;
				System.out.println("\t"+matriz2[i][j]);
			}
			System.out.println("");
		}
		System.out.println("");
		teclado.close();
	}


}
