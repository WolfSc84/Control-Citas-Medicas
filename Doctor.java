public class Doctor{
    //Propiedades
    static int id = 0; //Autoincrement
    String name;
    String speciality;

    //Constructor
    Doctor(String name){
        System.out.println("Construyendo el objeto Doctor.");
        this.name = name;
        id++; 
    }

    //Comportamientos
    /**
     * Metodo para imprimir el nombre del doctor.
     * @param name Variable que almacena el nombre de la variable.
     */
    public void showName(){
        System.out.println(name);
    }

    /**
     * Metodo para imprimir el id actual del objeto creado.
     * @param id Es d epor si un contador de objetos creados.
     */
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
}