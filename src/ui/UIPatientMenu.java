package src.ui;

import src.model.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment.");
            System.out.println("2. My appointment.");
            System.out.println("0. Logout");
        } while (response != 0);

        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());

        switch (response) {
            case 1:
                break;
            case 2:
                break;
            case 0:
                UIMenu.showMenu();
                break;
            default:
                System.out.println("Please select a correct answer");
        }
    }

    private static void showBookAppointmentMenu() {
        int response = 0;

        do {
            System.out.println("::Book an appointment");
            System.out.println("::Select a date:");
            /**
             * Numeracion de la lista de fechas. Indice de la fecha seleccionada. [doctors]
             * 1. doctor1 1 fecha1 2 fecha2 2. doctor2 1 fecha1 2 fecha2 3 fecha3 3. doctor3
             *
             * Asi sucesivamente...
             */
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments = UIDoctorMenu.doctorsAvailableAppointments
                        .get(i).getAvailableAppointments();
                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }

            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelect = Integer.valueOf(sc.nextLine());

        } while (response != 0);

    }
}