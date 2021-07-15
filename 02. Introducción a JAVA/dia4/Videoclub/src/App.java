import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class App {

    public static void main(String argv[])
    {
        HashSet<String> hs = new HashSet<>();

        hs.add("Hola");
        hs.add("que tal");
        hs.add("adios");

        for(String s : hs)
        {
            System.out.println(s);
        }

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Hola");
        ts.add("que tal");
        ts.add("adios");

        for(String s : ts)
        {
            System.out.println(s);
        }
        System.out.println("Treeset con comparator a medida");
        TreeSet<String> ts1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.toUpperCase().compareTo(o2.toUpperCase());
            }
        });

        ts1.add("Hola");
        ts1.add("que tal");
        ts1.add("adios");

        for(String s : ts1)
        {
            System.out.println(s);
        }


    }
}
