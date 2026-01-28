package behaviouralDesignPattern.Strategy.gameExample;

public class MediumLevel implements DifficultyLevelStrategy{
    @Override
    public void modifyGamesRules() {
        System.out.println("Get 4 Lives, Time is 20 min");
    }
}
