
public class Board {
    private static int pieces;

    public static void populate(){
        pieces = (int)(41*Math.random() + 10.0);
    }

    public static void removePieces(int pieces){
        Board.pieces-=pieces;
    }

    public static int getPieces(){
        return pieces;
    }
}
