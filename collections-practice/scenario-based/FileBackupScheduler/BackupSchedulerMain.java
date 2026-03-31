package BridgeLabz_Day33_ScenarioBased.FileBackupScheduler;

public class BackupSchedulerMain {
    public static void main(String[] args) {
        BackupScheduler sch = new BackupScheduler();
        try {
            sch.addTask(new BackupTask("C:/System", 1));
            sch.addTask(new BackupTask("D:/Projects", 2));
            sch.addTask(new BackupTask("", 3)); // invalid path
        }
        catch (InvalidBackupPathException e) {
            System.out.println(e.getMessage());
        }
        sch.executeBackups();
    }
}
