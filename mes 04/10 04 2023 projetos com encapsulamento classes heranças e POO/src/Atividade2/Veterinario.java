package Atividade2;

public class Veterinario {
	public void examinar(Animal paciente) {
		System.out.println("Veterinario examinou o(a) " + paciente.getNome() + ".");
		paciente.emitirSom();
	}
}
