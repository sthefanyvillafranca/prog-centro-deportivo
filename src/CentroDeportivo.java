/**
 * Representa un centro deportivo que gestiona un conjunto limitado de entrenadores
 * mediante un array unidimensional de tamaño fijo.
 * <p>
 * La estructura interna utiliza un array estático donde las posiciones libres
 * se representan mediante valores {@code null}. La gestión del espacio disponible
 * se realiza mediante métodos internos que localizan la primera posición libre.
 * <p>
 * Esta clase actúa como contenedor y gestiona la lógica de almacenamiento
 * y acceso a los objetos {@link Entrenador}.
 *
 * @author Sthefany Villafranca S.
 * @version 1.0
 */


public class CentroDeportivo {
    private Entrenador[] entrenadores;
    private final int MAX_ENTRENADORES;

    /**
     * Constructor de centro deportivo.
     *
     * @param capacidad Número máx. de entrenadores. Debe ser positivo.
     */
    public CentroDeportivo(int capacidad) {
        if (capacidad <= 0) {
            this.MAX_ENTRENADORES = 15;
        } else {
            this.MAX_ENTRENADORES = capacidad;
        }
        this.entrenadores = new Entrenador[this.MAX_ENTRENADORES];
    }

    /**
     * Metodo que busca un entrenador por su ID
     *
     * @param id devuelve el entrenador con ese id
     * @return Devuelve null si no existe.
     */
    public Entrenador buscarEntrenador(int id) {

        boolean continuaBusqueda = true;
        Entrenador entrenadorEncontrado = null;

        for (int i = 0; i < MAX_ENTRENADORES && continuaBusqueda; i++) {
            if ((entrenadores[i] != null) && entrenadores[i].getId() == id) {
                continuaBusqueda = false;
                entrenadorEncontrado = entrenadores[i];
            }
        }
        return entrenadorEncontrado;
    }

    /**
     * Metodo que busca el primer hueco libre
     *
     * @return Devuelve la primera posición null o Devuelve -1 si el array está completo.
     */
    private int buscarPrimerHuecoLibre() {
        int posiciónLibre = -1;
        boolean continuaBusqueda = true;

        for (int i = 0; i < MAX_ENTRENADORES && continuaBusqueda; i++) {
            if (entrenadores[i] == null) {
                continuaBusqueda = false;
                posiciónLibre = i;
            }
        }
        return posiciónLibre;
    }

    /**
     * Metodo que registra a un entrenador, comprobando que no exista otro con el mismo id y que haya hueco.
     *
     * @param entrenador
     * @return Devuelve true si se añade. O false si se añade.
     */
    /* study: entender exactamente lo que hace este codigo y practicar usar otros metodos dentro de un metodo para ser más eficiente y no repetir código*/
    public boolean registrarEntrenador(Entrenador entrenador) {
        boolean entrenadorRegistrado = false;
        int posicion;

        if (buscarEntrenador(entrenador.getId()) == null) {
            posicion = buscarPrimerHuecoLibre();
            if (posicion >= 0) {
                entrenadores[posicion] = entrenador;
                entrenadorRegistrado = true;
            }
        }
        return entrenadorRegistrado;
    }

    /**
     * Metodo que devuelve listado de entrenadores con su información.
     *
     * @return listado de entrenadores
     */
    /* study: String builder con bucles internos y como agregar algo de un array a un toString, entender sintaxis del código y practicarlo
     *  lo que entiendo es que necesita el bucle para poder recorrerlo y solo mostrar los entrenadores que existen. Con la posibilidad de que haya huecos vacíos (nulos) entonces con una condición se evitan esos espacios nulos y solo se toma en cuenta al toString los entrenadores existentes. */
    public String mostrarEntrenadores() {
        StringBuilder sb = new StringBuilder("\n Lista de entrenadores: \n");
        for (int i = 0; i < MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                sb.append(entrenadores[i].toString());
            }
        }
        sb.append("\n }");
        return sb.toString();
    }

    /**
     * Metodo que devuelve el número real de entrenadores.
     *
     * @return número  de entrenadores almacenados.
     */
    public int contarEntrenadores() {

        int contador = 0;
        for (int i = 0; i < MAX_ENTRENADORES; i++) {
            if (entrenadores[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Elimina un entrenador a partir de su ID.
     *
     * @param id Identificador del entrenador a eliminar.
     * @return El entrenador eliminado, o null si no se encontró.
     */
    public Entrenador deleteEntrenador(int id) {
        Entrenador entrenadorEliminado = null;
        boolean sigueBusqueda = true;

        for (int i = 0; i < MAX_ENTRENADORES && sigueBusqueda; i++) {
            if (entrenadores[i] != null && entrenadores[i].getId() == id) {
                entrenadorEliminado = entrenadores[i];
                entrenadores[i] = null;
                sigueBusqueda = false;
            }
        }
        return entrenadorEliminado;
    }

    /**
     * Elimina un entrenador a partir de un Entrenador.
     * @param entrenador  entrenador a eliminar.
     * @return El entrenador eliminado, o null si no se pudo eliminar.
     */
    public Entrenador deleteEntrenador(Entrenador entrenador) {
        Entrenador entrenadorEliminado = null;

        if (entrenador != null) {
            entrenadorEliminado = deleteEntrenador(entrenador.getId());
        }

        return entrenadorEliminado;
    }


/*
    public void ordenarEntrenadores() {
       // study: no sé como hacer este
    }
     */

}

/**
 * study: metodos publicos y privados
 */