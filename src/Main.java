public class Main {
    public static void main(String[] args) {
        CentroDeportivo centro = new CentroDeportivo(15);

        Entrenador entrenador1 = new Entrenador(1, "Juan Gonzalez", "Musculacion", 5);
        Entrenador entrenador2 = new Entrenador(2, "Luis Alfonso", "Cardio", 3);
        Entrenador entrenador3 = new Entrenador(3, "Kelly Jack", "Pilates", 8);

        centro.registrarEntrenador(entrenador1);
        centro.registrarEntrenador(entrenador2);
        centro.registrarEntrenador(entrenador3);

        System.out.println(centro.mostrarEntrenadores());
        System.out.println("===============<3================");
        System.out.println("Número total de entrenadores:");
        System.out.println(centro.contarEntrenadores());

        System.out.println("\n==============<3=================");
        System.out.println("Buscar un entrenador existente:");
        System.out.println(centro.buscarEntrenador(2));

        System.out.println("\n================<3===============");
        System.out.println("Buscar un entrenador inexistente:");
        System.out.println(centro.buscarEntrenador(4));
    }
}