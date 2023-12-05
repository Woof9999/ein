import java.util.Scanner;
public class Player {
    String name;
    public Player(){
        Scanner s = new Scanner(System.in);
        System.out.println("What name would you like?");
        name = s.nextLine();
        System.out.println("Hello " + name + "!");
    }

    public Player(String name){
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return name;
    }
}
