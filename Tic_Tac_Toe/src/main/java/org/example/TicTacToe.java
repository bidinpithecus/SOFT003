/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author Administrador
 */

package org.example;

import java.util.Scanner;

public class TicTacToe {
    private final Board board;
    private int turn = 1, who = 1, result = 0;
    private Player player1;
    private Player player2;
    public Scanner input = new Scanner(System.in);

    public TicTacToe(){
        board = new Board();
        board.setTie();
        startPlayers();
        
        while( Play() );
    }
    
    public void startPlayers() {
        System.out.println("Who will be player1 ?");
        if(choosePlayer() == 1)
            this.player1 = new Human(1);
        else
            this.player1 = new Computer(1);
        
        System.out.println("----------------------");
        System.out.println("Who will be Player 2 ?");
        
        if(choosePlayer() == 1) {
            this.player2 = new Human(2);
        } else {
            this.player2 = new Computer(2);
        }
    }
    
    public int choosePlayer() {
        int option = 0;

        do {
            System.out.println("1. Human");
            System.out.println("2. Computer\n");
            System.out.print("Option: ");
//            option = input.nextInt();
            option = 2;
            if(option != 1 && option != 2) {
                System.out.println("Invalid Option! Try again");
            }
        } while(option != 1 && option != 2);
        
        return option;
    }
    
    public boolean Play() {
        board.showBoard();
        result = won();
        if(result == 0) {
            System.out.println("----------------------");
            System.out.println("\nTurn " + turn);
            System.out.println("It's turn of Player " + who() );
            
            if(who() == 1) {
                player1.play(board);
            } else {
                player2.play(board);
            }

            if(board.fullBoard()) {
                System.out.println("Full Board. Tie!");
                result = 2;
                return false;
            }
            who++;
            turn++;

            return true;

        } else {
            if(result == -1 ) {
                System.out.println("Player 1 won!");
            } else {
                System.out.println("Player 2 won!");
            }
            return false;
        }
    }
    
    public int who() {
        if(who % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }
    
    public int won() {
        if(board.checkLines() == 1) {
            return 1;
        }
        if(board.checkColumns() == 1) {
            return 1;
        }
        if(board.checkDiagonals() == 1) {
            return 1;
        }
        if(board.checkLines() == -1) {
            return -1;
        }
        if(board.checkColumns() == -1) {
            return -1;
        }
        if(board.checkDiagonals() == -1) {
            return -1;
        }
        
        return 0;
    }

    public int getResult() {
        return result;
    }
    
    public static void main(String[] args) {
        new TicTacToe();
    }
}