package src.ui;

import src.model.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase con metodos y argumentos estaticos, como tambien constantes y del tipo
 * Array. Cuenta con las funciones para mostrar el menu en pantalla de los
 * doctores logeados y permite seleccionar las opciones para ingresar a cada una
 * de las funciones del menu.
 * 
 * @param doctorsAvailableAppointments Array del tipo list para almacenar los
 *                                     doctores con citas disponibles. Almacena
 *                                     objetos del tipo Doctor.
 */
public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    /**
     * Metodo estatico para mostrar el menu de los doctores logueados
     * 
     * @param response Variable para manejar las respuestas del usuario.
     */
    public static void showDoctorMenu() {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Available Appointment.");
            System.out.println("2. My Scheduled Appointment.");
            System.out.println("0. Logout.");

            // Captura opcion de teclado seleccionada por el usuario.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Compara la opcion seleccionada para llamar la funcion correspondiente al tipo
            // de opcion seleccionada.
            switch (response) {
                case 1:
                    // LLamado a la funcion encargada de mostrar las fechas para citas dispoibles
                    // del doctor.
                    showAddAvailableAppointmentsMenu();
                    break;
                case 2:
                    break;
                case 0:
                    // Retorno al menu principal
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);

    }

    /**
     * Metodo para visualizar y seleccionar las fechas disponibles para que el
     * doctor programe las citas disponibles
     * 
     * @param response Variable para manejar las respuestas del usuario.
     */
    private static void showAddAvailableAppointmentsMenu() {
        int response = 0;

        do {
            System.out.println();
            System.out.println(":: Add Available Appointment");
            System.out.println("::Select a month: ");

            // Ciclo para recorrer un maximo de tres meses en el año, mostrandolo como
            // opciones seleccionables en el menu
            // Se recorre la constante del tipo arreglo de Strings con los 12 meses del año.
            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + "." + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");

            // Captura opcion de teclado seleccionada por el usuario.
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            // Se valida la opcion para solo seleccionar entre el 1 al 3 de los meses
            // mostrados en el menu.
            if (response > 0 && response < 4) {

                // Variable para almacenar el valor del mes seleccionado adicionalmente.
                int monthSelected = response;

                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected - 1]);
                System.out.println("Insert the date available: [dd/mm/yyyy] ");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Incorrect - Change Date.");
                int responseDate = Integer.valueOf(sc.nextLine());

                // Validar para que se salte a la validacion del ciclo while y se repita
                // nuevamente la seleccion de fecha.
                if (responseDate == 2) {
                    continue;
                }

                int responseTime = 0;
                String time = "";

                // Ciclo para validar la opcion que valide que la hora ingresada, el usuario
                // esta seguro de su eleccion.
                do {
                    System.out.println("Insert the time availble for date: " + date + "[xx:xx]: ");
                    time = sc.nextLine();
                    System.out.println("Ypur time is: " + time + "\n1. Correct \n2. Incorrect - Change Date.");
                    responseTime = Integer.valueOf(sc.nextLine());
                } while (responseTime == 2);

                /**
                 * Agrega al array de citas del doctor especifico logeado, la cita disponible
                 * planificada. Este array es del tipo List con elementos del tipo
                 * AvailableAppointment que corresponden a una clase estatica anidada dentro de
                 * la clase Doctor.
                 */
                UIMenu.doctorLogged.addAvailableAppointment(date, time);
                /**
                 * Metodo para validar que existen citas disponibles para agregarla al areglo de
                 * doctores con citas disponibles.
                 */
                checkDoctorAvailableAppointment(UIMenu.doctorLogged);

            } else if (response == 0) {
                // Regreso al menu principal de los doctores.
                showDoctorMenu();
            }

        } while (response != 0);

    }

    /**
     * Metodo para validar que existen citas disponibles para los doctores
     * registrados.
     * 
     * @param doctor
     */
    private static void checkDoctorAvailableAppointment(Doctor doctor) {
        if (doctor.getAvailableAppointments().size() > 0 && !doctorsAvailableAppointments.contains(doctor)) {
            doctorsAvailableAppointments.add(doctor);
        }

    }
}