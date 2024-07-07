/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialpromocion_miguelangelparra;

public class AplicacionCliente {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("99222222226", "Empresa Ficticia");

        Empleado emp1 = new Empleado(11258, "Morales, Andrea", "Gestor de proyectos");
        Empleado emp2 = new Empleado(11257, "Pinati, Mariano", "Analista");
        Empleado emp3 = new Empleado(11256, "Guardia, Gonzalo", "Desarrollador");
        Empleado emp4 = new Empleado(11255, "Merino, Ana", "Desarrollador");
        Empleado emp5 = new Empleado(11254, "Clivale, Romina", "Analista");
        Empleado emp6 = new Empleado(11253, "Greña, Marcos", "Desarrollador");

        Proyecto proy1 = new Proyecto(1001, "Implementación Zona Norte");
        Proyecto proy2 = new Proyecto(1002, "Implementación Zona Sur");

        Tarea t11 = new Tarea(10011, 30);
        Tarea t12 = new Tarea(10012, 250);
        Tarea t13 = new Tarea(10013, 10);

        Tarea t21 = new Tarea(10021, 15);
        Tarea t22 = new Tarea(10022, 100);
        Tarea t23 = new Tarea(10023, 15);

        empresa.vincularEmpleado(emp1);
        empresa.vincularEmpleado(emp2);
        empresa.vincularEmpleado(emp3);
        empresa.vincularEmpleado(emp4);
        empresa.vincularEmpleado(emp5);
        empresa.vincularEmpleado(emp6);

        empresa.vincularProyecto(proy1);
        empresa.vincularProyecto(proy2);

        proy1.vincularTarea(t11);
        proy1.vincularTarea(t12);
        proy1.vincularTarea(t13);

        proy2.vincularTarea(t21);
        proy2.vincularTarea(t22);
        proy2.vincularTarea(t23);

        proy1.vincularEmpleado(emp1);
        proy1.vincularEmpleado(emp2);
        proy1.vincularEmpleado(emp3);

        t11.asignarResponsable(emp1);
        t12.asignarResponsable(emp2);
        t13.asignarResponsable(emp3);

        proy2.vincularEmpleado(emp4);
        proy2.vincularEmpleado(emp5);
        proy2.vincularEmpleado(emp6);

        t21.asignarResponsable(emp4);
        t22.asignarResponsable(emp5);
        t23.asignarResponsable(emp6);

        proy1.iniciar();
        t11.iniciar();
        t12.iniciar();

        proy2.iniciar();
        t21.iniciar();
        t22.iniciar();
        t23.iniciar();

        System.out.println("De acuerdo al modelo propuesto, cómo lo actualizarías para:");
        System.out.println("1.- Implementar la gestión de dependencias entre tareas en diferentes proyectos");
        System.out.println("1.- Para implementar la gestión de dependencias entre tareas en diferentes proyectos, se podría introducir un mecanismo donde una tarea pueda tener una referencia a otras tareas en diferentes proyectos que deben completarse antes de que pueda iniciar. Esto se lograría agregando un campo en la clase Tarea que contenga una lista de referencias a las tareas dependientes. Además, se debería ajustar la lógica de inicio de una tarea para verificar primero que todas las tareas dependientes estén completadas antes de iniciar la tarea en cuestión.");
        
        System.out.println("2.- ¿Cómo se podría representar y manejar la información sobre los recursos compartidos entre proyectos?");
        System.out.println("2.- Para representar y manejar la información sobre los recursos compartidos entre proyectos, se podría mantener una lista centralizada de recursos dentro de la clase Empresa. Cada proyecto podría tener acceso a esta lista para verificar la disponibilidad de recursos antes de vincularlos a una tarea específica. Además, se podría implementar un mecanismo de reserva y liberación de recursos para garantizar que no se asignen simultáneamente a tareas conflictivas en diferentes proyectos.");
        
        System.out.println("3.- ¿Cómo se podría adaptar el modelo para incorporar nuevos tipos de entidades, como clientes o proveedores?");
        System.out.println("3.Para adaptar el modelo e incorporar nuevos tipos de entidades como clientes o proveedores, se podría crear nuevas clases como Cliente y Proveedor que contengan atributos relevantes para cada entidad (por ejemplo, nombre, contacto, dirección). Estas clases podrían vincularse con los proyectos o incluso directamente con las tareas si es necesario. Además, podrían implementarse métodos específicos para gestionar la relación y la interacción con estas entidades dentro del contexto de los proyectos y las tareas.");
    }
}


   

    

