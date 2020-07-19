package src.model;

public abstract class User {
    // Atributos
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    /**
     * Metodo constructor del usuario
     * 
     * @param name  Nombre del usuario
     * @param email Email del usuario
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
        System.out.println("Construyendo el objeto User.");
    }

    // Comportamientos

    /**
     * Metodo abstracto, de obligatoria implementacion por ser de una clase
     * abstracta. Este metodo muestra los datos de los usuarios. Muestra toda la
     * informacion pertinente del usuario.
     */
    public abstract void showDataUser();

    /**
     * Metodo para obtener el id del usuario.
     * 
     * @param id Identificacion del usuario.
     * @return Retorna el id del usuario.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Metodo para definir el id del usuario.
     * 
     * @param email Identificacion del usuario.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo para obtener name id del usuario.
     * 
     * @param name Nombre del usuario.
     * @return Retorna el id del usuario.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo para definir el nombre del usuario.
     * 
     * @param email Nombre del usuario.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para obtener el email del usuario.
     * 
     * @param email Mail del usuario.
     * @return Retorna el mail del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Metodo para definir el mail del usuario.
     * 
     * @param email Mail del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Metodo para obtener la direccion del paciente.
     * 
     * @param address Direccion del paciente.
     * @return Retorna la direccion del paciente.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Meotod para definir la direccion del paciente.
     * 
     * @param address Direccion del paciente.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Metodo para de obtener el telefono del paciente.
     * 
     * @param phoneNumber Numero de telefono del paciente.
     * @return Retorna el telefono del paciente.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Metodo para de definir el telefono del paciente.
     * 
     * @param phoneNumber Numero de telefono del paciente.
     */
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 8) {
            System.out.println("El número telefónico debe ser de 8 dígitos máximo");
        } else if (phoneNumber.length() == 8) {
            this.phoneNumber = phoneNumber;
        }
    }

    /**
     * Metodo para sobreescribir el metodo toString el cual es llamado
     * automaticamente cuando se imprime en consola el objeto en general.
     * 
     * @return Retornara el metodo toString de la clase Padre del tipo, añadiendo
     *         mas comportamiento en el caso Usuario.
     */
    @Override
    public String toString() {
        return "User:" + name + ", Email: " + email + ", Address: " + address + ", Phone: " + phoneNumber + ", Hash: "
                + Integer.toHexString(super.hashCode()) + ", Objeto: " + super.getClass().getName();
    }

    /**
     * Metodo para imprimir el nombre del doctor.
     * 
     * @param name Variable que almacena el nombre de la variable.
     */
    public void showName() {
        System.out.println(name);
    }

    /**
     * Metodo para imprimir el id actual del objeto creado.
     * 
     * @param id Muestra id del usuario.
     */
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }

}