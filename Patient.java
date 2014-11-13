public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient previousPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
        this.previousPatient = null;
    }

    public void addPatient(Patient newPatient) {
        if (nextPatient == null) {
            nextPatient = newPatient;
            nextPatient.previousPatient = this;
        } else {
            nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient) {
        if (nextPatient == null) {
            return false;
        } else if (nextPatient.name.equals(patient.name) && nextPatient.nextPatient != null) {
            nextPatient = nextPatient.nextPatient;
            nextPatient.previousPatient = this;
            return true;
        } else if (nextPatient.name.equals(patient.name) && nextPatient.nextPatient == null) {
            nextPatient = null;
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

    public void printPatientsBackwards() {
        if (nextPatient == null) {
            System.out.println("Patient: " + name + ", age: " + age + ", illness: " + illness);
        } else {
            nextPatient.printPatientsBackwards();
            System.out.println("Patient: " + name + ", age: " + age + ", illness: " + illness);
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