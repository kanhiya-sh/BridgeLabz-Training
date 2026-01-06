package BridgeLabz_Day17_4Pillars;

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;   // sensitive data (encapsulated)
    Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    // encapsulation of sensitive data
    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
    protected String getMedicalHistory() {
        return medicalHistory;
    }
    abstract double calculateBill();

    void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class InPatient extends Patient implements MedicalRecord {
    InPatient(String id, String name, int age) {
        super(id, name, age);
    }
    double calculateBill() {
        return 5000;
    }
    public void addRecord(String record) {
        setMedicalHistory(record);
    }
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

class OutPatient extends Patient implements MedicalRecord {
    OutPatient(String id, String name, int age) {
        super(id, name, age);
    }
    double calculateBill() {
        return 1500;
    }
    public void addRecord(String record) {
        setMedicalHistory(record);
    }
    public void viewRecords() {
        System.out.println("Medical History: " + getMedicalHistory());
    }
}

public class HospitalPatientManagement {
    public static void main(String[] args) {
        Patient p1 = new InPatient("P101", "Mohan", 95);
        Patient p2 = new OutPatient("P102", "Rohan", 96);
        Patient[] patients = { p1, p2 };
        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());
            System.out.println("----------------------");
        }
    }
}
