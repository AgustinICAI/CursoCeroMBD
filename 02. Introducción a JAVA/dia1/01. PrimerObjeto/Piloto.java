class Piloto {
    String nombre;
    String apellidos;
    Equipo equipo;
    Coche coche;
    int dorsal;

    boolean experienciaPrevia;

    Piloto(String nombre,String apellidos) {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
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
        return "nombre: " + nombre + ", " +
                "apellidos: " + apellidos + ", " +
                "equipo: " + equipo.getEscuderia() + ", " +
                "coche: " + coche.toString() + ", " +
                "dorsal: " + dorsal ;
    }


}
