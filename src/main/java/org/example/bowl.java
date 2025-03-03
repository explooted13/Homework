package org.example;

public class bowl {
    int fullness;
    public bowl(){
        this.fullness = 0;
    }
    public void addEat(int amount){
        this.fullness += amount;
    }
}
