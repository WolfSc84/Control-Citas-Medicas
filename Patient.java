/**
 * Clase para manejar el objeto paciente.
 * Permite registrar los pacientes que se añaden al sistema, registrar y manejar su informacion.
 */
public class Patient extends User{
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor
    Patient(String name, String email){
        super(name, email);
        System.out.println("Construyendo el objeto Paciente.");
    }

    //Comportamientos

    // 54.5
      /**
     * Metodo para definir el peso del paciente.
     * @param weight Valor del peso del paciente
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

 
    // 54.5 Kg. String
    /**
     * Metodo para obtener el peso del paciente.
     * @param weight Valor del peso del paciente
     * @return Retorna el valor del peso del paciente
     */
    public String getWeight(){
        return this.weight + " Kg.";
    }

    /**
     * Metodo para obtener la altura del paciente.
     * @param height Valor de la altura del paciente.
     * @return Retorna la altura del paciente.
     */
    public String getHeight() {
        return height + " Mts.";
    }

    /**
     * Metodo para definir la altura del paciente.
     * @param height Valor de la altura del paciente.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Metodo para definir la fecha de nacimiento del paciente
     * @param birthday Fecha de nacimiento del paciente.
     * @return Retorna la fecha de nacimiento del paciente.
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Metodo para obtener la fecha de nacimiento del paciente
     * @param birthday Fecha de nacimiento del paciente.
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Metodo para obtener el tipo de sangre del paciente
     * @param blood Tipo de sangre del paciente.
     * @return Retorna el tipo de sangre del paciente.
     */
    public String getBlood() {
        return blood;
    }

    /**
     * Metodo para definir el tipo de sangre del paciente
     * @param blood Tipo de sangre del paciente.
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }
}