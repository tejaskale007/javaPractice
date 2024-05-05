package FileOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
Write a Java program to read first Three lines from a file
 */
public class ReadFirstThreeLines {
    public static void main(String[] args) {
        String filePath = "JavaBasicsProblems\\src\\example.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int linesRead = 0;
            while ((line = reader.readLine()) != null && linesRead < 3) {
                System.out.println(line);
                linesRead++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

/*
someLine1
someLine2
someLine3
 */