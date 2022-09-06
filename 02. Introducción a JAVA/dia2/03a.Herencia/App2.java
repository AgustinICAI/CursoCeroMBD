public class App2 {
    public static void main(String argv[]){

        Clasificacion clasificacion = new Clasificacion();
        Coche c1 = new Coche("Renault","RS110",1000);
        Equipo equipoRenault = new Equipo("Renault","flavio briatore");

        Piloto p1 = new Piloto("Fernando","Alonso",equipoRenault,c1,7);
        Piloto p2 = new Piloto("Louis","Hamilton");
        Piloto p3 = new Piloto("Jarno","Trulli");

        clasificacion.addPiloto(p1);
        clasificacion.addPiloto(p2);
        clasificacion.addPiloto(p3);

        clasificacion.addPiloto(new Piloto("Lewis","Hamilton"));
        clasificacion.addPiloto(new Piloto("George","Russell"));
        clasificacion.addPiloto(new Piloto("Esteban","Ocon"));
        clasificacion.addPiloto(new Piloto("Fernando","Alonso"));
        clasificacion.addPiloto(new Piloto("Kevin","Magnussen"));
        clasificacion.addPiloto(new Piloto("Mick", "Schumacher"));
        clasificacion.addPiloto(new Piloto("Daniel","Ricciardo"));
        clasificacion.addPiloto(new Piloto("Lando", "Norris"));

        System.out.println(clasificacion);

        System.out.println("Tiene buena suerte: " + p1.getDorsalConSuerteMETODODEINSTANCIA());

        System.out.println("Tiene buena suerte: " + p2.getDorsalConSuerteMETODODEINSTANCIA());


        System.out.println("Tiene buena suerte: " + Piloto.getDorsalConSuerteMETODODECLASE(77));



    }
}
