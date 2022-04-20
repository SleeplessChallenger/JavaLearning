package chapter10;

import java.io.*;

public class FinallyClosingResources {

    public void readFile(String file) {
        FileInputStream is = null;
        try {
            is = new FileInputStream("myFile.txt");
            // Read data
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    public void readAnotherFile(String file) throws IOException, ClassCastException {
        try (FileInputStream is = new
                FileInputStream("myFile.txt")) {
            // read data
        } catch (IOException | ClassCastException e) {
//            e.printStackTrace();
            throw e;
        }
    }

    // TODO: if we specify `throws`, can we omit `catch` or what? + another error not defined
    public void readManyResources(String file) throws IOException {
        try (FileInputStream is = new FileInputStream("myFile.txt");
             FileOutputStream out = new FileOutputStream("myOutput.txt");) {
        }
    }

    public static void anotherMethodForMultipleResources(String file) throws IOException {
        try (FileInputStream is = new FileInputStream("myFile.txt")) {
            // read data
        }
    }
}
