package BridgeLabz_Day31_Streams.DataStreamsStudent;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStudentData {

    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("student.txt"))) {
            dos.writeInt(101);
            dos.writeUTF("Kanhiya");
            dos.writeDouble(7.99);
            System.out.println("Student data written successfully.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
