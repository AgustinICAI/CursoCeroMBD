package principalesClases;

import java.util.ArrayList;
import java.util.Collection;

public class MainCollection {

    public static void main(String argv[])
    {

        Collection a = new ArrayList();

        a.add("Una cadena cualquiera");
        a.add(new Double(12312d));
        a.add("Y una mas");

        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        a.remove(new String("Y una mas"));
        System.out.println(a);

        ((ArrayList)a).add(0,"PRIMERA CADENA");
        System.out.println(a);

        System.out.println(a.size());

        for(Object o : a)
            System.out.println(o);

        //ITERATOR


    }
}
