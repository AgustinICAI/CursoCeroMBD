import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MainCollection {

    public static void main(String argv[])
    {

        ArrayList a = new ArrayList();

        a.add("Una cadena cualquiera");
        a.add(new Double(12312d));
        a.add("Y una mas");

        System.out.println(a);

        a.remove(1);
        System.out.println(a);

        a.remove(new String("Y una mas"));
        System.out.println(a);

        a.add(0,"PRIMERA CADENA");

        System.out.println(a);

        Object o3 = a.get(1);
        //Tamaño del arraylist
        System.out.println(a.size());

        for(Object o : a)
            System.out.println(o);


        //ITERATOR
        Iterator it = a.iterator();

        while (it.hasNext())
        {
            Object o = it.next();
            System.out.println("->"+o);
        }

        System.out.println("---------------------------------");

        ArrayList<Persona> aPersonas = new ArrayList<>();

        aPersonas.add(new Persona("Pepe"));
        aPersonas.add(new Profesor("Pepe","123412"));

        System.out.println(aPersonas);

        LinkedList<Trabajador> ll = new LinkedList<>();

        Iterator it2 = ll.iterator();
        while(it2.hasNext())
        {
            Trabajador t = (Trabajador) it2.next();
        }

        ll.add(new Profesor("Juan","241241"));
        ll.addLast(new Profesor("PEPE","23123"));

        it = ll.descendingIterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        boolean b = aPersonas.contains(new Persona("Paco"));
        boolean b1 = aPersonas.contains(new Persona("Pepe"));

        System.out.println(b);




    }
}
