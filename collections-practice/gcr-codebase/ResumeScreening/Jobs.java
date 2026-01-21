package BridgeLabz_Day29_Generics.ResumeScreening;

abstract class JobRole {
    String role;
    JobRole(String role) {
        this.role = role;
    }
    void show() {
        System.out.println(role);
    }
}
class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}
class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}
class Resume<T extends JobRole> {
    T role;
    Resume(T role) {
        this.role = role;
    }
    void process() {
        role.show();
    }
}