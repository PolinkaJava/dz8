public class Terapevt extends Doctor {
    @Override
    public void lechenie() {
        System.out.println("Я хороший терапевт ,могу дать больничный");

    }
    public void setDoctor (Patient patient){
        switch (patient.getRecoveryPlan()) {
            case 1 -> patient.setDoctor(new Xiryrg());
            case 2 -> patient.setDoctor(new Dentist());
            case 3 -> patient.setDoctor(new Terapevt());
            default -> patient.setDoctor(this);
    }
        patient.getDoctor().lechenie();
}}
