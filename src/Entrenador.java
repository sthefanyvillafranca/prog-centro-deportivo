/**
 * Representa a un entrenador dentro del sistema del centro deportivo.
 *
 * Cada entrenador está identificado de manera única mediante un {@code id}
 * y dispone de información básica como nombre, especialidad y años de experiencia.
 *
 * Esta clase actúa como entidad del dominio y encapsula sus datos,
 * permitiendo el acceso únicamente a través de métodos públicos.
 *
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

    @Override
    public String toString() {

    }
}