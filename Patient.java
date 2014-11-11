public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(Patient newPatient) {
        if (nextPatient == null) {
            nextPatient = newPatient;
        } else {
            nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient) {
        if (nextPatient == null) {
            return false;
        } else if (nextPatient.name.equals(patient.name)) {
            nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return nextPatient.deletePatient(patient);
        }
    }

    public void printPatients() {
        System.out.println("Patient: " + name + ", age: " + age + ", illness: " + illness);
        if (nextPatient != null) {
            nextPatient.printPatients();
        }
    }

    public int patientsLengthIteratively() {
        int patientsCounter = 1;
        while (nextPatient != null) {
            patientsCounter++;
            nextPatient = nextPatient.nextPatient;
        }
        return patientsCounter;
    }

    public int patientsLengthRecursively() {
        if (nextPatient == null) {
            return 1;
        } else {
            return 1 + nextPatient.patientsLengthRecursively();
        }
    }
}