package lesson17.textfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFileApp2 {

  public static void main(String[] args) throws IOException {
    String fileName = "students.txt";
    File file = new File(fileName);
    try (BufferedReader r = new BufferedReader(new FileReader(file))){
      String line;
      while ((line = r.readLine()) != null) {
        System.out.printf("line read: %s\n", line);
      }
    }
  }

}
