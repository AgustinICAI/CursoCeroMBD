public class App{
	
	public static void main(String argv[])
	{
    	Estudiante e1 = new Estudiante("Eugenio","201700254");
    	Trabajador t1 = new Trabajador("Paco","103489-1723489-1720384717");

    	Persona [] personas = new Persona[10];

    	personas[0] = e1;
    	personas[1] = t1;

    	for(Persona p : personas)
    	{
    		if(p!=null)
    			System.out.println(p.getInfo());
    	}

	}


}