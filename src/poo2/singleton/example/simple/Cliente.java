package poo2.singleton.example.simple;

public class Cliente {

	public static void main(String[] args) {
		
		Singleton myS = Singleton.getInstance("");
		Singleton myD = Singleton.getInstance("");
		Singleton myA = Singleton.getInstance("");
		Singleton myF = Singleton.getInstance("");
		
		System.out.println(myS.getValue());
		System.out.println(myD.getValue());
		
		System.out.println("----");
		
		myS.setValue("Valor H");
		System.out.println(myD.getValue());
		System.out.println(myF.getValue());
		
//		myD.setValue("Valor 2");
//		System.out.println(myD.getValue());
		
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
