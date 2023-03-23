package labTwo;
import java.util.ArrayList;
import java.util.Scanner;

public class mainPlayers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Scanner switchCase = new Scanner(System.in);
        ArrayList<Players> listOfPlayers = new ArrayList<>();
        int Option;
        System.out.print("""
                Press:
                 1. To add player
                 2. To remove player
                 3. To search for a player
                 4. To list all playersbased on the amount of goals they have scored
                 5. To exit program
                 Enter value:""");
        Option = switchCase.nextInt();

        switch (Option){

            case 1:
                while(true) {
                    System.out.print("Enter name of Player: ");
                    String name = sc.nextLine();

                    System.out.print("Enter name of Team: ");
                    String team = sc.nextLine();

                    System.out.print("Enter the players position: ");
                    String position = sc.nextLine();

                    System.out.print("Enter amount of goals scored by the player: ");
                    int scoredGoals = sc.nextInt();

                    System.out.print("Enter the amount of titles won by the player: ");
                    int titlesWon = sc.nextInt();

                    listOfPlayers.add(new Players(name, team, position, scoredGoals, titlesWon));

                    System.out.print("add another player? Type yes or quit by typing " + "stop: " );
                    Scanner check = new Scanner(System.in);
                    String yesOrNo = check.nextLine();
                    if (yesOrNo.equalsIgnoreCase("stop")){
                        break;
                    }
                }
            case 2:
                while (true) {

                    System.out.print("Enter the name of the player you want to remove");
                    System.out.print("Enter the first name of the player: ");
                    String fName = sc.nextLine();
                    System.out.println("Enter the last name of the player: ");
                    String lName = sc.nextLine();

                    Players a = new Players();

                    System.out.print("remove another player? Type yes or quit by typing " + "stop: ");
                    Scanner check = new Scanner(System.in);
                    String yesOrNo = check.nextLine();
                    if (yesOrNo.equalsIgnoreCase("stop")) {
                        break;
                    }
                }

            case 3:

            case 4:


            case 5:
                break;

        }
    }

}