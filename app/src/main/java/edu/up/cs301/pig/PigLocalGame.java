package edu.up.cs301.pig;

import edu.up.cs301.game.GamePlayer;
import edu.up.cs301.game.LocalGame;
import edu.up.cs301.game.actionMsg.GameAction;

/**
 * class PigLocalGame controls the play of the game
 *
 * @author Andrew M. Nuxoll, modified by Steven R. Vegdahl
 * @version February 2016
 */
public class PigLocalGame extends LocalGame {

    private PigGameState PGS;

    /**
     * This ctor creates a new game state
     */
    public PigLocalGame(PigGameState state) {
        //TODO  You will implement this constructor
       this.PGS = state;
    }

    /**
     * can the player with the given id take an action right now?
     */
    @Override
    protected boolean canMove(int playerIdx) {
        //TODO  You will implement this method

        if(playerIdx == PGS.getPlayerID()){
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * This method is called when a new action arrives from a player
     *
     * @return true if the action was taken or false if the action was invalid/illegal.
     */
    @Override
    protected boolean makeMove(GameAction action) {
        //TODO  You will implement this method


     int tempTotal = PGS.getCurrentRun()+playerScore;
     int playerScore = PGS.getPlayerScore(PGS.getPlayerID());
        if(action instanceof PigHoldAction && action.getPlayer().equals(players[PGS.getPlayerID()])){
            PGS.setPlayerScore()
           return true;
        }else if(action instanceof PigRollAction && action.getPlayer().equals(players[PGS.getPlayerID()])){

            return true;
        }




        return false;
    }//makeMove

    /**
     * send the updated state to a given player
     */
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {
        //TODO  You will implement this method
    }//sendUpdatedSate

    /**
     * Check if the game is over
     *
     * @return
     * 		a message that tells who has won the game, or null if the
     * 		game is not over
     */
    @Override
    protected String checkIfGameOver() {
        //TODO  You will implement this method
        return null;
    }

}// class PigLocalGame
