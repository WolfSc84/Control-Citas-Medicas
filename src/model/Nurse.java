package src.model;

public class Nurse extends User {
    private String speciality;

    /**
     * Metodo constructor
     * 
     * @param name  Recibe el nombre del enfermer@
     * @param email Recibe le mail del enfermer@
     */
    public Nurse(String name, String email) {
        super(name, email);
    }

    /**
     * Metodo Heredado de clase abstracta que muestra datos del enfermer@
     * detalladamente.
     */
    @Override
    public void showDataUser() {
        System.out.println("Empleado del Hospital: Cruz Verde");
        System.out.println("Departamentos: Pediatria y Medicina General");
    }

    /**
     * Metodo para obtener la especialidad del enfermer@
     * 
     * @param speciality Especialidad del enfermer@
     * @return Retorna la especialidad
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Metodo para definir la especialidad del enfermer@
     * 
     * @param speciality Especialidad del enfermer@
     */
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}