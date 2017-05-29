import models.*;
import controllers.*;

public class TicTacToeMainClass {
    TicTacToeMainClass(){

    }




    public static void main(String [ ] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();

        GameController game1 = new GameController();
        game1.GameStart(player1, player2);


    }
}
