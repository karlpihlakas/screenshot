import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Scanner;

public class Filereader {
    public static void Screenshot() throws IOException {
        File file = new File("/Users/" + new com.sun.security.auth.module.UnixSystem().getUsername() + "/Desktop/");

        String[] files = file.list();
            for (String string : files) {
                for (int i = 0; i < files.length; i++) {
                if(files[i].equals("Screenshots")) {
                    if (String.valueOf(string).contains(".png")) {
                        File sourceFile = new File("/Users/" + new com.sun.security.auth.module.UnixSystem().getUsername() + "/Desktop/" + string);
                        File destinationFile = new File("/Users/" + new com.sun.security.auth.module.UnixSystem().getUsername() + "/Desktop/Screenshots/" + string);
                        Files.move(sourceFile.toPath(), destinationFile.toPath());
                        string = "";

                    }
                }
            }
        }
    }
}
