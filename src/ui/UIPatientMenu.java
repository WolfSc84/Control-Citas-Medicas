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
            System.out.println("Welcome: " + UIMenu.patientLogged.getName());
            System.out.println("1. Book an appointment.");
            System.out.println("2. My appointment.");
            System.out.println("0. Logout");
        } while (response != 0);

        Scanner sc = new Scanner(System.in);
        response = Integer.valueOf(sc.nextLine());

        switch (response) {
            case 1:
                showBookAppointmentMenu();
                break;
            case 2:
                showPatientMyAppointment();
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
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc : doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName() + ". Date: "
                    + doctorSelected.getAvailableAppointments().get(indexDate).getDate() + ". Time: "
                    + doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data.");

            response = Integer.valueOf(sc.nextLine());

            if (response == 1) {
                UIMenu.patientLogged.addAppointmentDoctors(doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                showPatientMenu();
            }

        } while (response != 0);
    }

    private static void showPatientMyAppointment() {
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("::My Appointments");
            if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0) {
                System.out.println("Dont have appointments");
                break;
            }

            for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
                int j = i + 1;
                System.out.println(j + ". " + "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate()
                        + " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() + "\n Doctor: "
                        + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor());

            }
            System.out.println("0. Return - Logout");
        } while (response != 0);

    }
}