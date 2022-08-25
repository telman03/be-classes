package org.example;

import java.util.ArrayList;
import java.util.List;

public class SentenceApp1 {
    public static void main(String[] args) {
        List<String> subjects = List.of("Noel", "The cat", "The dog");
        List<String> verbs = List.of("wrote", "chased", "slept on");
        List<String> objects = List.of("the book", "the ball", "the bed");

        ArrayList<String> sentences = new ArrayList<>();
        for(String s: subjects){
            for (String v: verbs){
                for (String o: objects){

                    String sentence = String.format("%s %s %s\n", s, v, o);
                    sentences.add(sentence);
                }
            }
        }
        sentences.forEach(System.out::printf);
    }


}