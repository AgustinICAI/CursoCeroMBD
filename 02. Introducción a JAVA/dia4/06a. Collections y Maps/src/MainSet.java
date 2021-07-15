import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MainSet {
    public static void main (String argv[])
    {
        TreeSet<Persona> tsPersonas = new TreeSet<Persona>();

        tsPersonas.add(new Persona("PACO"));
        tsPersonas.add(new Persona("Chuck","Norris","Norris",99));
        tsPersonas.add(new Persona("Christopher","Nolan","Norris",40));
        tsPersonas.add(new Persona("Pamela","Anderson","Norris",40));
        tsPersonas.add(new Persona("penelope","Cruz","Norris",40));
        tsPersonas.add(new Persona("Javier","Bardén","Norris",40));
        Persona chuck = new Persona("Chuck","Norris","Norris",88);
        tsPersonas.remove(chuck);


        tsPersonas.add(chuck);
        /*for(Persona p : tsPersonas)
        {
            System.out.println(p);
        }*/

        int tamano = tsPersonas.size();

        boolean b = tsPersonas.contains(new Persona("Paco"));

        Persona pame = tsPersonas.ceiling(new Persona("pame"));

        Iterator it = tsPersonas.descendingIterator();
        while(it.hasNext())
            System.out.println(it.next());



        HashSet<Persona> hsPersonas = new HashSet<Persona>();

        hsPersonas.add(new Persona("PACO"));
        hsPersonas.add(new Persona("Chuck","Norris","Norris",99));
        hsPersonas.add(new Persona("Christopher","Nolan","Norris",40));
        hsPersonas.add(new Persona("Pamela","Anderson","Norris",40));
        hsPersonas.add(new Persona("penelope","Cruz","Norris",40));
        hsPersonas.add(new Persona("Javier","Bardén","Norris",40));
        hsPersonas.remove(new Persona("Chuck","Norris","Norris",88));
        hsPersonas.add(new Persona("Chuck","Norris","Norris",88));

        System.out.println("==============================");
        for(Persona p : hsPersonas)
            System.out.println(p);


    }


}
