package Assignmnent1;

public class ClinicSimulation {

    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        patient1.assignDoctor();
        patient1.receiveCurePlan();

        Patient patient2 = new Patient(2);
        patient2.assignDoctor();
        patient2.receiveCurePlan();

        Patient patient3 = new Patient(3);
        patient3.assignDoctor();
        patient3.receiveCurePlan();
    }

}
