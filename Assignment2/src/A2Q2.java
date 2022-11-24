/**
 * Name: Kaan KAYA
 * Student number: 218189415
 */
/**
 * EECS 2011 A, Fall 2022.
 * Assignment 2, Question 2 starter code.
 * Please read carefully the instructions in the assignment handout
 * and the starter code.
 */
import java.util.ArrayList;
// DO NOT ADD ANY package
// DO NOT ADD ANY import
/**
 * The A2Q2 class
 */
public class A2Q2 {

    /**
     * A class representing a single move in the TOH solution,
     * i.e., moving the disk at the top of fromPeg to the top of toPeg
     * Note: a move is invalid if it results in a larger disk being above a smaller disk.
     * DO NOT MODIFY THIS CLASS.
     */
    static class Move {

        private final int fromPeg;
        private final int toPeg;

        public Move(int from, int to) {
            this.fromPeg = from;
            this.toPeg = to;
        }

        public String toString() {
            return String.format("%d to %d", this.fromPeg, this.toPeg);
        }
    }

    /**
     * Return the sequence of moves that solves the 3-peg TOH problem with n disks.
     * Assumptions:
     * - The pegs are numbered 1, 2, 3
     * - The origin peg is 1.
     * - The destination peg is 2.
     * - n > 0
     */
    public static ArrayList<Move> threePegTOH(int n) {
    	
    
        // TODO: complete this method
        return threePegHelper(n, 1, 2, 3);
    }
    
    public static ArrayList<Move> threePegHelper(int i, int from_peg, int to_peg, int extra_peg){

	if(i == 1){
        System.out.println(from_peg + " to " + to_peg);
        
    }
    threePegHelper(i-1, from_peg, extra_peg, to_peg);
    System.out.println(from_peg + " to " + to_peg);
    threePegHelper(i-1, extra_peg, to_peg, from_peg);
    return null;
    }

    /**
     * Return the sequence of moves that solves the 4-peg TOH problem with n disks,
     * with the strategy described in the assignment handout
     * Assumptions:
     * - The pegs are numbered 1, 2, 3, 4
     * - The origin peg is 1.
     * - The destination peg is 2.
     * - n > 0
     */
    public static ArrayList<Move> fourPegTOH(int n) {

        // TODO: complete this method
        return null;
    }

    public static void main(String[] args) {

        System.out.println(threePegTOH(5));
        System.out.println(fourPegTOH(5));
    }
}
