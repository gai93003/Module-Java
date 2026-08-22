package exercise3_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InvalidFileFormatException extends Exception {
    public InvalidFileFormatException(String message) {
        super(message);
    }
}

class FileReaderService {
    public String readFile(String filename) throws InvalidFileFormatException, IOException {
        if (filename == null || filename.trim().isEmpty()) {
            throw new IllegalArgumentException("Filename cannot be null or empty.");
        }

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filename));
            StringBuilder content = new StringBuilder();
            String line;
            boolean isEmpty = true;

            while ((line = reader.readLine()) != null) {
                isEmpty = false;
                content.append(line).append(System.lineSeparator());
            }

            if (isEmpty) {
                throw new InvalidFileFormatException("The file " + filename + " is empty.");
            }

            return content.toString().trim();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the reader: " + e.getMessage());
                }
            }
        }
    }
}