import models.*;

public class TicTacToeMainClass {
    TicTacToeMainClass(){

    }




    public static void main(String [ ] args)
    {
        Board board1 = new Board();

        board1.SetBoardFilling(0,0,'X');
        board1.SetBoardFilling(0,1,'X');
        board1.SetBoardFilling(0,2,'X');
        board1.SetBoardFilling(1,1,'X');
        board1.GetBoardFilligs();
    }
}
