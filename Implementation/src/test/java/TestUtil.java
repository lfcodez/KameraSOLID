import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.stream.Stream;

public  class TestUtil {

    public static char[][] convertToCharArray(String inputFile) {
        char[][] charArray = new char[21][14];

        // Ensure the input file is exactly 21x14 characters
        if (inputFile.length() != 21 * 14) {
            throw new IllegalArgumentException("Input file should have 21x14 characters");
        }

        // Fill the char array
        int index = 0;
        for (int i = 0; i < 21; i++) {
            for (int j = 0; j < 14; j++) {
                charArray[i][j] = inputFile.charAt(index++);
            }
        }

        return charArray;
    }

}
