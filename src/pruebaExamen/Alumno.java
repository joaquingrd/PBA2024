
package pruebaExamen;

public class Alumno extends Cliente {

    private String legajoAlumno;

    public Alumno(int dni, String apellido, String nombre) {
        super(dni, apellido, nombre);
        this.legajoAlumno = "";

    }
//G&S
  public String getLegajoAlumno() {
        return legajoAlumno;
    }

    public void setLegajoAlumno(String legajoAlumno) {
        this.legajoAlumno = legajoAlumno;
    }
    
    @Override
    public String toString() {
        return "Cliente{" +
                "dni=" + dni +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", libros=" + libros +
                '}';
    }
}
