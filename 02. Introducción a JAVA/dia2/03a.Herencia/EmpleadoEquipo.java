public abstract class EmpleadoEquipo {
    String nombre;
    String apellidos;
    Equipo equipo;

    public EmpleadoEquipo(String nombre, String apellidos, Equipo equipo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.equipo = equipo;
    }
    public EmpleadoEquipo(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "EmpleadoEquipo{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", equipo=" + equipo +
                '}';
    }
}
