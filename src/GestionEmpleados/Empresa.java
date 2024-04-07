package GestionEmpleados;

public class Empresa {

    private String nombre;
    private int fundacion;
    private Empleados[] listaEmpleados;
    private int cantMax;
    private int cantActual; //a esto se lo conoce como tamaño lógico

    public Empresa(String nombre, int fundacion, int cantMax) {
        this.nombre = nombre;
        this.fundacion = fundacion;
        this.cantMax = cantMax;
        this.cantActual = 0;
        this.listaEmpleados = new Empleados[this.cantMax];
    }

    public void agregarEmpleado(Empleados e) {
        if (this.cantActual < this.cantMax) {
            this.listaEmpleados[this.cantActual++] = e;
            System.out.println("Se agregó el empleado: " + e.getNombre());
        } else {
            System.out.println("Cupo maximo de empleados alcanzado");
        }
    }

    public void mostrarLista() {
        if (cantActual > 0) {
            System.out.println("Lista de empleados");
            System.out.println("=======");
            for (int i = 0; i < cantActual; i++) {
                int emp = i + 1;
                System.out.println("Empleado " + emp + ": " + listaEmpleados[i].getDatos());
                listaEmpleados[i].aumentoSalario();
                
            }

        } else {
            System.out.println("No hay empleados cargados");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFundacion() {
        return fundacion;
    }

    public void setFundacion(int fundacion) {
        this.fundacion = fundacion;
    }

    public Empleados[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(Empleados[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public int getCantMax() {
        return cantMax;
    }

    public void setCantMax(int cantMax) {
        this.cantMax = cantMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }

}
