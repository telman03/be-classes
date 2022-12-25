package app.annot;

import app.annot.Comment;
import app.annot.Ripe;

@Ripe(level = 30, owner = "Jim")
@Comment(owner="Jim", comment = "bla-bla-bla")
public class Apple {
    public void eatMe(){
        System.out.println("I`m apple");
    }
}

