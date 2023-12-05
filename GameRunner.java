/**
 * Project 2.5.11
 *
 * GameRunner Class for the Game of Nim
 */
import java.util.Scanner;
public class GameRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = "";
        System.out.print("\033[2J");
        System.out.println("Welcome to the Game of Nim!");
        System.out.println("Enter any key to continue...");
        input=s.nextLine();
        System.out.print("\033[2J");
        
        Board.populate();

        Game nim = new Game();
        nim.play();

    }
}