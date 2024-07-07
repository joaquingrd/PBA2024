
package Parcial1RuizDiazJoaquin;

public class AplicacionCliente {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("99222222226", "Empresa <PBAEnterprise>");
        
        Empleado emp1 = new Empleado(11258, "Morales, Andrea", "Gestor de proyectos");
        Empleado emp2 = new Empleado(11257, "Pinati, Mariano", "Analista");
        Empleado emp3 = new Empleado(11256, "Guardia, Gonzalo", "Desarrollador");
        Empleado emp4 = new Empleado(11255, "Merino, Ana", "Desarrollador");
        Empleado emp5 = new Empleado(11254, "Clivale, Romina", "Analista");
        Empleado emp6 = new Empleado(11253, "Greña, Marcos", "Desarrollador");
        
        Proyecto proy1 = new Proyecto(1001, "Implementación Zona Norte");
        Proyecto proy2 = new Proyecto(1002, "Implementación Zona Sur");
        
        Tarea t11 = new Tarea(10011,"Tarea 1.1", 30);
        Tarea t12 = new Tarea(10012,"Tarea 1.2",250);
        Tarea t13 = new Tarea(10013,"Tarea 1.3",10);
        
        Tarea t21 = new Tarea(10021,"Tarea 2.1", 15);
        Tarea t22 = new Tarea(10022,"Tarea 2.2", 100);
        Tarea t23 = new Tarea(10023,"Tarea 2.3", 15);
        
    /*
    Actividades:
    ============
    1- Cambiar el nombre del paquete Parcial1ApellidoNombre con el Apellido y Nombre del alumno. Ejemplo: Parcial1RodriguezJuan.
    2- En la invocación al constructor de Empresa, cambiar <InventarNombre> por el nombre que vos quieras ponerle a la empresa ficticia.
    3- Completar la definición de las clases con los atributos que faltan y métodos que consideren necesarios.
    4- Implementar la interface en las clases que corresponda, redefiniendo sus métodos también donde corresponda.
    5- En la java main class:
        a) Vincular los seis empleados a la empresa
        b) Vincular los dos proyectos a la empresa
        c) Vincular las tareas t11, t12 y t13 al proyecto proy1
        d) Vincular las tareas t21, t22 y t23 al proyecto proy2
        e) Vincular los empleados emp1, emp2 y emp3 al proyecto proy1.
        f) Asignarle un responsable diferente a cada tarea del proy1.
        g) Vincular los empleados emp4, emp5 y emp6 al proyecto proy2.
        h) Asignarle un responsable diferente a cada tarea del proy2.
        i) Iniciar el proy1.
        j) Iniciar dos tareas del proy1
        k) Iniciar el proy2.
        l) Iniciar las tres tareas del proy2
        m) Terminar las tres tareas del proy2
        n) Terminar el proy2.
        o) Invocar a los 3 listados de empresa. Los listados que involucran proyectos deben mostrar el nombre del proyecto, su estado y 
           el nombre de cada una de sus tareas con sus estados.
        p) Responder las siguientes tres preguntas completando <RESPUESTA> con tu respuesta:
    */   
        System.out.println("De acuerdo al modelo propuesto, cómo lo actualizarías para:");
        System.out.println("1.- Implementar la gestión de dependencias entre tareas en diferentes proyectos");
        System.out.println("1.- <RESPUESTA>");
        
        System.out.println("2.- ¿Cómo se podría representar y manejar la información sobre los recursos compartidos entre proyectos?");
        System.out.println("2.- <RESPUESTA>");
        
        System.out.println("3.- ¿Cómo se podría adaptar el modelo para incorporar nuevos tipos de entidades, como clientes o proveedores?");
        System.out.println("3.- <RESPUESTA>");
        
    }
    
}
