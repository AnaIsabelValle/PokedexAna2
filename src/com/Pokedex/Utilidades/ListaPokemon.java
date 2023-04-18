package com.Pokedex.Utilidades;

import com.Pokedex.Pokemon.Pokemon;

public class ListaPokemon {

        protected Pokemon[] pokemonArray;
        protected int totalPokemon = 0;

        public ListaPokemon() {
                this.pokemonArray = new Pokemon[1];
        }
        public void añadirPokemon(Pokemon nuevoPokemon) {
                Pokemon[] nuevoPokemonArray = new Pokemon[this.totalPokemon + 1];

                for (int i = 0; i < this.pokemonArray.length; i++) {
                        nuevoPokemonArray[i] = this.pokemonArray[i];
                }
                pokemonArray [totalPokemon] = nuevoPokemon;
                totalPokemon ++;
                System.out.println( nuevoPokemon.getNombre() + " ha sido añadido a la lista de Pokemon");
        }
}
