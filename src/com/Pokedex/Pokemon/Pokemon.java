package com.Pokedex.Pokemon;

public class Pokemon {

        protected String nombre;
        protected String tipo;
        protected float altura;
        protected float peso;
        protected String descripcion;

        public Pokemon(String nombre, String tipo, float altura, float peso, String descripcion) {
                this.nombre = nombre;
                this.tipo = tipo;
                this.altura = altura;
                this.peso = peso;
                this.descripcion = descripcion;
        }

        public Pokemon(String nombre, String tipo) {
                this.nombre = nombre;
                this.tipo = tipo;
        }
}
