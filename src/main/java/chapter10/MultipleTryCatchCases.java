package chapter10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MultipleTryCatchCases {

    public static void main(String[] a) {
        FileReader reader = null;
        try {
            reader = read();
        } catch (IOException e){
            try {
                if (reader != null) reader.close();
            } catch (IOException inner) {

            }
        }
    }

    private static FileReader read() throws IOException {
        // some code goes here
        return new FileReader("some.txt");
    }
}
/*
    If `read()` method doesn't throw anything -> nothing interesting
    If some, not IOException will be called -> also everything will be skipped
    If throws IOException -> catch block will be run. Nested `try()` will be run
        and if OK -> close. Not -> process as above
 */
