//Trabajador es una Persona
public class Trabajador extend Persona
{
    String nombre;
    int edad;    
    String profesion;

    public Trabajador(String nombre, int edad, String profesion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
    }

    String getProfesion()
    {
        return profesion;
    }

    void setProfesion(String profesion)
    {
        this.profesion = profesion;
    }    

   @Override
    public String getinfo()
    {
        return "Nombre............" + this.formatear(nombre) + "\nEdad..........." +
         this.formatear(edad) + "\nCiudad........." + CIUDAD + "<br />" +  "\nProfesion: " + this.formatear(profesion);
    }
}