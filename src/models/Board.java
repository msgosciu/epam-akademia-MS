package models;

public class Board {
    private char boardFillings[][];
    public int boardWidth;
    public int boardHeight;


    public Board(){
        this.boardHeight = 3;
        this.boardWidth = 3;
        this.boardFillings = new char[boardHeight][boardWidth];
    }

    public int GetBoardWidth(){
        return boardWidth;
    }

    public int GetBoardHeight(){
        return boardHeight;
    }
    public void GetBoardFilligs(){
        System.out.print("|\t" + boardFillings[0][0] + "\t|\t" + boardFillings[0][1] + "\t|\t" + boardFillings[0][2] + "\t|\n");
        System.out.print("|\t" + boardFillings[1][0] + "\t|\t" + boardFillings[1][1] + "\t|\t" + boardFillings[1][2] + "\t|\n");
        System.out.print("|\t" + boardFillings[2][0] + "\t|\t" + boardFillings[2][1] + "\t|\t" + boardFillings[2][2] + "\t|\n");
    }

    public char GetBoardFilling(int i, int j){
        if(i<0 | i>GetBoardHeight() | j<0 | j> GetBoardWidth()){
            System.out.println("Error, you reached boundaries.");
            return 0;
        }
        return boardFillings[i][j];
    }

    public void SetBoardFilling(int i, int j, char filling){
        this.boardFillings[i][j] = filling;
    }


}
