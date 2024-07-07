/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerc_parcial;

/**
 *
 * @author NOTEBOOK
 */
public class Libro {
    private String isbn;
    private String titulo;
    private boolean prestado;
    private int capitulos;

public Libro(String isbn, String titulo, int capitulos) 
    {
    this.isbn = isbn;
    this.titulo = titulo;
    this.prestado = false;
    this.capitulos = capitulos;
    }


    public String getIsbn() 
        {
            return isbn;
        }

        public void setIsbn(String isbn) 
        {
            this.isbn = isbn;
        }

        public String getTitulo() 
        {
            return titulo;
        }

        public void setTitulo(String titulo) 
        {
            this.titulo = titulo;
        }

        public boolean isPrestado() 
        {
            return prestado;
        }

        public void setPrestado(boolean prestado) 
        {
            this.prestado = prestado;
        }

        public int getCapitulos() 
        {
            return capitulos;
        }

        public void setCapitulos(int capitulos) 
        {
            this.capitulos = capitulos;
        }

    
    
    }