import java.util.Scanner;
public class Game {
    Player p1;
    Player p2;
    boolean gameDone;
    int turn;
    Scanner s;
    public Game(){
        p1 = new Player();
        p2 = new Player();
        gameDone = false;
        turn = 1;
        s = new Scanner(System.in);
    }

    public void play(){
       
        while(!gameDone){
            System.out.print("\033[2J");
            System.out.println("There are currently "+Board.getPieces()+" pieces.");
            if(turn == 1){
                System.out.println(p1.getName() + ", how many pieces would you like to remove?");
                System.out.println(p1.getName() + " removed " + getRemove() + " from the board.");
                turn = 2;
            }else if(turn == 2){
                System.out.println(p2.getName() + ", how many pieces would you like to remove?");
                System.out.println(p2.getName() + " removed " + getRemove() + " from the board.");
                turn = 1;
            }


        }
    }

    private int getRemove(){
        int remove = s.nextInt();
        while(!(remove > Board.getPieces()/2.0-1.0) && remove<Board.getPieces()){
            System.out.println("Please enter a vaild input.");
            remove = s.nextInt();
        }
        Board.removePieces(remove);
        return remove;
    }

    
}
