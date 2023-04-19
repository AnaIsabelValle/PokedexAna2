package com.Pokedex.Pokemon;

import com.Pokedex.Pokemon.Pokemon;

public class PokemonLegendario extends Pokemon {

    protected String localizacion;

    public PokemonLegendario(String nombre, String tipo,
                             float altura, float peso,
                             String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);

        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "PokemonLegendario{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", altura=" + altura +
                ", peso=" + (peso != 0f ? this.peso : "?") +
                ", descripcion='" + descripcion + '\'' +
                ", localizacion='" + localizacion + '\'' +
                '}';
    }
}
