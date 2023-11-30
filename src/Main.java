public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(8);
        Terapevt therapist = new Terapevt();
        therapist.setDoctor(patient1);
        therapist.setDoctor(patient2);

    }
}