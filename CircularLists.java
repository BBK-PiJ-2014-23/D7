public class CircularLists {
    public static void main(String[] args) {
        Patient2 p1 = new Patient2("Gabriel", 39, "Ebola");
        Patient2 patientList = p1;
        Patient2 p2 = new Patient2("Vincent", 48, "Fever");
        patientList.addPatient(p2);
        Patient2 p3 = new Patient2("Dieter", 34, "Malaria");
        patientList.addPatient(p3);
        Patient2 p4 = new Patient2("Oskar", 56, "Cold");
        patientList.addPatient(p4);
        Patient2 p5 = new Patient2("Simon", 23, "OCD");
        patientList.addPatient(p5);
        Patient2 p6 = new Patient2("Dennis", 37, "Fever");
        patientList.addPatient(p6);
        Patient2 p7 = new Patient2("Martin", 32, "Ebola");
        patientList.addPatient(p7);
        Patient2 p8 = new Patient2("Stefan", 34, "Steam Collection");
        patientList.addPatient(p8);
        Patient2 p9 = new Patient2("Sebastien", 78, "Cold");
        patientList.addPatient(p9);
        Patient2 p10 = new Patient2("Andreas", 12, "OCD");
        patientList.addPatient(p10);

        patientList.printPatients();
        System.out.println();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        System.out.println();

        patientList.deletePatient(p5);
        patientList.deletePatient(p10);

        patientList.printPatients();
        System.out.println();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        System.out.println();

        patientList = p2;

        patientList.printPatients();
        System.out.println();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        System.out.println();
        
        Patient2 p99 = new Patient2("Tom", 39, "Lack of Hunmour");
        patientList.addPatient(p99);
        
        patientList.printPatients();
        System.out.println();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        System.out.println();
        
        Patient2 p66 = new Patient2("Test", 32, "None");
        patientList.deletePatient(p66);
        
         patientList.printPatients();
        System.out.println();
        System.out.println();
        System.out.println(patientList.patientsLengthRecursively());
        System.out.println();
    }
}