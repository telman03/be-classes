package lesson17.textfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFileApp1 {

  public static void main(String[] args) throws IOException {
    String fileName = "students.txt";
    File file = new File(fileName);
    BufferedWriter w = new BufferedWriter(new FileWriter(file, true));
    w.write("Jim");
    w.write("\n");
    w.write("Alex");
    w.write("\n");
    w.write("Sergio");
    w.flush(); // move data mem -> disk
    w.close(); // closing resource
  }

}
