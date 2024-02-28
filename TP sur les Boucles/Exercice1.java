package boucles;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) 
	
	{
		//Exercice 1:
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veillez saisir une valeur : ");
		int a=sc.nextInt();
		System.out.println("Les nombres pairs compris entre 0 et "+a+" sont  : ");
		for(int i = 0;i<=a;i++) 
		{

			if(i%2==0)
			{
				System.out.println(i);
			}
		 }


	}
	
	
	
	
}
