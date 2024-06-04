/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Carlo
 */
public class Libros_Revistas {
    String Codigo_Libro,Autor,Titulo,Fecha_de_publicacion,Editorial,ISBN,Periodicidad;
    int Unidades_Disponibles,Numero_Pagina,ID_Categorias,ID_ESTADO;

    public Libros_Revistas() {
    }

    public Libros_Revistas(String Codigo_Libro, String Autor, String Titulo, String Fecha_de_publicacion, String Editorial, String ISBN, String Periodicidad, int Unidades_Disponibles, int Numero_Pagina, int ID_Categorias, int ID_ESTADO) {
        this.Codigo_Libro = Codigo_Libro;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.Fecha_de_publicacion = Fecha_de_publicacion;
        this.Editorial = Editorial;
        this.ISBN = ISBN;
        this.Periodicidad = Periodicidad;
        this.Unidades_Disponibles = Unidades_Disponibles;
        this.Numero_Pagina = Numero_Pagina;
        this.ID_Categorias = ID_Categorias;
        this.ID_ESTADO = ID_ESTADO;
    }

    public String getCodigo_Libro() {
        return Codigo_Libro;
    }

    public void setCodigo_Libro(String Codigo_Libro) {
        this.Codigo_Libro = Codigo_Libro;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFecha_de_publicacion() {
        return Fecha_de_publicacion;
    }

    public void setFecha_de_publicacion(String Fecha_de_publicacion) {
        this.Fecha_de_publicacion = Fecha_de_publicacion;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPeriodicidad() {
        return Periodicidad;
    }

    public void setPeriodicidad(String Periodicidad) {
        this.Periodicidad = Periodicidad;
    }

    public int getUnidades_Disponibles() {
        return Unidades_Disponibles;
    }

    public void setUnidades_Disponibles(int Unidades_Disponibles) {
        this.Unidades_Disponibles = Unidades_Disponibles;
    }

    public int getNumero_Pagina() {
        return Numero_Pagina;
    }

    public void setNumero_Pagina(int Numero_Pagina) {
        this.Numero_Pagina = Numero_Pagina;
    }

    public int getID_Categorias() {
        return ID_Categorias;
    }

    public void setID_Categorias(int ID_Categorias) {
        this.ID_Categorias = ID_Categorias;
    }

    public int getID_ESTADO() {
        return ID_ESTADO;
    }

    public void setID_ESTADO(int ID_ESTADO) {
        this.ID_ESTADO = ID_ESTADO;
    }
    
}
