/**
 * Representa a un entrenador dentro del sistema del centro deportivo.
 *
 * Cada entrenador está identificado de manera única mediante un {@code id}
 * y dispone de información básica como nombre, especialidad y años de experiencia.
 *
 * Esta clase actúa como entidad del dominio y encapsula sus datos,
 * permitiendo el acceso únicamente a través de métodos públicos.
 *
 * @author Sthefany Villafranca S.
 * @version 1.0
 *
 */

public class Entrenador {
    private int id;
    private String nombre;
    private String especialidad;
    private int anosExperiencia;



    public Entrenador(int id, String nombre, String especialidad, int anosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
    }

    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    /*study: String format y cuál es la letra correspondiente por cada tipo de dato. d, s, etc...*/

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Entrenador: {");
        sb.append(String.format(" id: %d |", id));
        sb.append(String.format(" nombre: %s |", nombre));
        sb.append(String.format(" especialidad: %s |", especialidad));
        sb.append(String.format(" años experiencia: %d |", anosExperiencia));
        sb.append(" }\n");

        return sb.toString();

    }
}
/**
 * todo estudiar como recorrer un array e imprimir sus elementos
 */