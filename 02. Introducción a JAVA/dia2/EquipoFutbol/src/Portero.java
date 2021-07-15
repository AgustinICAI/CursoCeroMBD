public class Portero extends Jugador {
    private int paradas;
    private int golesEncajados;

    public Portero (String nombre, String idEmpleado, String equipo, double salarioBase)
    {
        super(nombre, idEmpleado,equipo,salarioBase);
    }

    public double calculaNomina() {
        //return super.getSalarioBase()  + 1000 * paradas - 2000 * golesEncajados;
        return getSalarioBase()  + 1000 * paradas - 2000 * golesEncajados;

    }

    public Portero (String nombre, String idEmpleado, String equipo, double salarioBase, int anoInicioContrato)
    {
        super(nombre, idEmpleado,equipo,salarioBase,anoInicioContrato);
    }


    public int getParadas() {
        return paradas;
    }

    public void setParadas(int paradas) {
        this.paradas = paradas;
    }

    public int getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(int golesEncajados) {
        this.golesEncajados = golesEncajados;
    }
}

