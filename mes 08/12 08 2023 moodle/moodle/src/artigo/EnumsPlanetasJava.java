package artigo;

public class EnumsPlanetasJava {
	
	public static void main(String[] args) {
		// listar os valores possíveis para a enumeração:
		for (EnumPlanetas p : EnumPlanetas.values()) {
			System.out.printf("%s%n", p);
		}
	}
	
}