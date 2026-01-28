package behaviouralDesignPattern.Strategy.gameExample;

public class HardLevel implements DifficultyLevelStrategy {
    @Override
    public void modifyGamesRules() {
        System.out.println("Get 3 Lives, Time is 15 min");
    }
}
