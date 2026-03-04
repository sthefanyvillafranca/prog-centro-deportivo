//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CentroDeportivo centro = new CentroDeportivo();

        //  3 entrenadores
        Entrenador entrenador1 = new Entrenador(1, "Juan Gonzale", "Queseyo", 5);
        Entrenador entrenador2 = new Entrenador(2, "Luis Alfonso", "Cardio", 3);
        Entrenador entrenador3 = new Entrenador(3, "Kelly Jack", "Pilates", 8);

        centro.registrarEntrenador(entrenador1);
        centro.registrarEntrenador(entrenador2);
        centro.registrarEntrenador(entrenador3);
        System.out.println("registro de entrenadores.\n");

        // Mostrar entrenadores
        System.out.println("Lista de entrenadores: ");
        System.out.println(centro.mostrarEntrenadores());

    }
}
