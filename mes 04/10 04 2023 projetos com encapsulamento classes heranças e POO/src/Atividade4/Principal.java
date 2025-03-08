package Atividade4;

public class Principal {

	public static void main(String[] args) {
		Mensalista f1 = new Mensalista("joão", "setor A", "00 90000-0000", "000.000.000.00", "01/01/2000", "01/01/2020", 6000);
		Departamento d1 = new Departamento("01", 5, f1);
		f1.setNumeroDeDepartamento(d1);
		
		Departamento d2 = new Departamento("02", 3);
		Horista f2 = new Horista("Jose", "setor B", "00 90000-0001", "000.000.000.01", "01/01/2000", "01/01/2020", d2, 20);
		d2.setChefeResponsavel(f2);
		
		
		f1.dados();
		System.out.println();
		d1.dados();
		
		System.out.println("\n------------------------------------\n");
		
		f2.dados();
		System.out.println();
		d2.dados();
	}
	
}
