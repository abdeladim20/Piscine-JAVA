import java.io.File;

public class FileSearch {
    public static String searchFile(String fileName) {
        File startDirectory = new File("documents");

        return findFileRecursive(startDirectory, fileName);
    }

    private static String findFileRecursive(File directory, String fileName) {
        File[] items = directory.listFiles();

        if (items == null) {
            return null;
        }

        for (File item : items) {
            if (item.isDirectory()) {
                String foundPath = findFileRecursive(item, fileName);
                if (foundPath != null) {
                    return foundPath;
                }
            } else {
                if (item.getName().equals(fileName)) {
                    return item.getPath();
                }
            }
        }
        return null;
    }
}
