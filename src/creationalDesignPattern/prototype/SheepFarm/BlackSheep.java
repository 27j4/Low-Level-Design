package creationalDesignPattern.prototype.SheepFarm;

public class BlackSheep implements Sheep{

    String name;

    public BlackSheep(String name){
        this.name = name;
    }

    @Override
    public Sheep clone() {
        return new BlackSheep(this.name);
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
        return "BlackSheep{" +
                "name='" + name + '\'' +
                "className='" + this.getClass().getSimpleName() + '\'' +
                '}';
    }
}
