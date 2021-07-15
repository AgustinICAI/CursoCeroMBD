package principalesClases;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
	    int i0 = 12451;
	    int i4 = 123;
	    Integer i1 = new Integer(i0);
	    Integer i2 = i0;
	    Double d1 = 341.43d;
	    System.out.println((double)i0/(double)i4);
	    int i5 = Integer.valueOf("41");

	    System.out.println(Math.sin(Math.toRadians(30)));

		System.out.println(Math.PI);

		System.out.println((double)31/0);
		String s1 = "hola0";
		String s2 = "hola1";
		System.out.println(s2.compareTo(s1));
		String s3 = s1.substring(0,1).toUpperCase() + s1.substring(1);
		System.out.println(s3);

		if(s1.indexOf("la") >= 0)
			System.out.println("ola en la cadena @ " + s1.indexOf("la"));

		System.out.println("hola " + String.valueOf(3123));

		Calendar c1 = new GregorianCalendar(2015,1,3,20,00,00);
		Calendar c2 = Calendar.getInstance();

		c1.set(Calendar.MONTH,3);
		c2.add(Calendar.HOUR,-3);

		System.out.println(c1.get(Calendar.YEAR) + "-" + c1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c2.getTime());

		System.out.println(c2.getTimeZone());

		Calendar c3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));




	}
}
