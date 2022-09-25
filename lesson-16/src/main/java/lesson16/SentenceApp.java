package lesson16;

import java.util.List;

public class SentenceApp {
  public static void main(String[] args) {
    List<String> subjects = List.of("Noel", "The cat", "The dog");
    List<String> verbs =    List.of("wrote", "chased", "slept on");
    List<String> objects =  List.of("the book","the ball","the bed");

    for (String s: subjects){
      for (String v: verbs){
        for(String o: objects){
          System.out.printf("%s, %s, %s\n", s, v, o);
        }
      }
    }

  }
}