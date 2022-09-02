public class App1 {

    public static void main(String argv[]){

        System.out.println("Hola alumnos de MBD");

        Coche c1 = new Coche("Renault","RS110",1000);
        //Coche c2 = new Coche("Renault","RS110",1000);
        //Coche c3 = c1;

        Equipo equipoRenault = new Equipo("Renault","flavio briatore");

        Piloto p1 = new Piloto("Fernando","Alonso",equipoRenault,c1,45);
        Piloto p2 = new Piloto("Jarno","Trulli",equipoRenault,c1,55);


        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

}
