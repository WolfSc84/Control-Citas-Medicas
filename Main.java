import java.util.Date;
import static ui.UIMenu.*;

public class Main {
    /**
     * Metodo main principal del programa.
     * Accede desde aqui a las demas clases para crear los objetos necesarios y poder ejecutar las funciones requeridas.
     */
    public static void main(String[] args) {
        
        Doctor myDoctor = new Doctor();
        myDoctor.setName("Alejandro Pelamelo");
        myDoctor.setSpeciality("Pelamelonista");
        myDoctor.showId();
        System.out.println(Doctor.id);
        myDoctor.showName();
        
        myDoctor.addAvailableAppointment(new Date(), "16:00 horas");
        myDoctor.addAvailableAppointment(new Date(), "13:00 horas");
        myDoctor.addAvailableAppointment(new Date(), "10:00 horas");
        
        /**
         * Ciclo foreach para recorrer la coleccion de objetos que contiene las fechas y horas.
         * Se crea un elemento con el mismo tipo de dato de los objetos de la coleccion y se extrae la informacion de la coleccion con el metodo get que se definio en la clase externa.
         * @param aA Clase sin instanciar por ser estatica que almacenara la informacion temporalmente mientras se ejecuta el foreach.
         */
        for (Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        System.out.println(myDoctor.getAvailableAppointments());
        
        Doctor myDoctorAnn = new Doctor( );
        myDoctorAnn.setName("Maria Loraja");
        myDoctorAnn.setSpeciality("Pollanutista");
        System.out.println(Doctor.id);
        myDoctorAnn.showName();

        Patient patient = new Patient("Alejandra Chupapolla", "alejandrita@gmail.com");
        System.out.println("Paciente: " + patient.getName());
        System.out.println("Correo electrónico: " + patient.getEmail());

        Doctor.id++;
        showMenu();


    }    
}