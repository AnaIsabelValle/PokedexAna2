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

        public String getNombre() {
                return nombre;
        }

        public String getTipo() {
                return tipo;
        }

        public float getAltura() {
                return altura;
        }

        public float getPeso() {
                return peso;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setAltura(float altura) {
                this.altura = altura;
        }

        public void setPeso(float peso) {
                this.peso = peso;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        @Override
        public String toString() {
                return "Pokemon{" +
                        "nombre='" + nombre + '\'' +
                        ", tipo='" + tipo + '\'' +
                        ", altura=" + altura +
                        ", peso=" + (peso != 0f ? this.peso : "?") +
                        ", descripcion='" + descripcion + '\'' +
                        '}';
        }
}




