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
        public void eliminarPokemon(Pokemon nombre) {
                boolean encontrado = false;
                for (int i = 0; i < totalPokemon ; i++) {
                        if (this.pokemonArray[i].getNombre().equals(nombre)) {
                                for (int j = i; j < totalPokemon - 1; j++) {
                                        pokemonArray[j] = pokemonArray[j + 1];
                                }
                                totalPokemon--;
                                encontrado = true;
                                break;
                        }
                }
                if (encontrado) {
                        System.out.println("El Pokémon ha sido eliminado de la lista.");
                } else {
                        System.out.println("El Pokémon no ha sido encontrado en la lista.");
                }
        }
}
