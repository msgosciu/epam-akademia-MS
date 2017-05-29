package models;

public class Board {
    private char BoardFillings[][];

    public Board(){
        this.BoardFillings = new char[3][3];

    }

    public void GetBoardFilligs(){
        System.out.print("|\t" + BoardFillings[0][0] + "\t|\t" + BoardFillings[0][1] + "\t|\t" + BoardFillings[0][2] + "\t|\n");
        System.out.print("|\t" + BoardFillings[1][0] + "\t|\t" + BoardFillings[1][1] + "\t|\t" + BoardFillings[1][2] + "\t|\n");
        System.out.print("|\t" + BoardFillings[2][0] + "\t|\t" + BoardFillings[2][1] + "\t|\t" + BoardFillings[2][2] + "\t|\n");
    }

    public void SetBoardFilling(int i, int j, char filling){
        this.BoardFillings[i][j] = filling;
    }


}
