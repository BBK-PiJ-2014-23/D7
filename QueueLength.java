public class QueueLength {
    public static void main(String[] args) {
        Patient p1 = new Patient("Gabriel", 39, "Ebola");
        Patient patientList = p1;
        Patient p2 = new Patient("Vincent", 48, "Fever");
        patientList.addPatient(p2);
        Patient p3 = new Patient("Dieter", 34, "Malaria");
        patientList.addPatient(p3);
        Patient p4 = new Patient("Oskar", 56, "Cold");
        patientList.addPatient(p4);
        Patient p5 = new Patient("Simon", 23, "OCD");
        patientList.addPatient(p5);
        Patient p6 = new Patient("Dennis", 37, "Fever");
        patientList.addPatient(p6);
        Patient p7 = new Patient("Martin", 32, "Ebola");
        patientList.addPatient(p7);
        Patient p8 = new Patient("Stefan", 34, "Steam Collection");
        patientList.addPatient(p8);
        Patient p9 = new Patient("Sebastien", 78, "Cold");
        patientList.addPatient(p9);
        Patient p10 = new Patient("Andreas", 12, "OCD");
        patientList.addPatient(p10);

        patientList.printPatients();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        //System.out.println(patientList.patientsLengthIteratively());
        System.out.println();

        patientList.deletePatient(p5);
        patientList.deletePatient(p10);

        patientList.printPatients();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        //System.out.println(patientList.patientsLengthIteratively());
        System.out.println();

        patientList = p2;

        patientList.printPatients();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        //System.out.println(patientList.patientsLengthIteratively());
        System.out.println();
    }
}