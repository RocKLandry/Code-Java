package boucles;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) 
	
	{
	
		//Exercice 2 :
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Veillez saisir une valeur : ");
		int a=sc.nextInt();
		int compteur=2;
		
		for(int i=2;i<a;i++) 
		
		{
		   if(a%i==0)
		   {
			   compteur+=1;
		   }
		  
		}
		   
		
		   if( compteur==2)
			{
				System.out.println("La valeur : "+a+" est premier");
			}
		   else 
		   	{
			   System.out.println("La valeur : "+a+" n'est pas premier");

		   	}

}
}
