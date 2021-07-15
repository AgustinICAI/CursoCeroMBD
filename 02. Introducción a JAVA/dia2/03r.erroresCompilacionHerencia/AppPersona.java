//Definición de la clase que dará vida a los objetos Persona
public class AppPersona
{
    public static void main(String args[]) 
    {
		Persona.setCIUDAD("Madrid");

        Persona persona1 = new Persona("Luis", 22);
        Trabajador trabajador1 = new Trabajador("Lucas", 30, "Teleco");

        Persona p = trabajador1;

        System.out.println(p.getInfo());
        System.out.println(p.getProfesion());
    }
   
}
