package homework1;

import java.util.Arrays;
import java.util.Random;

class Team {

    private final String commandName;
    private final String[] players;
    private String[] winners;
    public static Random rand = new Random();
    private boolean success;

    public Team(String commandName) {
        this.commandName = commandName;
        this.players = new String[] {"player1", "player2", "player3", "player4"};
        this.winners = new String[4];

    }

    public void getSuccess(int[] barriers) {
        int k = 0;
        for (int i = 0; i < this.players.length; i++) {
            this.success = true;
            for (k = 0; k < barriers.length; k++) {
                int j = rand.nextInt(100);
                if (j < barriers[k]) {
                    this.success = false;
                }
            }
            if (this.success == true) {
                this.winners[i] = "Win";
            } else {
                this.winners[i] = "Fail";
            }
        }
    }

    public void getPlayers() {
        for (int i = 0; i < this.players.length; i++) {
            System.out.println(players[i]);
        }
    }

    public void showResults() {

        System.out.println("Success players: \n");
        for (int i = 0; i < this.winners.length; i++) {
            System.out.printf("Player: %s    Result: %s \n", players[i], winners[i]);
        }
    }
}

class Course {
    private int[] barriers;
    public Course() {
        this.barriers = new int[] {1, 10, 8, 7, 3, 4, 6};
    }


    public void doIt(Team team) {
        team.getSuccess(this.barriers);

    }

}

public class HomeWork1 {
    public static void main(String[] args) {
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team("Command1"); // Создаем команду
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
