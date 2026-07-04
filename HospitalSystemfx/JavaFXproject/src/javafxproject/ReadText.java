package javafxproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadText {

    private Scanner input;

    public void openTextFile(String fileName) {
        try {
            input = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.err.println("Error opening or creating file.");
            System.err.println(e);
        }
    }

    public void readFromFile() {
        try {

            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (NoSuchElementException e) {
            System.err.println("File improperly formed.");
            System.err.println(e);
            input.close();
            System.exit(1);
        } catch (IllegalStateException e) {
            System.err.println("Error reading from file.");
            System.err.println(e);
            System.exit(1);
        }

    }

    public void closeFile() {
        if (input != null) {
            input.close();
        }
    }
}
