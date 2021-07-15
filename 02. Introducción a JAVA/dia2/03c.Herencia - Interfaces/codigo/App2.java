public class App2{
	
	public static void main(String argv[])
	{
    	String s1 = "primera cadena   ";
        String s2 = new String("segunda|cadena");
        String s8 = "";

        if(s1.equals(s2))
        {
            System.out.println(s1.equals(s2));
        }

        String s3 = s1.trim();//Nos quita los espacios de delante y detrás

        String s4[] = s2.split("|"); //Trocea un string en un array de string

        String s5 = s1.toUpperCase(); //a mayúsculas

        String s6 = s1.toLowerCase(); // a minúsculas

        String s7 = s1.substring(1,3); //subcadenasd

        int i8 =  s1.indexOf("cadena");
        

        String s9 = s1.substring(s1.indexOf("cadena")); //Nos sacaría de cadena en adelante

	}

}