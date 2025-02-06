import java.io.File;
import java.io.IOException;
import java.util.List;

public class Add {
    public static StringBuilder builder = new StringBuilder();

    public void addDirs(List<File> dirs) {
        for (File dir : dirs) {
            if (dir.mkdir()) {
                builder.append("Создана папка ").append(dir).append('\n');
            }
        }
    }

    public void addFiles(List<File> files) {
        for (File file : files) {
            try {
                if (file.createNewFile()) {
                    builder.append("Создан файл ").append(file).append('\n');
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
