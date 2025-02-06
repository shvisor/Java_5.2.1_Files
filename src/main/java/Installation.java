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

        File src = new File(GAMES + "/src");
        File main = new File(GAMES + "/src/main");
        File test = new File(GAMES + "/src/test");
        File res = new File(GAMES + "/res");
        File drawables = new File(GAMES + "/res/drawables");
        File vectors = new File(GAMES + "/res/vectors");
        File ions = new File(GAMES + "/res/icons");
        File savegames = new File(GAMES + "/savegames");
        File temp = new File(GAMES + "/temp");

        File mainFile = new File(main, "Main.java");
        File utilsFile = new File(main, "Utils.java");
        tempFile = new File(temp, "temp.txt");

        dirs.add(src);
        dirs.add(main);
        dirs.add(test);
        dirs.add(res);
        dirs.add(drawables);
        dirs.add(vectors);
        dirs.add(ions);
        dirs.add(savegames);
        dirs.add(temp);

        files.add(mainFile);
        files.add(utilsFile);
        files.add(tempFile);

        add.addDirs(dirs);
        add.addFiles(files);
        logs.writeLog(tempFile);
    }
}
