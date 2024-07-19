package tres;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String codigo;
    private String nombre;
    private List<Estudiante> listaEstudiantes;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nombre: " + nombre;
    }
}


