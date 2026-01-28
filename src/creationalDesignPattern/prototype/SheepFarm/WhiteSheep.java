package creationalDesignPattern.prototype.SheepFarm;

public class WhiteSheep implements Sheep{


    String name;

    WhiteSheep(String name){
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new WhiteSheep(name);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "WhiteSheep{" +
                "name='" + name + '\'' +
                "className='" + this.getClass().getSimpleName() + '\'' +
                '}';
    }
}
