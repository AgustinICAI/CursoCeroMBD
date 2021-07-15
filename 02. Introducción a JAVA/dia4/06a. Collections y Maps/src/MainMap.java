import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeSet;

public class MainMap {
    public static void main(String argv[]) {
        //CLave y Valor
        HashMap<String, String> hm = new HashMap<>();
        //Equivalente al add de las collections
        hm.put("Juan", "Audi");
        hm.put("Pablo1", "Hummer");
        hm.put("Pablo2", "Fiat");
        hm.put("Miriam", "Fiat");


        HashMap<Persona, Persona> hmAmor = new HashMap<>();

        hmAmor.put(new Persona("Juan"), new Persona("Maria"));
        hmAmor.put(new Persona("Pepe"), new Persona("Maria"));
        hmAmor.put(new Persona("Maria"), new Persona("Juana"));
        Persona pAmorJuan = hmAmor.get("Juan");
        for (Map.Entry<Persona, Persona> m : hmAmor.entrySet()) {
            System.out.println(m.getKey().getNombre() + " le gusta " + m.getValue().getNombre());
        }

        HashMap<Persona, Persona[]> hmAmorPoli = new HashMap<>();
        hmAmorPoli.put(new Persona("Juan"), new Persona[10]);
        hmAmorPoli.put(new Persona("Pepe"), new Persona[10]);
        hmAmorPoli.put(new Persona("Maria"), new Persona[10]);


        Persona ps[] = hmAmorPoli.get(new Persona("Juan"));
        ps[0] = new Persona("Maria");
        ps[1] = new Persona("Juana");

        for (Map.Entry<Persona, Persona[]> m : hmAmorPoli.entrySet()) {
            String amores = "";
            for (Persona a : m.getValue())
                if (a != null)
                    amores = amores + a.getNombre() + ",";
            System.out.println(m.getKey().getNombre() + " le gusta " + amores);
        }

        HashMap<Persona, HashSet<Persona>> hmAmorPoli2 = new HashMap<>();
        hmAmorPoli2.put(new Persona("Juan"), new HashSet<>());
        hmAmorPoli2.put(new Persona("Pepe"), new HashSet<>());
        hmAmorPoli2.put(new Persona("Maria"), new HashSet<>());

        hmAmorPoli2.get(new Persona("Juan")).add(new Persona("Maria"));
        hmAmorPoli2.get(new Persona("Juan")).add(new Persona("Maria"));

        HashSet<Persona> aux = hmAmorPoli2.get(new Persona("Juan"));
        aux.add(new Persona("Juana"));

        for (Map.Entry<Persona, HashSet<Persona>> m : hmAmorPoli2.entrySet()) {
            String amores = "";
            for (Persona a : m.getValue())
                    amores = amores + a.getNombre() + ",";
            System.out.println(m.getKey().getNombre() + " le gusta " + amores);
        }
        



    }
}
