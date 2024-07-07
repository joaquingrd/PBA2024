/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaExamen;

/**
 *
 * @author joaqu
 */
public class AppBiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno a1 = new Alumno(34, "juan", "perez");
        Libro l1 = new Libro(50,"ahora",10);
        
        System.out.println(a1.toString());
        
        
    }
    
}
