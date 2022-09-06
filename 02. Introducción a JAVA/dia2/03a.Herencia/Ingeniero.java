public class Ingeniero extends EmpleadoEquipo{
    String resumenVidaLaboral;

    public Ingeniero(String nombre, String apellidos, Equipo equipo, String resumenVidaLaboral){
        super(nombre,apellidos,equipo);
        this.resumenVidaLaboral = resumenVidaLaboral;
    }

    public String getResumenVidaLaboral() {
        return resumenVidaLaboral;
    }

    public void setResumenVidaLaboral(String resumenVidaLaboral) {
        this.resumenVidaLaboral = resumenVidaLaboral;
    }

    @Override
    public String toString() {
        /*return "Ingeniero{" +
                "resumenVidaLaboral='" + resumenVidaLaboral + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", equipo=" + equipo +
                '}';*/

        return "Ingeniero ->" + super.toString() +
                ", resumenVidaLaboral='" + resumenVidaLaboral + '\'';
    }
}
