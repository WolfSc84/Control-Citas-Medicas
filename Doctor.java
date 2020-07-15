import java.util.ArrayList;
import java.util.Date;

/**
 * Clase para manejar el objeto doctor.
 * Permite registrar los doctores que se añaden al sistema, registrar y manejar su informacion.
 */
public class Doctor extends User{
    //Propiedades

    private String speciality;

    //Constructor
    Doctor(String name, String email){
        super(name, email);
        System.out.println("Construyendo el objeto Doctor.");
    }

    //Comportamientos

    /**
     * Metodo para obtener la especialidad del doctor.
     *  @param speciality Nombre del doctor.
     *  @return Retorna la especilidad del doctor.
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Metodo para definir la especialidad del doctor.
     *  @param speciality Nombre del doctor.
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Define una coleccion del tipo List indicandole entre <> que solo puede recibir objetos del tipo de la clases anidadas definida, que en este caso es estatica por ello recibira la clase directamente y los datos date y time
     * Se observa como se define y se instancia tal cual un objeto normal porque este array de por si es un objeto en si que almacena mas objetos dentro de el.
     */
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /**
     * Metodo para agregar nuevas citas al array coleccion creado previamente.
     * Podemos indicar el nombre de la clase indicandole la direccion completa tal como lo hicimos o solo colocando el nombre de la clase anidada ya que esta dentro de la clase externa donde definimos el metodo
     * @param availableAppointments Coleccion de objetos del tipo AvailableAppointments 
     */
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    /**
     * Metodo para obtener las citas añadidas a la coleccion availableAppointments
     * @return Retorna el valor de la coleccion entera.
     */
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        /**
        * Metodo para definir la fecha de la cita.
        *  @param date Fecha de la cita
        */
        public void setDate(Date date) {
            this.date = date;
        }

        /**
        * Metodo para obtener la fecha de la cita.
        *  @param date Fecha de la cita
        */
        public Date getDate() {
            return this.date;
        }

        /**
        * Metodo para definir la hora de la cita.
        *  @param time Hora de la cita
        */
        public void setTime(String time) {
            this.time = time;
        }

        /**
        * Metodo para obtener la hora de la cita.
        *  @param time Hora de la cita
        */
        public String getTime() {
            return this.time;
        }

        /**
        * Metodo para definir el Id de la cita.
        *  @param id Id de la cita
        */
        public void setId(int id) {
            this.id = id;
        }

        /**
        * Metodo para obtener Id de la cita.
        *  @param id Id de la cita
        */
        public int getId() {
            return this.id;
        }


    }


}