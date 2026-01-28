import behaviouralDesignPattern.Strategy.gameExample.EasyLevel;
import behaviouralDesignPattern.Strategy.gameExample.Game;
import behaviouralDesignPattern.Strategy.gameExample.HardLevel;
import behaviouralDesignPattern.Strategy.gameExample.MediumLevel;

void main(){
    Game game = new Game(new EasyLevel());
    game.startGame();;

    game.setDifficultyLevelStrategy(new MediumLevel());
    game.startGame();

    game.setDifficultyLevelStrategy(new HardLevel());
    game.startGame();
}