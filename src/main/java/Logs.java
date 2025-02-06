import com.sun.tools.javac.Main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logs {

    public void writeLog(File tempFile) {
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.append(String.valueOf(Add.builder));
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
