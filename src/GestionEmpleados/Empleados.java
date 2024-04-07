/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionEmpleados;

import java.util.Scanner;

/**
 *
 * @author joaqu
 */
public class Empleados {

    Scanner entrada = new Scanner(System.in);

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    //clic derecho-->insert code-->constructor
    //CONSTRUCTOR
    public Empleados(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public void aumentoSalario() {
        if (this.edad > 39) {
            System.out.println(this.nombre + " tiene mas de 40 años,y gana " + this.salario + " de cuanto será el aumento?");
            double aumento = entrada.nextDouble();
            this.salario = this.salario + aumento;
            System.out.println("El nuevo salario de " + this.nombre + " es de " + this.salario);
        }
    }

    public String getDatos() {
        aumentoSalario();
        return nombre + " " + apellido + ", " + edad + ", " + salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarios) {
        this.salario = salarios;
    }

}
