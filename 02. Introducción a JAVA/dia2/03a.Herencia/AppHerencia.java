public class AppHerencia {
    public static void main(String argv[]){

        Coche c1 = new Coche("Renault","RS110",1000);
        Equipo equipoRenault = new Equipo("Renault","flavio briatore");

        Piloto p1 = new Piloto("Fernando","Alonso",equipoRenault,c1,7);
        Ingeniero i1 = new Ingeniero("Paco", "Perez",equipoRenault,"Trabajó 3 años en un taller de barrio");

        System.out.println(p1);
        System.out.println(i1);
        //SI LA CLASE ES ABSTRACTA, NO SE PUEDEN CREAR INSTANCIAS DE ESA CLASE
        //EmpleadoEquipo ee = new EmpleadoEquipo("Juan","Gómez");



    }
}
