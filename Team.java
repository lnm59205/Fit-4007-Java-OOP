import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamName;
    private List<Player> players;
    private List<Match> matches;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Thêm cầu thủ mới vào đội
    public void addPlayer(Player player) {
        players.add(player);
    }

    // Thêm trận đấu mới vào danh sách trận đấu
    public void addMatch(Match match) {
        matches.add(match);
    }

    // Hiển thị danh sách cầu thủ của đội
    public void listPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players in the team.");
        } else {
            for (Player player : players) {
                System.out.println(player);
            }
        }
    }

    // Hiển thị danh sách các trận đấu
    public void listMatches() {
        if (matches.isEmpty()) {
            System.out.println("No matches played.");
        } else {
            for (Match match : matches) {
                System.out.println(match);
            }
        }
    }

    // Xóa cầu thủ khỏi đội
    public void removePlayer(String playerName) {
        boolean found = false;
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                players.remove(player);
                System.out.println("Player removed: " + playerName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Player not found: " + playerName);
        }
    }

    // Tìm kiếm cầu thủ theo vị trí
    public void searchPlayerByPosition(String position) {
        boolean found = false;
        for (Player player : players) {
            if (player.getPosition().equalsIgnoreCase(position)) {
                System.out.println(player);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No players found for position: " + position);
        }
    }

    // Cập nhật thông tin cầu thủ
    public void updatePlayerInfo(String playerName, String newPosition, int newAge) {
        boolean found = false;
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                player.setPosition(newPosition);
                player.setAge(newAge);
                System.out.println("Player info updated: " + playerName);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Player not found: " + playerName);
        }
    }

    // Hiển thị lịch sử trận đấu
    public void displayMatchHistory() {
        if (matches.isEmpty()) {
            System.out.println("No match history.");
        } else {
            for (Match match : matches) {
                System.out.println("Match on: " + match.getMatchDate() +
                        " - Opponent: " + match.getOpponent() +
                        " - Score: " + match.getOurScore() + " - " + match.getOpponentScore());
            }
        }
    }

    // Hiển thị thống kê đội bóng
    public void showStatistics() {
        int wins = 0;
        int draws = 0;
        int losses = 0;
        int totalGoals = 0;
        for (Match match : matches) {
            if (match.getOurScore() > match.getOpponentScore()) {
                wins++;
            } else if (match.getOurScore() == match.getOpponentScore()) {
                draws++;
            } else {
                losses++;
            }
        }
        for (Player player : players) {
            totalGoals += player.getGoals(); // Assumes getGoals() is implemented in Player class
        }
        System.out.println("Total Wins: " + wins);
        System.out.println("Total Draws: " + draws);
        System.out.println("Total Losses: " + losses);
        System.out.println("Total Goals: " + totalGoals);
        System.out.println("Total Matches Played: " + matches.size());
    }
}
