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
                }
            }
        }
