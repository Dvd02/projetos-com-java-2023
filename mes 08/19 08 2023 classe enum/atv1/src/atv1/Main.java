package atv1;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        Categoria categoria;

        if (idade < 10) {
            categoria = Categoria.INFANTIL;
        } else if (idade >= 10 && idade < 16) {
            categoria = Categoria.JUVENIL_A;
        } else if (idade >= 16 && idade < 18) {
            categoria = Categoria.JUVENIL_B;
        } else if (idade >= 18 && idade < 25) {
            categoria = Categoria.ADULTO;
        } else {
            categoria = Categoria.ADULTO_PRO;
        }

        System.out.println("Categoria: " + categoria);
    }
    
}
