public class Patient {
    private int recoveryPlan;
    private Doctor doctor;

    public Patient(int recoveryPlan) {
        this.recoveryPlan = recoveryPlan;
    }

    public int getRecoveryPlan() {
        return recoveryPlan;
    }

    public void setRecoveryPlan(int recoveryPlan) {
        this.recoveryPlan = recoveryPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}