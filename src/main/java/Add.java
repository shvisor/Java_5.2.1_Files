import java.io.File;
import java.io.IOException;
import java.util.List;

public class Add {
    public static StringBuilder builder = new StringBuilder();

    public void addDirs(List<File> dirs) {
        dirs.stream().forEach(dir -> {
            if (dir.mkdir()) {
                builder.append("Создана папка ").append(dir).append('\n');
            } else {
                builder.append("Папка ").append(dir).append(" была создана ранее").append('\n');
            }
        });
    }

    public void addFiles(List<File> files) {
        files.stream().forEach(file -> {
            try {
                if (file.createNewFile()) {
                    builder.append("Создан файл ").append(file).append('\n');
                } else {
                    builder.append("Файл ").append(file).append(" был создан ранее").append('\n');
                }
            } catch (IOException e) {
                builder.append(e.getMessage()).append('\n');
            }
        });
    }
}
