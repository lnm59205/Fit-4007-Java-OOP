import java.util.ArrayList;

public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private ArrayList<Match> matches;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void addMatch(Match match) {
        matches.add(match);
    }

    public void listPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players in the team.");
        } else {
            for (Player player : players) {
                System.out.println(player);
            }
        }
    }

    public void listMatches() {
        if (matches.isEmpty()) {
            System.out.println("No matches played.");
        } else {
            for (Match match : matches) {
                System.out.println(match);
            }
        }
    }

    public void showStatistics() {
        int totalGoals = 0;
        for (Player player : players) {
            totalGoals += player.getGoals(); // Assumes getGoals() is implemented in Player class
        }
        System.out.println("Total Goals: " + totalGoals);
        System.out.println("Total Matches Played: " + matches.size());
        // Add more statistics if needed
    }
}
