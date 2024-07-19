package uno;

import jdk.jfr.Category;

public class Libro {

    //CREAMOS VARIABLES DE LA CLASE

    String titulo;
    String autor;
    String año;
    Boolean prestado;


    //Constructor


    public Libro(String autor, String año, Boolean prestado, String titulo) {
        this.autor = autor;
        this.año = año;
        this.prestado = prestado;
        this.titulo = titulo;
    }

    //OBTENER EL GET Y PUT


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void Prestar(int option){
        switch (option){
            case 1 -> {
                if (prestado){
                    System.out.println("El libro no se puede prestar ya que no esta disponible");
                }else{
                    System.out.println("Prestado con exito");
                    this.prestado = true;
                }
            }
            case 2 -> {
                if (!prestado){
                    System.out.println("El libro ya fue devuelto");
                }else{
                    System.out.println("Gracias por devolverlo");
                    this.prestado = false;
                }
            }
            default -> System.out.println("Ingrese una opcion valida");
        }
    }


}

//CREAMOS EL METODO DE PRESTAR


