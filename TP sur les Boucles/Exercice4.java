package boucles;

import java.util.Scanner;

public class Exercice4 
{

	public static void main(String[] args) {

		// Exercice 4 :
		Scanner sc = new Scanner(System.in);
		System.out.println("Veillez saisir une valeur minimale: ");
		int a = sc.nextInt();
		int compteur = 0;

		System.out.println("Veillez saisir une valeur maximale: ");
		int b = sc.nextInt();

		for (int i = a ; i <=b; i++) 
			{
				if (i % 2 != 0)
				{
					compteur += 1;
				}

			}

		System.out.println("Le nombre de valeurs impairs entre : " + a + " et  " + b + " est : " + compteur);
	}
}
