package tres;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GestionCursos {
    private List<Curso> cursos;

    public GestionCursos() {
        cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso añadido exitosamente.");
    }

public static void main(String[] args) {
    GestionCursos gestion = new GestionCursos();
    Scanner sc = new Scanner(System.in);
    boolean estado = true;

    while (estado) {
        System.out.println("Ingrese una opción:  1. Añadir Curso   2. Inscribir Estudiante   3. Listar Estudiantes en Curso   4. Salir");
        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1 -> {
                System.out.println("Ingrese código del curso:");
                String codigo = sc.nextLine();

                System.out.println("Ingrese nombre del curso:");
                String nombre = sc.nextLine();

                Curso curso = new Curso(codigo, nombre);
                gestion.agregarCurso(curso);
            }
            case 2 -> {
                System.out.println("Ingrese código del curso:");
                String codigoCurso = sc.nextLine();

                System.out.println("Ingrese ID del estudiante:");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("Ingrese nombre del estudiante:");
                String nombreEstudiante = sc.nextLine();

                System.out.println("Ingrese email del estudiante:");
                String email = sc.nextLine();

                Estudiante estudiante = new Estudiante(id, nombreEstudiante, email);
                gestion.inscribirEstudianteEnCurso(codigoCurso, estudiante);
            }
            case 3 -> {
                System.out.println("Ingrese código del curso:");
                String codigoCurso = sc.nextLine();
                gestion.listarEstudiantesEnCurso(codigoCurso);
            }
            case 4 -> estado = false;
            default -> System.out.println("Ingrese una opción correcta.");
        }
    }
}



    public void inscribirEstudianteEnCurso(String codigoCurso, Estudiante estudiante) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                curso.agregarEstudiante(estudiante);
                System.out.println("Estudiante inscrito exitosamente en el curso.");
                return;
            }
        }
        System.out.println("Curso no encontrado.");
    }

    public void listarEstudiantesEnCurso(String codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                System.out.println("Estudiantes inscritos en el curso " + curso.getNombre() + ":");
                for (Estudiante estudiante : curso.getListaEstudiantes()) {
                    System.out.println(estudiante);
                }
                return;
            }
        }
        System.out.println("Curso no encontrado.");
    }
}
