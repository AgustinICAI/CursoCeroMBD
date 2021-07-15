public class JugadorCampo extends Jugador {
    private int goles;
    private int asistencias;

    public JugadorCampo (String nombre, String idEmpleado, String equipo, double salarioBase)
    {
        super(nombre, idEmpleado,equipo,salarioBase);
    }

    @Override
    public double calculaNomina() {
        return getSalarioBase() + goles*3000 + asistencias*1000;
    }

    public JugadorCampo (String nombre, String idEmpleado, String equipo, double salarioBase, int anoInicioContrato)
    {
        super(nombre, idEmpleado,equipo,salarioBase,anoInicioContrato);
    }


    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
}

