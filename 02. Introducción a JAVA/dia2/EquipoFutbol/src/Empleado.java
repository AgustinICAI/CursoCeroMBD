public abstract class Empleado
{
    private String nombre;
    private String idEmpleado;
    private String equipo;
    private int numeroPartidosAsistidos;
    private double salarioBase;
    private double minutosEntrenados;

    public Empleado(String nombre, String idEmpleado, String equipo, double salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.equipo = equipo;
        this.salarioBase = salarioBase;
    }


    public abstract double calculaNomina();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getNumeroPartidosAsistidos() {
        return numeroPartidosAsistidos;
    }

    public void setNumeroPartidosAsistidos(int numeroPartidosAsistidos) {
        this.numeroPartidosAsistidos = numeroPartidosAsistidos;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}