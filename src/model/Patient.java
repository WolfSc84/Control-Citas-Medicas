package src.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Clase para manejar el objeto paciente. Permite registrar los pacientes que se
 * añaden al sistema, registrar y manejar su informacion.
 */
public class Patient extends User {
    // Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return this.appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return this.appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    /**
     * Metodo constructor del paciente
     * 
     * @param name  Nombre de paciente
     * @param email Email del paciente
     */
    public Patient(String name, String email) {
        super(name, email);
        System.out.println("Construyendo el objeto Paciente.");
    }

    // Comportamientos

    /**
     * Metodo Heredado de clase abstracta que muestra datos del paciente
     * detalladamente.
     */
    @Override
    public void showDataUser() {
        System.out.println("Paciente.");
        System.out.println("Historial completo desde el nacimiento.");
    }

    /**
     * Metodo para definir el peso del paciente.
     * 
     * @param weight Valor del peso del paciente
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Metodo para obtener el peso del paciente.
     * 
     * @param weight Valor del peso del paciente
     * @return Retorna el valor del peso del paciente
     */
    public String getWeight() {
        return this.weight + " Kg.";
    }

    /**
     * Metodo para obtener la altura del paciente.
     * 
     * @param height Valor de la altura del paciente.
     * @return Retorna la altura del paciente.
     */
    public String getHeight() {
        return height + " Mts.";
    }

    /**
     * Metodo para definir la altura del paciente.
     * 
     * @param height Valor de la altura del paciente.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Metodo para definir la fecha de nacimiento del paciente
     * 
     * @param birthday Fecha de nacimiento del paciente.
     * @return Retorna la fecha de nacimiento del paciente.
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * Metodo para obtener la fecha de nacimiento del paciente
     * 
     * @param birthday Fecha de nacimiento del paciente.
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * Metodo para obtener el tipo de sangre del paciente
     * 
     * @param blood Tipo de sangre del paciente.
     * @return Retorna el tipo de sangre del paciente.
     */
    public String getBlood() {
        return blood;
    }

    /**
     * Metodo para definir el tipo de sangre del paciente
     * 
     * @param blood Tipo de sangre del paciente.
     */
    public void setBlood(String blood) {
        this.blood = blood;
    }

    /**
     * Metodo para sobreescribir el metodo toString el cual es llamado
     * automaticamente cuando se imprime en consola el objeto en general.
     * 
     * @return Retornara el metodo toString de la clase Padre, añadiendo mas
     *         comportamiento para el caso paciente.
     */
    @Override
    public String toString() {
        return super.toString() + " Objeto tipo paciente";
    }
}