package app;


import app.annot.Ripe;

@Ripe(level = 80, owner = "Alex")
public class Banana {
    public void eatMe(){
        System.out.println("I`m banana");
    }
}