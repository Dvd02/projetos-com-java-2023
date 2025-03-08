package artigo;

public class ClasseTesteEnum {
	EnumPlanetas planeta;

	ClasseTesteEnum(String planeta) {
		this.planeta = EnumPlanetas.valueOf(planeta); // converte string para valor de enum
	}

	public void viajarPlaneta() {
		switch (planeta) {
		case MERCURIO:
			System.out.println("Muito quente por la");
			break;
		case TERRA:
			System.out.println("Ja estamos aqui");
			break;
		case SATURNO:
			System.out.println("Belissimos aneis!");
			break;
		case URANO:
			System.out.println("Muito longe");
			break;
		default:
			System.out.println("Passagens esgotadas!");
			break;
		}
	}
}