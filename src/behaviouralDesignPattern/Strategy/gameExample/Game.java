package behaviouralDesignPattern.Strategy.gameExample;

public class Game {
    DifficultyLevelStrategy difficultyLevelStrategy;
    public Game(DifficultyLevelStrategy difficultyLevelStrategy){
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void setDifficultyLevelStrategy(DifficultyLevelStrategy difficultyLevelStrategy){
        this.difficultyLevelStrategy = difficultyLevelStrategy;
    }

    public void startGame(){
        difficultyLevelStrategy.modifyGamesRules();
    }
}
