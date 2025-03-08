package Atividade2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal("egua", 2, "iiirrrrooooo","correu");
		Veterinario v = new Veterinario();
		
		v.examinar(a1);
		System.out.println();
		
		Zoologico z = new Zoologico();
		z.animais();
		
	}

}
