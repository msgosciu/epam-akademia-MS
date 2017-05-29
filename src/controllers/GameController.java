package controllers;
import models.*;

import java.util.Scanner;

public class GameController {
    private Board board1;
    private Player winner;

    public GameController(){}

    public void GameStart(Player player1, Player player2){
        Scanner reader = new Scanner(System.in);
        board1 = new Board();
        board1.GetBoardFilligs();
        while(winner==null)
        {

            System.out.println("Player 1, using Coordinates X/Y choose where to put X \n");
            int i,j;
            do{
                i = reader.nextInt();
                j = reader.nextInt();
            }while(board1.GetBoardFilling(i, j) == 'X' ||  board1.GetBoardFilling(i, j) == 'O');
                board1.SetBoardFilling(i, j, 'X');


            System.out.println("Player 2, using Coordinates X/Y choose where to put O \n");
            do{
                i = reader.nextInt();
                j = reader.nextInt();
            }while(board1.GetBoardFilling(i, j) == 'X' ||  board1.GetBoardFilling(i, j) == 'O');
            board1.SetBoardFilling(i, j, 'O');

            board1.GetBoardFilligs();
        }
    }


}
