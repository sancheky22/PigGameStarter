package edu.up.cs301.pig;

import edu.up.cs301.game.infoMsg.GameState;

public class PigGameState extends GameState {

    private int playerID;
    private int player0Score;
    private int player1Score;
    private int currentRun;
    private int dieValue;

    public PigGameState(){
        this.playerID = 1;
        this.player0Score = 0;
        this.player1Score = 0;
        this.currentRun = 1;
        this.dieValue = 1;
    }

    public PigGameState(PigGameState original){
        this.playerID = original.getPlayerID();
        this.player0Score = original.getPlayer0Score();
        this.player1Score = original.getPlayer1Score();
        this.currentRun = original.getCurrentRun();
        this.dieValue = original.getDieValue();
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    public int getPlayerScore(int playerNum) {
        if (playerNum == 0) {
            return player0Score;
        } else {
            return player1Score;
        }
    }

    public void setPlayerScore(int playerScore, int playerNum) {
        if(playerNum==0){
            this.player0Score = this.getPlayerScore(0)+playerScore;
        }else{
            this.player1Score = this.getPlayerScore(1)+playerScore;
        }
    }


    public int getCurrentRun() {
        return currentRun;
    }

    public void setCurrentRun(int currentRun) {
        this.currentRun = currentRun;
    }

    public int getDieValue() {
        return dieValue;
    }

    public void setDieValue(int dieValue) {
        this.dieValue = dieValue;
    }

}
