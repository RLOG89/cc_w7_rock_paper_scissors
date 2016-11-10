package com.example.user.rockpaperscissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by user on 09/11/2016.
 */

public class Game {

    private String move;
    protected ArrayList<String> mComputerMove;

    public Game(){
        mComputerMove = new ArrayList<String>();
        setUpComputerMoves();
    }

    public void setUpComputerMoves() {
        String[] moves = {
                "Rock",
                "Paper",
                "Scissors"
        };
        for (String move : moves) {
            add(move);
        }
    }

    public void add(String newMove) {
        mComputerMove.add(newMove);
    }

    public String getMove() {
        return this.move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public String computerMove() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(3);
        String randomMove = mComputerMove.get(randomIndex);
        return randomMove;

    }


    public String playGame(String move) {
        setMove(move);
        String turn = this.computerMove();
        String win =  "You played " + move + ", computer played " + turn + ", you win! Good job!";
        String draw = "You played " + move + ", computer played " + turn + ", you draw! Play again!";
        String lose = "You played " + move + ", computer played " + turn + ", you lose! Wah wah wahhhhhh!";

        if (this.move == turn) {return draw;}
        if (this.move == "Rock" && turn == "Scissors") {return win;}
        if (this.move == "Scissors" && turn == "Paper") {return win;}
        if (this.move == "Paper" && turn == "Rock") {return win;}
        else return lose;
    }
}