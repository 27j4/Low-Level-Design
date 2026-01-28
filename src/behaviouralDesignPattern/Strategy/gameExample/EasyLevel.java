package behaviouralDesignPattern.Strategy.gameExample;

public class EasyLevel implements DifficultyLevelStrategy{
    @Override
    public void modifyGamesRules(){
        System.out.println("Get 6 Lives, Time is 30 min");
    }
}
