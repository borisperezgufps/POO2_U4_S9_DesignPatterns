package poo2.singleton.example.simple;

public class Cliente {

	public static void main(String[] args) {
		
		Singleton myS = Singleton.getInstance("Valor 1");
		Singleton myD = Singleton.getInstance("Valor 2");
		
		myS.setValue("Valor 1");
		System.out.println(myS.getValue());
		
		myD.setValue("Valor 2");
		System.out.println(myD.getValue());
		
		// Qué imprime?
		
		// Valor 1 
		// Valor 1
		// 
		
		// Valor 1 
		// Valor 2
		// Hector, Kevin, Rafael, Kenn
		
		// Valor 2 
		// Valor 1
		// 
		
		// Valor 2 
		// Valor 2
		// 
		
		// Valor 2
		// Valor 2

		
		// Por qué lo imprime?
	}

	

}
