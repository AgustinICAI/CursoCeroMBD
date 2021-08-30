import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        HashMap<String,Integer> palabraVeces = new HashMap<>();

        HashSet<String> stopWords = new HashSet<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("stopwords.txt")));
            String linea;
            while((linea = br.readLine()) !=null)
            {
                stopWords.add(linea);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("discurso.txt")));
            String linea;
            while((linea = br.readLine()) !=null)
            {
                for (String palabra : linea.split("\\s"))
                {
                    palabra = palabra.replaceAll("\\.|\\,|\\:", "");
                    palabra = palabra.toLowerCase();
                    if(!stopWords.contains(palabra)) {
                        if (!palabraVeces.containsKey(palabra))
                            palabraVeces.put(palabra, 1);
                        else {
                            int veces = palabraVeces.get(palabra);
                            palabraVeces.put(palabra, veces + 1);
                        }
                    }
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(palabraVeces);


        TreeMap<Integer,ArrayList<String>> vecesPalabra = new TreeMap<>();

        for(String palabra : palabraVeces.keySet())
        {
            int veces = palabraVeces.get(palabra);

            if(!vecesPalabra.containsKey(veces))
                vecesPalabra.put(veces,new ArrayList<>());

            ArrayList<String> palabras = vecesPalabra.get(veces);
            palabras.add(palabra);
        }

        for(Integer veces : vecesPalabra.descendingMap().keySet())
        {
            System.out.println(veces + " -> " + vecesPalabra.get(veces));
        }

    }
}
