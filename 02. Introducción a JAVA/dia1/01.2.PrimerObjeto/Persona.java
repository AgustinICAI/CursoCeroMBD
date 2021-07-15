public class Persona{
	
	int MAYOREDAD = 19;

	private String nombre;
	private String apellido2;
	private String apellido1;
	private int edad;

	public Persona (String _nombre, String _apellido1, String _apellido2, int _edad )
	{
		nombre = _nombre;
		apellido1 = _apellido1;
		apellido2 = _apellido2; 
		edad = _edad;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String _nombre)
    {
    	nombre=_nombre;
  	}

	public int getEdad ()
	{
	    return edad;
	}

	public void setEdad(int _edad)
	{
	     edad=_edad;
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

}