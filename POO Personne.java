package domaine;

public class Personne {
	private int id;
	private String prenom;
	private String nom;
	private int age;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(int id, String prenom, String nom, int age) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}

	public Personne(String prenom, String nom, int age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	public void afficher() {
		
		System.out.println("Informations");

		System.out.println("Prenom nom "+prenom+" "+nom);
		
		System.out.println("age : "+age);
		
	}
	
	
}
