package exam;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

public class FileSearch implements FileVisitor<Path> {
    private final Path mydir;

    public FileSearch(Path starting_dir) {
        mydir = starting_dir;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Entering: " + dir);
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File found: " + file.toString());
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        System.out.println("Failed to access file: " + file.toString());
        return CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("Exiting: " + dir);
        return CONTINUE;
    }

    public static void main(String[] args) throws IOException {
        Path starting_dir = Paths.get("D:/java-Tsvetkova-3sem/src/example");
        FileSearch fc = new FileSearch(starting_dir);
        Files.walkFileTree(starting_dir, fc);
    }

}
