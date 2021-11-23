package main;

import models.Perro;

public class mainPerro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Perro bodeguero = new Perro ("Pepito", "Bodeguero", "negro");
		
		System.out.println(bodeguero);
		
		bodeguero.comer(1);
		
		System.out.println(bodeguero);
		
		bodeguero.corre(10);
		
		System.out.println(bodeguero);
		
		bodeguero.cagar(5);
		
		System.out.println(bodeguero);
		for (int i = 0;i<12;i++) {
			bodeguero.corre(10);
		}
		System.out.println(bodeguero);
		
		bodeguero.cagar(5);
		bodeguero.corre(10);
	}

}
