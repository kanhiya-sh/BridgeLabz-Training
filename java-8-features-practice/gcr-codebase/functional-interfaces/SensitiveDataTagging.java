package BridgeLabz_Day39_FunctionalInterfaces;

interface SensitiveData {
}
class PatientRecord implements SensitiveData {
}

public class SensitiveDataTagging {
    public static void main(String[] args) {
        PatientRecord record = new PatientRecord();
        System.out.println(record instanceof SensitiveData);
    }
}
