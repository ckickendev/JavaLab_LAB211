package JavaLabCucManh.Day6.Path;

import java.io.File;

public class Path {
    Validation val = new Validation();

    public void pathInOut() {
        System.out.println("===== Analysis Path Program =====");
        System.out.print("Please input Path: ");
        String path = val.checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("----- Result Analysis -----");
            System.out.println("Disk: " + getDisk(path));
            System.out.println("Extension: " + getExtension(path));
            System.out.println("File name: " + getFileName(path));
            System.out.println("Path: " + getPath(path));
            System.out.println("Folders: [" + getFolders(path) +"]");
        } else {
            System.err.println("Path isn't file.");
        }
    }

    public String getPath(String path) {
        int from = path.indexOf("\\");
        int to = path.lastIndexOf("\\");
        return path.substring(from + 1, to);
    }

    public String getFileName(String path) {
        int from = path.lastIndexOf("\\");
        int to = path.lastIndexOf(".");
        return path.substring(from + 1, to);
    }

    public String getExtension(String path) {
        int dot = path.lastIndexOf(".");
        return path.substring(dot, path.length());
    }

    public String getDisk(String path) {
        int colon = path.indexOf("\\");
        return path.substring(0, colon + 1);
    }

    public String getFolders(String path) {
        int colon = path.indexOf("\\");
        int dot = path.lastIndexOf("\\");
        path = path.substring(colon, dot);
        String[] split = path.split("\\");
        return split[split.length - 1];
    }
}
