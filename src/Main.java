import com.Pokedex.Pokemon.Pokemon;
import com.Pokedex.Pokemon.PokemonLegendario;
import com.Pokedex.Utilidades.ListaPokemon;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(" --------------**OOOO** --------------");
        System.out.println("Querido usuario, le damos la bienvenida a nuestro menú Pokedex: ");

        /* Creamos las listas de pokemon avistados y capturados*/
        ListaPokemon avistados = new ListaPokemon();
        ListaPokemon capturados = new ListaPokemon();

        // Mostrar el menú principal //
        String opcion = "";
        boolean salida = false;

        while (salida != true) {
            System.out.println("a. Añadir un pokemon");
            System.out.println("b. Añadir avistamiento legendario");
            System.out.println("c. Pasar a capturados");
            System.out.println("d. Mostrar listas de avistados");
            System.out.println("e. Mostrar lista de capturados");
            System.out.println("f. Cerrar la pokedex");

            System.out.print("Escoja una opción: ");
            opcion = teclado.nextLine();

            switch (opcion) {

                case "a":
                    // Pedimos al usuario el nombre y tipo del pokemon a añadir
                    System.out.print("Introduzca el nombre del pokemon: ");
                    String nombre = teclado.nextLine();
                    System.out.print("Introduzca el tipo del pokemon: ");
                    String tipo = teclado.nextLine();

                    // Creamos un objeto Pokemon con los datos introducidos
                    Pokemon pokemon1 = new Pokemon(nombre, tipo);

                    // Añadimos el pokemon a la lista de avistados
                    avistados.añadirPokemon(pokemon1);

                    // Mostramos un mensaje de confirmación
                    System.out.println("Se ha añadido el pokemon "
                            + pokemon1.getNombre() + " a la lista de avistados.");
                    break;

                    case "b":

                        // Pedimos al usuario el nombre, tipo y localización del pokemon legendario a añadir
                        System.out.print("Introduzca el nombre del pokemon legendario: ");
                        String nombrePokemonLegendario = teclado.nextLine();
                        System.out.print("Introduzca el tipo del pokemon legendario: ");
                        String tipoPokemonLegendario = teclado.nextLine();
                        System.out.print("Introduzca la localización del pokemon legendario: ");
                        String localizacion = teclado.nextLine();

                        // Creamos un objeto PokemonLegendario con los datos introducidos
                        PokemonLegendario pokemonLegendario1 = new PokemonLegendario
                                (nombrePokemonLegendario, tipoPokemonLegendario, localizacion);

                        // Añadimos el pokemon legendario a la lista de avistados
                        avistados.añadirPokemon(pokemonLegendario1);

                        // Mostramos un mensaje de confirmación
                        System.out.println("Se ha añadido el pokemon legendario " +
                                pokemonLegendario1.getNombre() + " a la lista de avistados.");
                    break;

                    case "c":
                        // Pedimos al usuario el nombre del pokemon a capturar
                        System.out.print("Introduzca el nombre del pokemon a capturar: ");
                        String nombreCapturar = teclado.nextLine();

                        // Buscamos el pokemon en la lista de avistados
                        ListaPokemon pokemonCapturar = avistados.buscarPokemon(nombreCapturar);

                        if (pokemonCapturar != null) {
                            System.out.println("Introduzca el peso del pokemon:");
                            float peso = teclado.nextFloat();
                            System.out.println("Introduzca la altura del pokemon:");
                            float altura = teclado.nextFloat();
                            System.out.println("Introduzca la descripción del pokemon:");
                            String descripcion = teclado.nextLine();
                            teclado.nextLine();

                            pokemon1.agregarCapturado(new PokemonCapturado
                                    (pokemonCapturar.getNombre(), pokemonCapturar.
                                            getTipo(), peso, altura, descripcion));

                            pokemon1.eliminarAvistamiento(pokemonCapturar);
                            } else {
                                System.out.println("El pokemon no ha sido avistado.");
                            }
                    break;

                    case "d":

                        System.out.println("Lista de pokemon avistados:");
                        pokemon1.mostrarAvistamientos();
                    break;

                    case "e":

                        System.out.println("Lista de pokemon capturados:");
                        pokemon1.mostrarCapturados();
                    break;

                    case "f":
                        System.out.println("Cerrando Pokedex");
                        return;

                    default:
                       System.out.println("Opción no válida.");
                    break;

                    }
                }
            }
        }
