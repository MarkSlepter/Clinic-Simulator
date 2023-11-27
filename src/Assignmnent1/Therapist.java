package Assignmnent1;

public class Therapist extends Doctor{

    @Override
    public void cure() {
        System.out.println("The therapist treats the patient");
    }
    public void assignDoctorToPatient(Patient patient) {
        if (patient.getCurePlan() == 1) {
            patient.setDoctor(new Surgeon());
        } else if (patient.getCurePlan() == 2) {
            patient.setDoctor(new Dentist());
        } else {
            patient.setDoctor(this);
        }
    }
}
