package Assignmnent1;

public class Patient {
    private int curePlan;
    private Doctor doctor;

    public Patient(int curePlan) {
        this.curePlan = curePlan;
        this.doctor = null;
    }

    public void assignDoctor() {
        if (curePlan == 1) {
            doctor = new Surgeon();
        } else if (curePlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
    }

    public void receiveCurePlan() {
        if (doctor != null) {
            doctor.cure();
        } else {
            System.out.println("There's no doctor assigned");
        }
    }

    public int getCurePlan() {
        return curePlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
