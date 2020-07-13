package ui;

import java.util.Scanner;

/**
 * Clase con metodos y argumentos estaticos, como tambien constantes.
 * Cuenta con las funciones para mostrar el menu en pantalla y permite seleccionar las opciones para ingresar a cada una de las funciones del menu.
 */
public class UIMenu {

    //Constante MONTHS
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    /**
     * Metodo para mostrar menu en consola con opciones a elegir entre:
     * Doctor, Paciente o Salir de la aplicacion. 
     * @param response Captura el valor seleccionado por el usuario escrito en el teclado.
     * Dicho valor debe ser numerico entre 0-2, sino arrojara error pidiendo seleccionar un valor correcto.
     */
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    /**
     * Metodo para mostrar el menu cuando se selecciona la opcion paciente.
     @param response Captura el valor seleccionado por el usuario escrito en el teclado.
     * Dicho valor debe ser numerico entre 0-2, sino arrojara error pidiendo seleccionar un valor correcto.
     */
    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
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
        }while (response != 0);
    }
}