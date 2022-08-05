package task;


import java.util.*;

/**
 * String origin = "Hello, my dear friend, please keep learning,
            I'll guarantee you'll reach the moment you understand everything"
 * */


public class CharacterPositions {
    public Map<Character, List<Integer>> doCount(String origin){
        HashMap<Character, List<Integer>> counter = new HashMap<>();
        for (int i = 0; i < origin.length(); i++) {
            char c = origin.charAt(i);

            List<Integer> positions = counter.getOrDefault(c, new ArrayList<>());
            positions.add(i + 1);
            counter.put(c, positions);
        }
        return counter;
    }

    public static void main(String[] args) {
        CharacterPositions app =  new CharacterPositions();
        String line = "Hello, my dear friend, please keep learning, " +
                "I'll guarantee you'll reach the moment you understand everything";
        Map<Character, List<Integer>> outcome = app.doCount(line);
        System.out.println(outcome);
    }
}