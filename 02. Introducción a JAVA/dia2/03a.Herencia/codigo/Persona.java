public class Persona{
	
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
		/*Podríamos haber realizado una implementación más compleja de este estilo
		boolean mayorEdad = false;
		if(edad >= MAYOREDAD)
			mayorEdad = true;
		return mayorEdad;
		*/
	}


	public String getInfo()
	{
		return this.getNombre() + DELIMITADOR + this.getEdad() + DELIMITADOR + this.isMayorEdad() + DELIMITADOR + ((isMayorEdad()?"ES MAYOR DE EDAD":"NO ES MAYOR DE EDAD") + DELIMITADOR + PAIS);
	}

	//static int MAYOREDAD = 18;
	public static void setMAYORIAEDAD(int MAYORIAEDAD)
	{
		MAYOREDAD = MAYORIAEDAD;
	}

}