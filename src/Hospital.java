public class Hospital {
    private Patient[] patients;

    public Hospital(int capacity) {
        patients = new Patient[capacity];
    }
    public void addPatient(String name, int age, Department department, int index) {
        patients[index] = new Patient(name, age, department);
    }
    public void displayPatients() {
        System.out.println("\nPatient Information:");
        for (Patient patient : patients) {
            if (patient != null) {
                patient.displayPatientInfo();
                System.out.println("----------------------");
            }
        }
    }
}
