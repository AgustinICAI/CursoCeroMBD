public abstract class Jugador extends Empleado {
    int partidosGanados;
    double velocidadMaxima;
    double peso;
    int anos;
    int anoInicioContrato;

    public Jugador (String nombre, String idEmpleado, String equipo, double salarioBase)
    {
        super(nombre, idEmpleado,equipo, salarioBase);
    }

    public Jugador (String nombre, String idEmpleado, String equipo, double salarioBase, int anoInicioContrato)
    {
        this(nombre, idEmpleado,equipo,salarioBase);
        this.anoInicioContrato = anoInicioContrato;
    }


}
