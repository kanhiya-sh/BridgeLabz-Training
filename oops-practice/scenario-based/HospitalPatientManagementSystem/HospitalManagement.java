package BridgeLabz_Day22_ScenarioBased_OOPS.HospitalPatientManagementSystem;
import java.util.*;

// Abstraction
interface IPayable {
    double calculateBill();
}

// Parent Class
abstract class Patient implements IPayable {
    private int id;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public abstract void displayInfo();
}

class Doctor {
    String name;
    String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

// Inheritance
class InPatient extends Patient {
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(int id, String name, int age, double dailyRate, int daysAdmitted) {
        super(id, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }
    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Name: " + getName() + " (InPatient) | Bill: " + calculateBill());
    }
}

// Inheritance
class OutPatient extends Patient {
    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }
    @Override
    public double calculateBill() {
        return consultationFee + 100;
    }
    @Override
    public void displayInfo() {
        System.out.println("ID: " + getId() + " | Name: " + getName() + " (OutPatient) | Bill: " + calculateBill());
    }
}