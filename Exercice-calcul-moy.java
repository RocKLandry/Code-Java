package vues;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		//Declaration tableau de taille 10
		
		float[] t =new float[4];
		
	
		//declaration d'une variable qui va assurer la saisie des donnees
		
		Scanner sc = new Scanner(System.in);
		
		//Remplissage
		
		for(int i=0; i<t.length;i++)
		{
                System.out.println(" Taper une moyenne : ");
                t[i]=sc.nextFloat();
	    }
		
		System.out.println(); //Pour un retour à la ligne
		System.out.println(); //Pour un retour à la ligne 
		
		//Affichage du Tableau avant le tri
		
		
		System.out.print(" Les moyennes saisies sont :  ");
				
		for(int i=0;i<t.length;i++)
		 {
					
			System.out.print(t[i] +" | ");
		
		 }
		
		System.out.println(); //Pour un retour à la ligne
		System.out.println(); //Pour un retour à la ligne
		
		//Moyenne de la classe et duPremier
		
		float som=0, moy=0;
		
		for(int i= 0 ;i<t.length;i++) 
		 { 
			som+=t[i];//som=som+t[i]
			
	 	 }
        
		moy=som/4;
		
		//moyenne du premier
		
		float max=0;
		
		max=t[0];
		
		for(int i=1;i<t.length;i++)
		{  
			if (t[i]>max)
			   
				max=t[i];
			
		}
		
		//Tri décroissant 
		
		float petit,val;
		
		for(int a=0;a<t.length-2;a++)
		{ 
			petit=t[a];
			
		   for(int b=a+1;b<t.length;b++)
		   {
			   if(t[b]>t[a])
			   {
				   val=t[b];
				   t[b]=t[a];
				   t[a]=val;
			   }
		   }
			
		}
		
		//Affichage du Tableau apres le tri
		
		System.out.print(" Les moyennes triees EN ORDRE DECROISSANT sont :  ");
		
		for(int i=0;i<t.length;i++)
		{
			System.out.print(t[i] +" | ");
		}
		
		System.out.println(); //Pour un retour à la ligne
		System.out.println(); //Pour un retour à la ligne
		System.out.println(" ----------------------");
		System.out.println(); //Pour un retour à la ligne
		System.out.println(" Moyenne de la classe : "+moy); 
		System.out.println(); //Pour un retour à la ligne
		System.out.println(" Moyenne du premier : "+max);
		
}
}
