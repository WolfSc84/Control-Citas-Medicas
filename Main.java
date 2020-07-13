
import static ui.UIMenu.*;

public class Main {
    /**
     * Metodo main principal del programa.
     * Accede desde aqui a las demas clases para crear los objetos necesarios y poder ejecutar las funciones requeridas.
     */
    public static void main(String[] args) {
        
        Doctor myDoctor = new Doctor("Alejandro Pelamelo", "Chorongonatrista");
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);
        
        Doctor myDoctorAnn = new Doctor("Maria Loraja", "Pollanutrista");
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;
        showMenu();

    }    
}