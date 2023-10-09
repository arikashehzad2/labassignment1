public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Hospital Management System!");

        Hospital hospital = new Hospital(4);

        // Pre-defined arrays for patient information
        String[] names = {"Ayesha", "Abdullah", "Urooj", "Arika"};
        int[] ages = {19,20,18,20};
        Department[] departments = {Department.GENERAL, Department.CARDIOLOGY, Department.ORTHOPEDICS,
                Department.PEDIATRICS, Department.GENERAL};

        for (int i = 0; i < 4; i++) {
            hospital.addPatient(names[i], ages[i], departments[i], i);
        }

        hospital.displayPatients();
        System.out.println("Total Patients: " + Patient.getPatientCount());
    }
}