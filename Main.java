
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        
        Doctor myDoctor = new Doctor("Alejandro Pelamelo");
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);
        
        Doctor myDoctorAnn = new Doctor("Maria Loraja");
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(Doctor.id);

        Doctor.id++;
        showMenu();

    }    
}