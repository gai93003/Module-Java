package exercise3_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        FileReaderService service = new FileReaderService();

        try {
            Path normalFile = Files.createTempFile("Just a normal testing text", ".txt");
            Files.writeString(normalFile, "Hello, java enthusiasts.....");

            Path emptyFile = Files.createTempFile("Test data from the empty file", ".txt");

            System.out.println("Reading normal file...");
            String content = service.readFile(normalFile.toString());
            System.out.println("Content: " + content);

            System.out.println("\nReading empty file...");
            service.readFile(emptyFile.toString());

        } catch (InvalidFileFormatException e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Caught I/O Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Caught Argument Error: " + e.getMessage());
        }
    }
}