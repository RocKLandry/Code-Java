package boucles;

import java.util.Scanner;

public class Exercice3

{

	public static void main(String[] args) {
		
		//Exercice 3:
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Ce programme fait la somme des nombres impairs compris entre  O et 100 : ");
		int som=0;
		
		
		for(int i=0;i<=100;i++)
		{
		 
			if(i%2!=0)
			{
				som=som+i;
			}

		
		
		}
		System.out.println();
		System.out.println(" la somme des nombres impairs compris entre  O et 100 est : "+som);
}
}