import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------");
        System.out.println("|                  |");
        System.out.println("|                   ");
        System.out.println("|         O         ");
        System.out.println("|                   ");
        System.out.println("|                  |");
        System.out.println("--------------------");
        System.out.println("ROOM: TestRoom");
        System.out.println("DESCRIPTION: A simple room to serve as a test");
        System.out.println("OPTIONS: 1. Move");
        if (input.nextLine().toLowerCase().equals("move")) {
            System.out.print("Which direction? (E): "); // the list will display N/S/E/W if all options are available
            if (input.nextLine().toLowerCase().equals("e")) {
                System.out.println("COMPLETED");
                System.exit(0);
            }
        }
        System.out.println("Invalid. Exiting program.");
    }
}
