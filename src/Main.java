public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(1);
        Terapevt therapist = new Terapevt();
        therapist.setDoctor(patient1);
        therapist.setDoctor(patient2);
        therapist.setDoctor(patient3);

    }
}