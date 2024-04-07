/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionEmpleados;

import java.util.Scanner;

/**
 *
 * @author joaqu
 */
public class GestionEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        //Empleados[] empleados = new Empleados[10];
        Empresa empresa1 = new Empresa("PBA SA", 2024, 10);

        String ingreso;
        int qIngreso;

        empresa1.mostrarLista();

        System.out.println("Cuantos empleados va a ingresar? ");
        ingreso = entrada.nextLine();
        qIngreso = Integer.parseInt(ingreso);

        System.out.println("Usted va a ingresar " + qIngreso + " empleados en la empresa: " + empresa1.getNombre());

        for (int i = 0; i < qIngreso; i++) {
            Empleados e = cargarDatosEmpleados(entrada);
            empresa1.agregarEmpleado(e);

        }

        empresa1.mostrarLista();
        

    }

    private static Empleados cargarDatosEmpleados(Scanner entrada) {

        String nombre, apellido;
        int edad;
        double salario;

        System.out.println("ingresa el nombre: ");
        nombre = entrada.nextLine();

        System.out.println("ingresa el apellido: ");
        apellido = entrada.nextLine();

        System.out.println("ingresa la edad: ");
        edad = entrada.nextInt();

        System.out.println("ingresa el sueldo: ");
        salario = entrada.nextDouble();
        entrada.nextLine();
                
        Empleados e = new Empleados(nombre, apellido, edad, salario);

        return e;

    }

}

/*
        Empleados empleado1 = new Empleados("Montoto", "Flores", 34, 50000);
        Empleados empleado2 = new Empleados("Don", "Pepito", 25, 80000);
        Empleados empleado3 = new Empleados("Don", "Jose", 85, 80000);
        
        empresa1.agregarEmpleado(empleado1);
        empresa1.agregarEmpleado(empleado2);
        empresa1.agregarEmpleado(empleado3);
        
 */
 /*
        for(Empleados empleado:empleados){
            if(empleado != null){
                System.out.println(empleado.getDatos());
                if(empleado.getEdad()>49){
                    System.out.println("Atención!!! " + empleado.getNombre()+ " " + empleado.getApellido() + " tiene " + empleado.getEdad() + " años, merece un aumentito.");
                    empleado.setSalario(empleado.getSalario()+5000);
                    System.out.println("El nuevo sueldo de " + empleado.getNombre()+ " " + empleado.getApellido() + " es de $" + empleado.getSalario());

                }
            }
        }
 */
 /*
        if(empleado1.getEdad()>39){
            double salarioAcrecentado = empleado1.getSalario() + 5000;
            empleado1.setSalario(salarioAcrecentado);
            System.out.println ("El salarios acrecentado es: " + salarioAcrecentado);
        }
        
        empleado1.setEdad(40);
        
        if(empleado1.getEdad()>39){
            System.out.println (empleado1.getNombre() +" tiene mas de 40 años corresponde aumentar el salario");
            double salarioAcrecentado = empleado1.getSalario() + 5000;
            empleado1.setSalario(salarioAcrecentado);
            System.out.println ("El salarios acrecentado es: " + salarioAcrecentado);
        }
        
        System.out.println(empleado1.getDatos());
    }
    
   public static void arrEmpleados(String[] args){
       for(int i = 1 ; )
   };
 */
