import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Installation {
    private static final String GAMES = "C:/Users/HP/Documents/Netology/JavaDeveloper/Games";
    static File tempFile;

    public static void main(String[] args) {
        Add add = new Add();
        Logs logs = new Logs();

        List<File> dirs = new ArrayList<>();
        List<File> files = new ArrayList<>();

        dirs.add(new File(GAMES + "/src"));
        dirs.add(new File(GAMES + "/src/main"));
        dirs.add(new File(GAMES + "/src/test"));
        dirs.add(new File(GAMES + "/res"));
        dirs.add(new File(GAMES + "/res/drawables"));
        dirs.add(new File(GAMES + "/res/vectors"));
        dirs.add(new File(GAMES + "/res/icons"));
        dirs.add(new File(GAMES + "/savegames"));
        dirs.add(new File(GAMES + "/temp"));

        files.add(new File(GAMES + "/src/main", "Main.java"));
        files.add(new File(GAMES + "/src/main", "Utils.java"));
        tempFile = new File(GAMES + "/temp", "temp.txt");
        files.add(tempFile);

        add.addDirs(dirs);
        add.addFiles(files);
        logs.writeLog(tempFile);
    }
}
