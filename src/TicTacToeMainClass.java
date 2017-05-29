import models.*;
import controllers.*;

import java.util.Scanner;

public class TicTacToeMainClass {
    TicTacToeMainClass(){

    }




    public static void main(String [ ] args)
    {
        int WannaPlay = 1;
        Scanner scanner = new Scanner(System.in);
        Player player1 = new Player("Tomasz");
        Player player2 = new Player("Adam");
        player1.ShowWins();
        player2.ShowWins();

        while(WannaPlay == 1) {
            GameController game1 = new GameController();
            if (game1.WhoFirst(player1, player2) == player1) {
                game1.GameStart(player1, player2);
            } else {
                game1.GameStart(player2, player1);
            }
            player1.ShowWins();
            player2.ShowWins();
            System.out.println("Do you want to play another game? \n press 1 for yes. \n");
            if(scanner.nextInt()!=1) WannaPlay=0;
        }

    }
}
