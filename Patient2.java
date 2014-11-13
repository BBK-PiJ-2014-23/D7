public class Patient2 {
    private String name;
    private int age;
    private String illness;
    private Patient2 nextPatient;
    private boolean isLast;
    private boolean isFirst;

    public Patient2(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = this;
        this.isLast = true;
        this.isFirst = true;

    }

    public void addPatient(Patient2 newPatient) {
        if (this.isLast) {
            Patient2 first = nextPatient;
            nextPatient = newPatient;
            nextPatient.isFirst = false;
            nextPatient.nextPatient = first;
            this.isLast = false;
        } else {
            nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient2 patient) {
        if (nextPatient.isFirst) {
            return false;
        } else if (nextPatient.name.equals(patient.name)) {
            if (nextPatient.isLast) {
                this.isLast = true;
            }
            nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return nextPatient.deletePatient(patient);
        }
    }

    public void printPatients() {
        System.out.println("Patient: " + name + ", age: " + age + ", illness: " + illness);
        if (!isLast) {
            nextPatient.printPatients();
        }
    }

    public int patientsLengthRecursively() {
        if (this.isLast) {
            return 1;
        } else {
            return 1 + nextPatient.patientsLengthRecursively();
        }
    }
}