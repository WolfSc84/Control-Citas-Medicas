package src.ui;

import java.util.ArrayList;
import java.util.Scanner;

import src.model.Doctor;
import src.model.Patient;
import src.ui.UIDoctorMenu;

/**
 * Clase con metodos y argumentos estaticos, como tambien constantes. Cuenta con
 * las funciones para mostrar el menu en pantalla y permite seleccionar las
 * opciones para ingresar a cada una de las funciones del menu.
 */
public class UIMenu {
    // Atributos
    // Constante MONTHS con los meses del año para manejar las fechas de los
    // usuarios.
    public static final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    /**
     * Metodo para mostrar menu en consola con opciones a elegir entre: Doctor,
     * Paciente o Salir de la aplicacion.
     * 
     * @param response Captura el valor seleccionado por el usuario escrito en el
     *                 teclado. Dicho valor debe ser numerico entre 0-2, sino
     *                 arrojara error pidiendo seleccionar un valor correcto.
     */
    public static void showMenu() {

        System.out.println("\n\n");
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            // Captura opcion de teclado seleccionada por el usuario.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Compara la opcion seleccionada para llamar la funcion correspondiente al tipo
            // de usuario seleccionado.
            switch (response) {
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    response = 0;
                    break;
                case 2:
                    authUser(2);
                    response = 0;
                    // showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    /**
     * Metodo para autenticar los tipos de usuarios y el usuario en si.
     * 
     * @param userType Valor del tipo de usuario. Si es 1 es doctor si es dos seria
     *                 paciente.
     */
    private static void authUser(int userType) {
        // userType == 1 Doctor
        // userType == 2 Paciente
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Miguelangel Pallola", "papallola@gmail.com"));
        doctors.add(new Doctor("Caren Soza", "carolita@gmail.com"));
        doctors.add(new Doctor("Rocio Gomez", "rocita@hotmail.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Wolfgang Santamaria", "santamaria.wolfgang@gmail.com"));
        patients.add(new Patient("Michelle Villamizar", "mrsmichellevv@hotmail.com"));
        patients.add(new Patient("Duquesa Santamaria", "duquesashurunga@gmail.com"));

        boolean emailCorrect = false;
        /**
         * Una vez seleccionado el usuario se procede a verificar que este registrado en
         * el sistema autenticando el email. Si el usuario esta registrado, se loguea
         * asignando el objeto a un objeto de mayor Scope en esta clase. Los objetos de
         * ayuda para manejar el logueo son doctorLogged y patientLogged. Inmediatamente
         * se llamara la funcion del menu correspondiente al usuario logueado.
         */
        do {
            System.out.println("Insert your email: [a@a.com]: ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1) {
                for (Doctor d : doctors) {
                    if (d.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener los datos del usuario logueado.
                        doctorLogged = d;
                        // showDoctorMenu de la clase UIDoctorMenu encargada de la interfaz de los
                        // doctores.
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            } else if (userType == 2) {
                for (Patient p : patients) {
                    if (p.getEmail().equals(email)) {
                        emailCorrect = true;
                        // Obtener los datos del usuario logueado.
                        patientLogged = p;
                        // showPatientMenu de la clase UIPatientMenu encargada de la interfaz de los
                        // pacientes.
                    }
                }
            }
        } while (!emailCorrect);
    }

    /**
     * Metodo para mostrar el menu cuando se selecciona la opcion paciente.
     * 
     * @param response Captura el valor seleccionado por el usuario escrito en el
     *                 teclado. Dicho valor debe ser numerico entre 0-2, sino
     *                 arrojara error pidiendo seleccionar un valor correcto.
     */
    static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            // Captura opcion de teclado seleccionada por el usuario.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 0; i < MONTHS.length - 9; i++) {
                        System.out.println(i + ". " + MONTHS[i]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}