public class Persona{
	
	int MAYOREDAD = 19;

	private String nombre;
	private String apellido2;
	private String apellido1;
	private int edad;
	private Pelicula pelicula;

	public Persona (String nombre, String apellido1, String apellido2, int edad )
	{
		this.setNombre(nombre);
		this.apellido1 = apellido1;
		this.apellido2 = apellido2; 
		this.setEdad(edad);
	}
	public Persona (String nombre)
	{
		this.setNombre(nombre);
		this.apellido1 = "";
		this.apellido2 = "";
		this.edad = 18;
	}
	public Persona (String nombre, Pelicula pelicula)
	{
		this.setNombre(nombre);
		this.apellido1 = "";
		this.apellido2 = "";
		this.edad = 18;
		this.pelicula = pelicula;
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
		/*Podríamos haber realizado una implementación más compleja de este estilo
		boolean mayorEdad = false;
		if(edad >= MAYOREDAD)
			mayorEdad = true;
		return mayorEdad;
		*/
	}

	public String getInfo()
	{
		return this.getInfo(",");
		//La lógica del programa principal, tiene que estar en el programa principal, no en el objeto.
		//System.out.println(s1);
	}


	public String getInfo(String delimitador)
	{
		if(this.pelicula != null)
			return this.getNombre() + delimitador + this.getEdad() + delimitador + this.isMayorEdad() +delimitador+ this.pelicula.getNombre();

		else
		    return this.getNombre() + delimitador + this.getEdad() + delimitador + this.isMayorEdad();
		//La lógica del programa principal, tiene que estar en el programa principal, no en el objeto.
		//System.out.println(s1);
	}

}