class Patient{
    private static int patientCount = 0; // Static variable to keep track of patients
    private String patientName;
    private int patientAge;
    private Department department;
    public Patient(String patientName, int patientAge, Department department) {
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.department = department;
        patientCount++;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    public void displayPatientInfo() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + patientAge);
        System.out.println("Department: " + department);
    }
}