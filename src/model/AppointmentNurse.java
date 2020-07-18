package src.model;

import src.model.UIScheduable;
import java.util.Date;

public class AppointmentNurse implements UIScheduable {
    private int id;
    private Patient patient;
    private Doctor nurse;
    private Date date;
    private String time;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getNurse() {
        return this.nurse;
    }

    public void setNurse(Doctor nurse) {
        this.nurse = nurse;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void schedule(Date date, String time) {

    }

}