package es.icai.ioExample;

import java.io.*;

public class MainBinario {

    public static void main(String[] args) {

        System.out.println(File.separator);
        //ESCRITURA
        File f = new File("."+File.separator+"CARPETA");
        File f1 = new File("."+File.separator+"objetos.dat");
        File f2 = new File("/home/b0904853/ICAI/javaCourseExamples");

        String isDir = f.isDirectory()? "Si": "No";

        Persona p1 = new Persona("Agustin","5090",18);
        Persona p2 = new Persona("Paco","4444",20);
        Persona p3 = new Persona("4444");


        try {
            FileOutputStream fos = new FileOutputStream(f1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject("Un string de prueba");
            oos.writeObject(3121);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //LECTURA
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(f1);
            ois = new ObjectInputStream(fis);

            while(true)
                System.out.println(ois.readObject());


        } catch(EOFException e)
        {
            //Fin de fichero
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}
