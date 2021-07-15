public class Bedel extends Trabajador
{
	int[] plantasControladas;

	public Bedel (String nombre, String apellido1, String apellido2, int edad, String numSS, int[] plantasControladas)
	{
		super(nombre, apellido1, apellido2, edad, numSS);
		this.plantasControladas = plantasControladas;
	}
	public Bedel (String nombre, String numSS, int[] plantasControladas)
	{
		super(nombre, numSS);
		this.plantasControladas = plantasControladas;
	}
	public Bedel (String nombre, String apellido1, String apellido2, int edad, String numSS)
	{
		super(nombre, apellido1, apellido2, edad, numSS);
		plantasControladas = new int[20];
		plantasControladas[0] = 3;
		plantasControladas[1] = 4;
	}

	public double cobrarNomina()
	{
		return 950d;
	}
}