import com.sun.source.tree.Tree;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String discurso = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\profaula\\IdeaProjects\\CuentaPalabras\\src\\discurso.txt")));
            String linea;
            while((linea = br.readLine()) != null)
                discurso += linea;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashSet<String> stopwords = new HashSet<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\profaula\\IdeaProjects\\CuentaPalabras\\src\\stopwords.txt")));
            String linea;
            while((linea = br.readLine()) != null)
                stopwords.add(linea);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



        TreeSet<Palabra> ts = new TreeSet<>();

        String palabras[] = discurso.split("\\n|,|\\.|\\s");
        for(String palabra : palabras)
        {
            palabra = palabra.toLowerCase();
            if(!stopwords.contains(palabra))
            {
                if(ts.contains(new Palabra(palabra)))
                {
                    Palabra p = ts.floor(new Palabra(palabra));
                    p.sumarOcurrencia();
                }
                else {
                    ts.add(new Palabra(palabra));
                }
            }
        }
        ArrayList<Palabra> palabraslist = new ArrayList<Palabra>(ts);
        Collections.sort(palabraslist, new Comparator<Palabra>() {
            @Override
            public int compare(Palabra o1, Palabra o2) {
                Integer o11 = o1.getOcurrencias();
                Integer o21 = o2.getOcurrencias();
                return o21.compareTo(o11);
            }
        });


        for (Palabra p : palabraslist)
            System.out.println(p);

    }
}
