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
            isWon(board1,player1,player2);
        }



    }

    public boolean isWon(Board board, Player player1, Player player2){
        for(int i=0; i<board.GetBoardWidth(); i++){
            if(board.GetBoardFilling(i,0) == board.GetBoardFilling(i,1) &&
                    board.GetBoardFilling(i,0) == board.GetBoardFilling(i,2)){
                if(board.GetBoardFilling(i,0) == 'X'){
                    winner = player1;
                    System.out.println("Congratz for player1 \n");
                }else {
                    winner = player2;
                    System.out.println("Congratz for player2 \n");
                }
                return true;
            }else if(board.GetBoardFilling(0,i) == board.GetBoardFilling(1,i) &&
                    board.GetBoardFilling(0,i) == board.GetBoardFilling(2,i) &&
                    board.GetBoardFilling(0,i) != 0){
                if(board.GetBoardFilling(0,i) == 'X'){
                    winner = player1;
                    System.out.println("Congratz for player1 \n");
                }else {
                    winner = player2;
                    System.out.println("Congratz for player2 \n");
                }
                return true;
            }else if(board.GetBoardFilling(0,0) == board.GetBoardFilling(1,1) &&
                    board.GetBoardFilling(0,0) == board.GetBoardFilling(2,2) &&
                    board.GetBoardFilling(0,0) != 0){
                if(board.GetBoardFilling(0,0) == 'X'){
                    winner = player1;
                    System.out.println("Congratz for player1 \n");
                }else {
                    winner = player2;
                    System.out.println("Congratz for player2 \n");
                }
                return true;
            }else if(board.GetBoardFilling(0,2) == board.GetBoardFilling(2,0) &&
                    board.GetBoardFilling(0,2) == board.GetBoardFilling(1,1) &&
                    board.GetBoardFilling(0,2) != 0){
                if(board.GetBoardFilling(0,2) == 'X'){
                    winner = player1;
                    System.out.println("Congratz for player1 \n");
                }else {
                    winner = player2;
                    System.out.println("Congratz for player2 \n");
                }
                return true;
            }
        }
        return false;
    }

}
