import java.util.ArrayList;
import java.util.Scanner;

public class Team {
    private String name;
    private ArrayList<Player> players;
    private ArrayList<Match> matches;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.matches = new ArrayList<>();
    }

    // Thêm cầu thủ
    public void addPlayer(Player player) {
        // Kiểm tra số áo đã tồn tại
        for (Player p : players) {
            if (p.getJerseyNumber() == player.getJerseyNumber()) {
                System.out.println("Số áo " + player.getJerseyNumber() + " đã tồn tại. Không thể thêm cầu thủ.");
                return;
            }
        }
        players.add(player);
    }

    // Thêm trận đấu
    public void addMatch(Match match) {
        matches.add(match);
    }

    // Hiển thị danh sách cầu thủ
    public void listPlayers() {
        if (players.isEmpty()) {
            System.out.println("Danh sách cầu thủ trống.");
            return;
        }
        System.out.println("\n--- Danh Sách Cầu Thủ ---");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    // Hiển thị danh sách trận đấu
    public void listMatches() {
        if (matches.isEmpty()) {
            System.out.println("Danh sách trận đấu trống.");
            return;
        }
        System.out.println("\n--- Danh Sách Trận Đấu ---");
        for (Match match : matches) {
            System.out.println(match);
        }
    }

    // Hiển thị thống kê đội bóng
    public void showStatistics() {
        System.out.println("\n--- Thống Kê Đội Bóng ---");
        System.out.println("Tên đội: " + name);
        System.out.println("Số cầu thủ: " + players.size());
        System.out.println("Số trận đấu: " + matches.size());
        // Thêm các thống kê khác nếu cần
    }

    // Tìm kiếm cầu thủ theo tên
    public void searchPlayerByName(String name) {
        boolean found = false;
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                System.out.println(player);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cầu thủ có tên \"" + name + "\".");
        }
    }

    // Xóa cầu thủ theo số áo
    public void removePlayer(int jerseyNumber) {
        Player playerToRemove = null;
        for (Player player : players) {
            if (player.getJerseyNumber() == jerseyNumber) {
                playerToRemove = player;
                break;
            }
        }
        if (playerToRemove != null) {
            players.remove(playerToRemove);
            System.out.println("Đã xóa cầu thủ với số áo " + jerseyNumber + ".");
        } else {
            System.out.println("Không tìm thấy cầu thủ với số áo " + jerseyNumber + ".");
        }
    }

    // Cập nhật thông tin cầu thủ
    public void updatePlayerInfo(int jerseyNumber, Scanner scanner) {
        for (Player player : players) {
            if (player.getJerseyNumber() == jerseyNumber) {
                try {
                    System.out.print("Nhập tên mới (hiện tại: " + player.getName() + "): ");
                    String newName = scanner.nextLine();
                    if (!newName.trim().isEmpty()) {
                        player.setName(newName);
                    }

                    System.out.print("Nhập tuổi mới (hiện tại: " + player.getAge() + "): ");
                    String ageInput = scanner.nextLine();
                    if (!ageInput.trim().isEmpty()) {
                        int newAge = Integer.parseInt(ageInput);
                        if (newAge > 0) {
                            player.setAge(newAge);
                        } else {
                            System.out.println("Tuổi phải là số dương. Không cập nhật tuổi.");
                        }
                    }

                    System.out.print("Nhập vị trí mới (hiện tại: " + player.getPosition() + "): ");
                    String newPosition = scanner.nextLine();
                    if (!newPosition.trim().isEmpty()) {
                        player.setPosition(newPosition);
                    }

                    System.out.println("Đã cập nhật thông tin cầu thủ.");
                } catch (NumberFormatException e) {
                    System.out.println("Dữ liệu tuổi không hợp lệ. Không cập nhật tuổi.");
                }
                return;
            }
        }
        System.out.println("Không tìm thấy cầu thủ với số áo " + jerseyNumber + ".");
    }
}
