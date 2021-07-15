package es.icai.ioExample;

import java.io.*;

public class MainTexto {

    public static void main(String argv[])
    {
        //LEYENDO POR PANTALLA
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println(br.readLine());
        }catch(IOException e)
        {
            e.printStackTrace();
        }

        //ESCRITURA
        File f1 = new File("FicheroTexto.txt");
        try {
            /*
            FileWriter fw = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            */
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f1)));
            Persona p1 = new Persona("Juan","50943",30);
            Persona p2 = new Persona("Carlos","50uu943",3);
            Persona p3 = new Persona("PEpe","5jhj0943",39);

            pw.println(p1.toJSON());
            pw.println(p2.toJSON());
            pw.println(p3.toJSON());
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //LECTURA

        try {
            FileReader fr = new FileReader("FicheroTexto.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea = null;
            /*
            linea = br.readLine();
            while(linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            */

            while((linea = br.readLine()) != null) {
                String aBuscar = "\"Nombre\":\"";
                String auxNombre = linea.substring(linea.indexOf(aBuscar)+aBuscar.length());
                auxNombre = auxNombre.substring(0,auxNombre.indexOf("\""));
                System.out.println(auxNombre);
                //CAMPO1,CAMPO2,CAMPO3,CAMPO4
                //String[] campos = linea.split(",");
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
/*
\n

\t


\r



hola\n
\rque\n
\rtal\n


hola\n
que\n
tal\n
*/



