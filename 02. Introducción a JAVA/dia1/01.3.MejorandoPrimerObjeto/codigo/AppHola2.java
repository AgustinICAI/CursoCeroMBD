public class AppHola2 {
	
	public static void main (String argv[])
	{
		String s = "hola"; // String s = new String(['h','o','l','a']);
		Pelicula pelicula = new Pelicula();

		pelicula.setNombre("El Jocker");
		pelicula.setPuntuacion(8);

		Persona pConPelicula = new Persona("Juan",pelicula);
		System.out.println(pConPelicula.getInfo());

		Persona[] ps = new Persona[10];
		ps[3] = new Persona("David","Perez","Gomez",17);

		System.out.println(ps[3].getInfo("#"));

		for (int i = 0; i< ps.length; i++)
		{
			if(ps[i] != null)
				System.out.println("pos["+i+"]-"+ps[i].getInfo());
		}

		int i = 0;
		while (i < ps.length){
			if(ps[i] != null)
				System.out.println("pos["+i+"]-"+ps[i].getInfo());
			i++;
		}

		//BUCLE FOR EACH
		for(Persona p : ps)
			if(p != null)
				System.out.println(p.getInfo());
		

		int [] ints = new int[20];
		for (int j : ints)
			System.out.print(j+",");

		System.out.println();
		double[][] ds = new double[3][5];
		for (double[] f : ds)
			for (double c : f)
				System.out.print(c+",");
		System.out.println();
		for (int f = 0; f< ds.length; f ++)
			for (int c = 0; c< ds[f].length; c ++)
				System.out.print(ds[f][c]+",");

	}


}