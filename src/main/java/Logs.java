import java.io.*;

public class Logs {

    public void writeLog(File tempFile) {
        try (FileWriter writer = new FileWriter(tempFile)) {
            writer.write(Add.builder.toString());
            writer.flush();
        } catch (IOException e) {
            Add.builder.append(e.getMessage()).append('\n');
        }
    }
}
