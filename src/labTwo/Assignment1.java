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
                 4. To list all players based on the amount of goals they have scored
                 5. To exit program
                 Enter value:""");
        Option = switchCase.nextInt();
        boolean keepAsking = !false;
        while (keepAsking) {
        switch (Option) {

                case 1:

                    System.out.println("Enter name of Player: ");
                    String name = sc.nextLine();

                    System.out.println("Enter name of Team: ");
                    String team = sc.nextLine();

                    System.out.print("Enter the players position: ");
                    String position = sc.nextLine();

                    System.out.print("Enter amount of goals scored by the player: ");
                    int scoredGoals = sc.nextInt();

                    System.out.print("Enter the amount of titles won by the player: ");
                    int titlesWon = sc.nextInt();

                    listOfPlayers.add(new Players(name, team, position, scoredGoals, titlesWon));
                    break;

                case 2:

                    System.out.print("Enter the name of the player you want to remove");
                    String removeName = sc.nextLine();
                    int num = -1;
                    for (int i = 0; i < listOfPlayers.size(); i++) {
                        if (listOfPlayers.get(i).getName().equals(removeName)) {
                            num = i;
                            break;
                        }
                    }
                    if (num >= 0) {
                        listOfPlayers.remove(num);
                        System.out.println("Player removed!");
                    } else {
                        System.out.println("Player not found!");
                    }


                case 3:
                    System.out.print("Enter player's name: ");
                    String searchName = sc.nextLine();
                    int index = -1;
                    for (int i = 0; i < listOfPlayers.size(); i++) {
                        if (listOfPlayers.get(i).getName().equals(searchName)) {
                            index = i;
                            break;
                        }
                    }
                    if (index >= 0) {
                        Players player = listOfPlayers.get(index);
                        System.out.println();
                        System.out.println("Name: " + player.getName());
                        System.out.println("Team: " + player.getTeam());
                        System.out.println("Position: " + player.getPosition());
                        System.out.println("Goals: " + player.getScoredGoals());
                        System.out.println("Titles won: " + player.getTitlesWon());
                    } else {
                        System.out.println("Player not found!");
                    }


                case 4:
                    listOfPlayers.sort((p1, p2) -> p2.getScoredGoals() - p1.getScoredGoals());
                    for (Players player : listOfPlayers) {
                        System.out.println("Name: " + player.getName());
                        System.out.println("Team: " + player.getTeam());
                        System.out.println("Position: " + player.getPosition());
                        System.out.println("Goals: " + player.getScoredGoals());
                        System.out.println("Titles won: " + player.getTitlesWon());
                        System.out.println();
                    }

                case 5:
                    break;
            }
        }
    }
}