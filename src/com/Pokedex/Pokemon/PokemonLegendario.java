package com.Pokedex.Pokemon;

public class PokemonLegendario extends Pokemon{

    protected String localizacion;
    public PokemonLegendario(String nombre, String tipo,
                             float altura, float peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }
}
