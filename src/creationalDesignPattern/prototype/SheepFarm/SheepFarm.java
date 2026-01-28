import creationalDesignPattern.prototype.SheepFarm.BlackSheep;
import creationalDesignPattern.prototype.SheepFarm.Sheep;

void main(){

    Sheep blackSheepPrototype = new BlackSheep("baa baa");
    Sheep whiteSheepPrototype = new BlackSheep("Fleecy");

    Sheep cloneBlackSheepPrototype = blackSheepPrototype.clone();
    Sheep cloneWhiteSheepPrototype = whiteSheepPrototype.clone();

    cloneWhiteSheepPrototype.setName("Amit");
    cloneBlackSheepPrototype.setName("Arpit");

    System.out.println(blackSheepPrototype.toString());
    System.out.println(whiteSheepPrototype.toString());

    System.out.println(cloneBlackSheepPrototype.toString());
    System.out.println(cloneWhiteSheepPrototype.toString());

}