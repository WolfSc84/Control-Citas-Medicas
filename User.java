public class User {
    //Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    //Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Construyendo el objeto User.");
    }

    //Comportamientos

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

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
        if (phoneNumber.length() != 8){
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }
    }

    /**
     * Metodo para imprimir el nombre del doctor.
     * @param name Variable que almacena el nombre de la variable.
     */
    public void showName(){
        System.out.println(name);
    }

        /**
     * Metodo para imprimir el id actual del objeto creado.
     * @param id Muestra id del usuario.
     */
    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
    
}