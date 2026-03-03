/**
 * Representa un centro deportivo que gestiona un conjunto limitado de entrenadores
 * mediante un array unidimensional de tamaño fijo.
 *
 * La estructura interna utiliza un array estático donde las posiciones libres
 * se representan mediante valores {@code null}. La gestión del espacio disponible
 * se realiza mediante métodos internos que localizan la primera posición libre.
 *
 * Esta clase actúa como contenedor y gestiona la lógica de almacenamiento
 * y acceso a los objetos {@link Entrenador}.
 */
// registrar entrenadores
// buscar Entrenadores
// mostrar entrenadores
// contar Entrenadores actualmente almacenados

public class CentroDeportivo {
    private Entrenador [] entrenadores;
    private final int NUM_MAX_ENTRENADORES;
    private final int NUM_MIN_ENTRENADORES;

    public CentroDeportivo() {
        this.NUM_MIN_ENTRENADORES = 0;
        this.NUM_MAX_ENTRENADORES = NUM_MIN_ENTRENADORES + 15;

    }

    /**
     * Metodo que busca un entrenador por su ID
     * @param id devuelve el entrenador con ese id
     * @return Devuelve null si no existe.
     */
    public Entrenador buscarEntrenador(int id){

    }

    /**
     * Metodo que busca el primer hueco libre
     *
     * @return Devuelve la primera posición null o Devuelve -1 si el array está completo.
     */
    private int buscarPrimerHuecoLibre(){

    }

    /**
     * Metodo que registra a un entrenador, comprobando que no exista otro con el mismo id y que haya hueco.
     * @param entrenador
     * @return Devuelve true si se añade. O devuelve true si se añade.
     */
    public boolean registrarEntrenador(Entrenador entrenador){

    }

    /**
     * Metodo que devuelve listado de entrenadores con su información.
     * @return listado de entrenadores
     */
    public String mostrarEntrenadores(){

    }

    /**
     *Metodo que devuelve el número real de entrenadores.
     * @return número  de entrenadores almacenados.
     */
    public int contarEntrenadores(){

    }

}