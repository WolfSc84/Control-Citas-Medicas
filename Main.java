import java.util.Date;
import static src.ui.UIMenu.*;
import src.model.*;
import java.text.SimpleDateFormat;

public class Main {
    /**
     * Metodo main principal del programa. Accede desde aqui a las demas clases para
     * crear los objetos necesarios y poder ejecutar las funciones requeridas.
     */
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Alejandro Pelamelo", "pelamelotodo@gmail.com");
        myDoctor.setSpeciality("Pelamelonista");
        myDoctor.showName();
        System.out.println(myDoctor);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        myDoctor.addAvailableAppointment(format.format(new Date()), "16:00 horas");
        myDoctor.addAvailableAppointment(format.format(new Date()), "13:00 horas");
        myDoctor.addAvailableAppointment(format.format(new Date()), "10:00 horas");

        // Tipo de polimorfismo que adquiere la forma del objeto final que lo instancia
        // que para este caso es doctor.
        // Se crea con el objeto user pero se termina de instanciar con el doctor.
        User user = new Doctor("Miguelangel Landa", "culitoafloreado@hotmail.com");
        user.showDataUser();
        /**
         * Ciclo foreach para recorrer la coleccion de objetos que contiene las fechas y
         * horas. Se crea un elemento con el mismo tipo de dato de los objetos de la
         * coleccion y se extrae la informacion de la coleccion con el metodo get que se
         * definio en la clase externa.
         * 
         * @param aA Clase sin instanciar por ser estatica que almacenara la informacion
         *           temporalmente mientras se ejecuta el foreach.
         */
        for (Doctor.AvailableAppointment aA : myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        System.out.println(myDoctor.getAvailableAppointments());

        Doctor myDoctorAnn = new Doctor("Maria Loraja", "calientita4@gmail.com");
        myDoctorAnn.setSpeciality("Pollanutista");
        myDoctorAnn.showName();

        Patient patient = new Patient("Alejandra Chupapolla", "alejandrita@gmail.com");
        System.out.println("Paciente: " + patient.getName());
        System.out.println("Correo electrónico: " + patient.getEmail());
        System.out.println(patient);

        /**
         * Estamos implementando una clase como anonima, para este caso es abstracta.
         * Definimos en este mismo lugar el metodo abstracto y los metodos que
         * requerimos ejecutar. Por supuesto partimos de la clase abstracta User que
         * tiene un metodo abstracto (el cual es obligatorio implementar). La duracion
         * de este objeto del tipo clase anonimo, solo sera vigente durante el lapso de
         * tiempo que se ejecuta el objeto User creado.
         */
        User user1 = new User("Motombo", "guebote@hotmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("Hospital: Matadero");
                System.out.println("Departamento: Geriatria");
            }
        };
        user1.showDataUser();

        /**
         * Implementacion de un objeto anonimo por medio de una interface. Se implementa
         * el metodo schedule de la interfaz al ser obligatorio implementar todos los
         * metodos existentes en las interfaces. Partimos de la interface UIScheduable.
         * La duracion de este objeto sera vigente el lapso de tiempo que se utilice y
         * ejecute los metodos del objeto creado.
         */
        UIScheduable uiScheduable = new UIScheduable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

        /**
         * Un ejemplo de polimorfismo, en donde creamos un objeto con el uso de la
         * interfaz UIScheaduble y se implementa con el la clase AppointmentDoctor. Al
         * utilizar el objeto, llamamos el metodo schedule de la interfaz que se
         * implementa en la clase AppointmentDoctor.
         */
        UIScheduable uiScheduable2 = new AppointmentDoctor();
        Date date = new Date();
        uiScheduable2.schedule(date, "4:00 horas");

        showMenu();
    }
}