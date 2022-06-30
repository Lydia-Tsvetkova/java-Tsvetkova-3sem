package exam;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.String.valueOf;
import static java.nio.file.FileVisitResult.CONTINUE;

public class FilesCollector implements FileVisitor<Path> {
    private final Path mydir;
    public static List allFiles = new ArrayList();
    public static List allFilesExtensions = new ArrayList();

    public FilesCollector(Path starting_dir) {
        mydir = starting_dir;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        allFiles.add(file.getFileName());
        String filename = String.valueOf(file.getFileName());
        String extension = filename.substring(filename.lastIndexOf('.', 0), filename.length());
        if(allFilesExtensions.contains(extension)) {
            return CONTINUE;
        }
        allFilesExtensions.add(extension);
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        allFiles.add(file.getFileName());
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path starting_dir = Paths.get("D:/java-Tsvetkova-3sem/src/example");
        FilesCollector fc = new FilesCollector(starting_dir);
        Files.walkFileTree(starting_dir, fc);
        System.out.println(allFiles);
        System.out.println(allFilesExtensions);

        HashMap<String, List> freq = new HashMap<>();

        for (int i = 0; i < allFilesExtensions.size(); i++) {
            List selectedFiles = new ArrayList();
            for (int j = 0; j < allFiles.size(); j++) {
                if (String.valueOf(allFiles.get(j)).contains(String.valueOf(allFilesExtensions.get(i)))) {
                    selectedFiles.add(String.valueOf(allFiles.get(j)));
                }
            }
            freq.put(String.valueOf(allFilesExtensions.get(i)), selectedFiles);
        }
        System.out.println(Arrays.asList(freq));

        for ( String key : freq.keySet() ) {
            System.out.println("Files with extension " + key + " were found: " + freq.get(key).size());
        }
    }
}
