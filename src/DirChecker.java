import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class DirChecker {
    public static void NewDir() throws IOException {

        Scanner sc = new Scanner(System.in);
        String path = "/Users/" + new com.sun.security.auth.module.UnixSystem().getUsername() + "/Desktop/";
        String desktopPath = "/Users/" + new com.sun.security.auth.module.UnixSystem().getUsername() + "/Desktop/Screenshots";
        if(Files.exists(Path.of(desktopPath.toString()))){
            System.out.println("Your Screenshots have been placed to the directory: Screenshots");
            Filereader.Screenshot();
        }else{
            System.out.println("Enter the name of the desired a directory: ");
            path = path + sc.next();
            //Creating a File object
            File file2 = new File(path);
            //Creating the directory
            boolean bool = file2.mkdirs();
            if (bool) {
                System.out.println("Directory created successfully");
                Filereader.Screenshot();
            } else {
                System.out.println("Sorry couldn't create specified directory");
            }
        }
    }
}

