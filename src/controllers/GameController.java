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

            System.out.println("Player: " +player1.GetName() +" using Coordinates X and then Y choose where to put X \n");
            int i,j;
            do{
                j = reader.nextInt();
                i = reader.nextInt();
            }while(board1.GetBoardFilling(i, j) == 'X' ||  board1.GetBoardFilling(i, j) == 'O');
                board1.SetBoardFilling(i, j, 'X');

            board1.GetBoardFilligs();

            System.out.println("Player: " +player2.GetName() +" using Coordinates X and then Y choose where to put O \n");
            do{
                j = reader.nextInt();
                i = reader.nextInt();
            }while(board1.GetBoardFilling(i, j) == 'X' ||  board1.GetBoardFilling(i, j) == 'O');
            board1.SetBoardFilling(i, j, 'O');

            board1.GetBoardFilligs();
            isWon(board1,player1,player2);
        }



    }

    public boolean isWon(Board board, Player player1, Player player2){
        for(int i=0; i<board.GetBoardWidth(); i++){
            if(board.GetBoardFilling(i,0) == board.GetBoardFilling(i,1) &&
                    board.GetBoardFilling(i,0) == board.GetBoardFilling(i,2) &&
                    board.GetBoardFilling(i,0) != 0){
                if(board.GetBoardFilling(i,0) == 'X'){
                    winner = player1;
                    player1.IncreaseWins();
                    System.out.println("Congratz for " + player1.GetName() + " \n");
                }else {
                    winner = player2;
                    player2.IncreaseWins();
                    System.out.println("Congratz for " + player2.GetName() + " \n");
                }
                return true;
            }else if(board.GetBoardFilling(0,i) == board.GetBoardFilling(1,i) &&
                    board.GetBoardFilling(0,i) == board.GetBoardFilling(2,i) &&
                    board.GetBoardFilling(0,i) != 0){
                if(board.GetBoardFilling(0,i) == 'X'){
                    winner = player1;
                    player1.IncreaseWins();
                    System.out.println("Congratz for " + player1.GetName() + " \n");
                }else {
                    winner = player2;
                    player2.IncreaseWins();
                    System.out.println("Congratz for " + player2.GetName() + " \n");
                }
                return true;
            }else if(board.GetBoardFilling(0,0) == board.GetBoardFilling(1,1) &&
                    board.GetBoardFilling(0,0) == board.GetBoardFilling(2,2) &&
                    board.GetBoardFilling(0,0) != 0){
                if(board.GetBoardFilling(0,0) == 'X'){
                    winner = player1;
                    player1.IncreaseWins();
                    System.out.println("Congratz for " + player1.GetName() + " \n");
                }else {
                    winner = player2;
                    player2.IncreaseWins();
                    System.out.println("Congratz for " + player2.GetName() + " \n");
                }
                return true;
            }else if(board.GetBoardFilling(0,2) == board.GetBoardFilling(2,0) &&
                    board.GetBoardFilling(0,2) == board.GetBoardFilling(1,1) &&
                    board.GetBoardFilling(0,2) != 0){
                if(board.GetBoardFilling(0,2) == 'X'){
                    winner = player1;
                    player1.IncreaseWins();
                    System.out.println("Congratz for " + player1.GetName() + " \n");
                }else {
                    winner = player2;
                    player2.IncreaseWins();
                    System.out.println("Congratz for " + player2.GetName() + " \n");
                }
                return true;
            }
        }
        return false;
    }


    public Player WhoFirst(Player player1, Player player2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who would like to start and obtain X ? \n Press 1) for " + player1.GetName() +
                " \n Press 2) for " + player2.GetName() +" \n");
        int i = scanner.nextInt();
        if(i == 1) {
            return player1;
        }else if(i == 2){
            return player2;
        }else{
            System.out.println("Wrong number, so it will be " +player1.GetName() +" \n");
            return player1;
        }
    }
}
