package presentation;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercice2 {

	public static void main(String[] args) {
			
		ArrayList<String> nom=new ArrayList<String>();

		nom.add("Landry");
		nom.add("Rock");
		nom.add("Gerdon");
		/*Declaration d'un iterator*/
		
		Iterator<String> it=nom.iterator();
		
		while(it.hasNext()) {System.out.println(it.next());}

}
}