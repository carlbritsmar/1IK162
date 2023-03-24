package labTwo;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Assignment1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Players> listOfPlayers = new ArrayList<>();



        while (true) {
            System.out.print("""
                Press:
                 1. To add player
                 2. To remove player
                 3. To search for a player
                 4. To list all players based on the amount of goals they have scored
                 5. To exit program
                 Enter value:""");
           int Option = sc.nextInt();

                if (Option == 1) {

                    System.out.println("Enter name of Player: ");
                    String name = sc.next();

                    System.out.println("Enter name of Team: ");
                    String team = sc.next();

                    System.out.print("Enter the players position: ");
                    String position = sc.next();

                    System.out.print("Enter amount of goals scored by the player: ");
                    int scoredGoals = sc.nextInt();

                    System.out.print("Enter the amount of titles won by the player: ");
                    int titlesWon = sc.nextInt();

                    Players p1 = new Players(name, team, position, scoredGoals, titlesWon);
                    listOfPlayers.add(p1);
                }
                else if (Option == 2) {
                    System.out.print("Enter the name of the player you want to remove: ");
                    String removeName = sc.next();
                    Iterator<Players> iterator = listOfPlayers.iterator();
                    while (iterator.hasNext()) {
                        Players player = iterator.next();
                        if (player.getName().equals(removeName)) {
                            iterator.remove();
                            System.out.println("Player removed successfully.");
                            break;
                        }
                    }
                }

        else if (Option == 3) {
                    System.out.print("Enter player's name: ");
                    String searchName = sc.next();
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
                }

                else if (Option == 4) {
                    listOfPlayers.sort((p1, p2) -> p2.getScoredGoals() - p1.getScoredGoals());
                    for (Players player : listOfPlayers) {
                        System.out.println("Name: " + player.getName());
                        System.out.println("Team: " + player.getTeam());
                        System.out.println("Position: " + player.getPosition());
                        System.out.println("Goals: " + player.getScoredGoals());
                        System.out.println("Titles won: " + player.getTitlesWon());
                        System.out.println();
                    }
                }

                else if (Option == 5) {
                    break;
                }

        }
    }
}

