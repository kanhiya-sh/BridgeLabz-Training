package BridgeLabz_Day39_FunctionalInterfaces;

interface Backupable {
}
class UserData implements Backupable {
}

public class DataSerializationForBackup {
    public static void main(String[] args) {
        UserData user = new UserData();
        System.out.println(user instanceof Backupable);
    }
}
