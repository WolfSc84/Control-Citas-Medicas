package src.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Clase para manejar el objeto doctor. Permite registrar los doctores que se
 * añaden al sistema, registrar y manejar su informacion.
 */
public class Doctor extends User {
    // Propiedades

    private String speciality;

    /**
     * Define una coleccion del tipo List indicandole entre <> que solo puede
     * recibir objetos del tipo de la clases anidadas definida, que en este caso es
     * estatica por ello recibira la clase directamente y los datos date y time Se
     * observa como se define y se instancia tal cual un objeto normal porque este
     * array de por si es un objeto en si que almacena mas objetos dentro de el.
     */
    private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    /**
     * Metodo constructor del doctor
     * 
     * @param name  Nombre de Doctor
     * @param email Email del Doctor
     */
    public Doctor(String name, String email) {
        super(name, email);
        System.out.println("Construyendo el objeto Doctor.");
    }

    // Comportamientos

    /**
     * Metodo Heredado de clase abstracta que muestra datos del Doctor
     * detalladamente.
     */
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz roja");
        System.out.println("Departamento: Pediatria");
    }

    /**
     * Metodo para obtener la especialidad del doctor.
     * 
     * @param speciality Nombre del doctor.
     * @return Retorna la especilidad del doctor.
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Metodo para definir la especialidad del doctor.
     * 
     * @param speciality Nombre del doctor.
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /**
     * Metodo para agregar nuevas citas al array coleccion creado previamente.
     * Podemos indicar el nombre de la clase indicandole la direccion completa tal
     * como lo hicimos o solo colocando el nombre de la clase anidada ya que esta
     * dentro de la clase externa donde definimos el metodo
     * 
     * @param availableAppointments Coleccion de objetos del tipo
     *                              AvailableAppointments
     */
    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    /**
     * Metodo para obtener las citas añadidas a la coleccion availableAppointments
     * 
     * @return Retorna el valor de la coleccion entera.
     */
    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    /**
     * Metodo para sobreescribir el metodo toString el cual es llamado
     * automaticamente cuando se imprime en consola el objeto en general.
     * 
     * @return Retornara el metodo toString de la clase Padre, añadiendo mas
     *         comportamiento para el caso doctor.
     */
    @Override
    public String toString() {
        return super.toString() + "\nSpeciallity: " + speciality + "\nAvailable: " + availableAppointments;
    }

    /**
     * Clase estatica para manejar la citas de cada usuario. Esta clase no
     * necesariamente requiere ser instanciada.
     */
    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        // Constructor
        public AvailableAppointment(String date, String time) {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        /**
         * Metodo para definir la fecha de la cita.
         * 
         * @param date Fecha de la cita
         */
        public void setDate(Date date) {
            this.date = date;
        }

        /**
         * Metodo para obtener la fecha de la cita en formato Date.
         * 
         * @param date Fecha de la cita
         */
        public Date getDate(String DATE) {
            return this.date;
        }

        /**
         * Metodo para obtener la fecha de la cita en formato string.
         * 
         * @param date Fecha de la cita
         */
        public String getDate() {
            return format.format(date);
        }

        /**
         * Metodo para definir la hora de la cita.
         * 
         * @param time Hora de la cita
         */
        public void setTime(String time) {
            this.time = time;
        }

        /**
         * Metodo para obtener la hora de la cita.
         * 
         * @param time Hora de la cita
         */
        public String getTime() {
            return this.time;
        }

        /**
         * Metodo para definir el Id de la cita.
         * 
         * @param id Id de la cita
         */
        public void setId(int id) {
            this.id = id;
        }

        /**
         * Metodo para obtener Id de la cita.
         * 
         * @param id Id de la cita
         */
        public int getId() {
            return this.id;
        }

        /**
         * Metodo para sobreescribir el metodo toString, solo que este corresponde al
         * comportamiento que tendria el metodo dentro de la clase interna.
         * 
         * @return Retornara el metodo toString de la clase externa añadiendo mas
         *         comportamientos.
         */
        @Override
        public String toString() {
            return "Available Appointments \nDate: " + date + "\nTime" + time;
        }
    }
}