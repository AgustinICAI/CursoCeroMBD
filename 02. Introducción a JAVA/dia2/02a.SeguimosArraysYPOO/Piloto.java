class Piloto {

    //Atributos de Instancia
    String nombre;
    String apellidos;
    Equipo equipo;
    Coche coche;
    int dorsal;

    boolean experienciaPrevia;

    //Atributos de clase
    static int DORSAL_POR_DEFECTO = -999999;


    Piloto(String nombre,String apellidos) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
        dorsal = DORSAL_POR_DEFECTO;
    }
    Piloto (String nombre, String apellidos, Equipo equipo, Coche coche, int dorsal){
        /*this.nombre = nombre;
        this.apellidos = apellidos;
        this.equipo = equipo;
        this.coche = coche;
        this.dorsal = dorsal;*/

        this(nombre, apellidos);
        setEquipo(equipo);
        setCoche(coche);
        setDorsal(dorsal);
    }

    Piloto (String nombre, String apellidos, Equipo equipo, Coche coche, int dorsal, boolean experienciaPrevia){
        this(nombre, apellidos, equipo, coche, dorsal);
        this.experienciaPrevia = experienciaPrevia;
    }


    String getNombre(){
        return nombre;
    }

    String getApellidos(){
        return apellidos;
    }

    Equipo getEquipo(){
        return equipo;
    }
    Coche getCoche(){
        return coche;
    }

    int getDorsal(){
        return dorsal;
    }

    void setNombre(String nombre){
        this.nombre = nombre;
    }

    void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    void setCoche(Coche coche){
        this.coche = coche;
    }

    void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    void setDorsal(int dorsal){
        this.dorsal = dorsal;
    }





    public String toString(){

        String equipoAux = "";

        if(equipo!=null){
            equipoAux = "equipo:" + equipo.getEscuderia() + ", ";
        }
        /*
        String cocheAux = "";
        if(coche!=null)
            cocheAux = "coche:" + coche.toString()+", ";
        */

        return "nombre: " + nombre + ", " +
                "apellidos: " + apellidos + ", " +
                equipoAux +
                (coche!=null?"coche: " + coche.toString():"") +
                (dorsal!=-999999?"dorsal: " + dorsal:"" );
    }

    //METODOS DE INSTANCIA
    boolean getDorsalConSuerteMETODODEINSTANCIA(){
        if(this.dorsal==7 || this.dorsal==8)
            return true;
        else return false;
    }

    //METODOS DE CLASE
    static boolean getDorsalConSuerteMETODODECLASE(int dorsal){
        if(dorsal==7 || dorsal==8)
            return true;
        else return false;
    }

}
