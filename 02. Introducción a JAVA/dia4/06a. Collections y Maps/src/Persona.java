import java.util.Objects;

public class Persona implements Comparable{
	
	static int MAYOREDAD = 18;
	static String PAIS = "España";
	static String DELIMITADOR = ",";

	private String nombre;
	private String apellido2;
	private String apellido1;
	private int edad;

	public Persona()
	{
		this("Fulano","","",MAYOREDAD);
	}

	public Persona (String nombre, String apellido1, String apellido2, int edad )
	{
		this.setNombre(nombre);
		this.apellido1 = apellido1;
		this.apellido2 = apellido2; 
		this.setEdad(edad);
	}
	public Persona (String nombre)
	{
		this(nombre,"","",MAYOREDAD);
	}

	public Persona (String nombre, int edad)
	{
		this(nombre,"","",edad);
	}

	public String getNombre()
	{
		return nombre;
	}


	public void setNombre(String nombre)
    {
    	this.nombre=nombre;
  	}

	public int getEdad ()
	{
	    return edad;
	}

	public void setEdad(int edad)
	{
	     this.edad=edad;
	}


    public void cumplirAnos(){
	    edad = edad+1;
	}

	public int cumplirAnosYDevuelveEdad(){
	    edad = edad+1;
	    return edad;
	}

	public boolean isMayorEdad()
	{
		return edad >= MAYOREDAD;
		/*Podramos haber realizado una implementacion mas compleja de este estilo
		boolean mayorEdad = false;
		if(edad >= MAYOREDAD)
			mayorEdad = true;
		return mayorEdad;
		*/
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Persona)) return false;
		Persona persona = (Persona) o;
		return Objects.equals(getNombre(), persona.getNombre()) &&
				Objects.equals(apellido2, persona.apellido2) &&
				Objects.equals(apellido1, persona.apellido1);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getNombre(), apellido2, apellido1);
	}

	public String toString()
	{
		return this.getNombre() + DELIMITADOR + this.getEdad() + DELIMITADOR + this.isMayorEdad() + DELIMITADOR + ((isMayorEdad()?"ES MAYOR DE EDAD":"NO ES MAYOR DE EDAD") + DELIMITADOR + PAIS);
	}

	//static int MAYOREDAD = 18;

	public static void setMAYORIAEDAD(int MAYORIAEDAD)
	{
		MAYOREDAD = MAYORIAEDAD;
	}


	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Override
	public int compareTo(Object o) {
		if(o instanceof Persona)
		{
			Persona p = (Persona)o;
			//this.getNombre().compareTo(p.getNombre());
			if(this.getNombre().equals(p.getNombre()) && this.apellido1.equals(p.getApellido1()))
				return 0;
			else if (this.getNombre().equals(p.getNombre()))
				return this.getApellido1().compareTo(p.getApellido1());
			else//Ordenando por Nombre
				return this.getNombre().compareTo(p.getNombre());

		}
		else
			return -1;
	}
}