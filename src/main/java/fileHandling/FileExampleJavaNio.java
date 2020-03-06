package fileHandling;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileExampleJavaNio {
    public static void main(String[] args) {
        File myfile = new File("C:\\Training\\src\\main\\java\\fileHandling\\test.txt");
        File myfileOut = new File("C:\\Training\\src\\main\\java\\fileHandling\\testOut.txt");

       // Stream<String> lines = Files.lines(Paths.get(myfile))


    //    File myfile = new File("test2.txt");
        System.out.println(myfile);
        System.out.println( myfile.pathSeparator);
        System.out.println( myfile.getAbsoluteFile());
        System.out.println( myfile.getPath());


        try (
                BufferedReader bfr = new BufferedReader(new FileReader(myfile)) ;
                PrintWriter bwr = new PrintWriter(new FileWriter(myfileOut,true))
        ) {
            String line;
            while (( line = bfr.readLine()) != null) {
                System.out.println(line);
                // System.out.println(line.replaceFirst("th","tt"));
                //System.out.println(line.replaceFirst("th","tt"));
                System.out.println("print to ");
                bwr.println(line);
                bwr.flush();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

   }
}
