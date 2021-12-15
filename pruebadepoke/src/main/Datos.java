package main;

import models.Pokemon;

public class Datos {

	public static void main(String[] args) {
		String[] nompok = {"Bulbasaur","Ivysaur","Venusaur","Charmander","Charmeleon","Charizard","Squirtle","Wartortle","Blastoise","Caterpie","Metapod","Butterfree","Weedle","Kakuna","Beedrill","Pidgey","Pidgeotto","Pidgeot","Rattata","Raticate","Spearow","Fearow","Ekans","Arbok","Pikachu","Raichu","Sandshrew","Sandslash","Nidoran♀","Nidorina","Nidoqueen","Nidoran♂","Nidorino","Nidoking","Clefairy","Clefable","Vulpix","Ninetales","Jigglypuff","Wigglytuff"};
		for (int i = 0; i < nompok.length; i++) {
			Pokemon pokemon = new Pokemon("Strin[i]", i, 1, 1);
			
		}
		
	}

}
