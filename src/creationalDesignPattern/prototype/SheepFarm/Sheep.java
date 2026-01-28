package creationalDesignPattern.prototype.SheepFarm;

public interface Sheep{
    Sheep clone();
    void setName(String name);
    String getName();
}
