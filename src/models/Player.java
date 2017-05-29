package models;


public class Player {
    private String name;
    private int wins;

    public Player(String name){
        this.name = name;
    }

    public String GetName(){
        return this.name;
    }

    public void ShowWins(){
        System.out.print(this.name + " has " + this.wins + " points.\n" );
    }

    public void IncreaseWins(){
        this.wins ++;
    }
    public void SetName(String name){
        this.name = name;
    }


}
