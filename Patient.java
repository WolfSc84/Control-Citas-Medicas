/**
 * Clase para manejar el objeto paciente.
 * Permite registrar los pacientes que se añaden al sistema, registrar y manejar su informacion.
 */
public class Patient {
    //Propiedades
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    //Constructor
    Patient(String name, String email){
        this.name = name;
        this.email = email;
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
     * Metodo para obtener el id del paciente.
     * @param id Valor del id del paciente.
     * @return Retorna el id del paciente.
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para definir el id del paciente.
     * @param id Valor del id del paciente.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para obtener el nombre del paciente.
     *  @param name Nombre del paciente.
     * @return Retorna el nombre del paciente.
     */
    public String getName() {
        return name;
    }

     /**
     * Metodo para definir el nombre del paciente.
     *  @param name Nombre del paciente.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para obtener el email del paciente.
     * @param email Mail del paciente.
     * @return Retorna el mail del paciente.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para definir el mail del paciente.
     * @param email Mail del paciente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo para obtener la direccion del paciente.
     * @param address Direccion del paciente.
     * @return Retorna la direccion del paciente.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Meotod para definir la direccion del paciente.
     * @param address Direccion del paciente.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Metodo para de obtener el telefono del paciente.
     * @param phoneNumber Numero de telefono del paciente.
     * @return Retorna el telefono del paciente.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

       /**
     * Metodo para de definir el telefono del paciente.
     * @param phoneNumber Numero de telefono del paciente.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
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