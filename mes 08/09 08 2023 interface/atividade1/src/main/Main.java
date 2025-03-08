package main;

import classes.Fibonacci;
import classes.Primo;

public class Main {
	
	public static void principal() {
		// TODO Auto-generated method stub
		Fibonacci f = new Fibonacci();
		Primo p = new Primo();
		
		System.out.println( p.dados(7) );
		System.out.println( p.dados(4) );
		System.out.println( p.dados(-2) );

		System.out.println();
		
		System.out.println( f.dados(8) );
		System.out.println( f.dados(-1) );
	}
	
	public static void main(String[] args) {
		principal();
	}

}
