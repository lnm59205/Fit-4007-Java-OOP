import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Tạo một đối tượng Team (đội bóng) với tên là "My Football Team"
        Team team = new Team("My Football Team");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        while (true) {
            System.out.println("1. Them cau thu");
            System.out.println("2. Them tran dau");
            System.out.println("3. Hien thi danh sach cau thu");
            System.out.println("4. Hien thi tran dau");
            System.out.println("5. Xem thong ke doi bong");
            System.out.println("6. Xoa cau thu");
            System.out.println("7. Tim kiem cau thu theo vi tri");
            System.out.println("8. Cap nhat thong tin cau thu");
            System.out.println("9. Hien thi lich su tran dau");
            System.out.println("10. Thoat");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đảm bảo không bỏ qua nhập tiếp theo

            switch (choice) {
                case 1:
                    // Thêm cầu thủ mới
                    addPlayer(team, scanner);
                    break;
                case 2:
                    // Thêm trận đấu mới
                    addMatch(team, scanner, dateFormat);
                    break;
                case 3:
                    // Hiển thị danh sách cầu thủ của đội
                    team.listPlayers();
                    break;
                case 4:
                    // Hiển thị danh sách các trận đấu của đội
                    team.listMatches();
                    break;
                case 5:
                    // Hiển thị thống kê của đội
                    team.showStatistics();
                    break;
                case 6:
                    // Xóa cầu thủ
                    System.out.print("Nhap ten cau thu can xoa: ");
                    String playerName = scanner.nextLine();
                    team.removePlayer(playerName);
                    break;
                case 7:
                    // Tìm kiếm cầu thủ theo vị trí
                    System.out.print("Nhap vi tri cau thu can tim: ");
                    String position = scanner.nextLine();
                    team.searchPlayerByPosition(position);
                    break;
                case 8:
                    // Cập nhật thông tin cầu thủ
                    System.out.print("Nhap ten cau thu can cap nhat: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Nhap vi tri moi: ");
                    String newPosition = scanner.nextLine();
                    System.out.print("Nhap tuoi moi: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Đảm bảo không bỏ qua nhập tiếp theo
                    team.updatePlayerInfo(updateName, newPosition, newAge);
                    break;
                case 9:
                    // Hiển thị lịch sử trận đấu
                    team.displayMatchHistory();
                    break;
                case 10:
                    // Thoát chương trình
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }

    // Hàm thêm cầu thủ mới
    public static void addPlayer(Team team, Scanner scanner) {
        System.out.print("Nhap ten cau thu: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi cau thu: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Đảm bảo không bỏ qua nhập tiếp theo
        System.out.print("Nhap vi tri choi: ");
        String position = scanner.nextLine();
        System.out.print("Nhap so ao: ");
        int jerseyNumber = scanner.nextInt();
        scanner.nextLine(); // Đảm bảo không bỏ qua nhập tiếp theo

        Player player = new Player(name, age, position, jerseyNumber);
        team.addPlayer(player);
        System.out.println("Da them cau thu.");
    }

    // Hàm thêm trận đấu mới
    public static void addMatch(Team team, Scanner scanner, SimpleDateFormat dateFormat) throws Exception {
        System.out.print("Nhap ngay thi dau (dd-MM-yyyy): ");
        String dateString = scanner.nextLine();
        Date matchDate = dateFormat.parse(dateString);

        System.out.print("Nhap ten doi thu: ");
        String opponent = scanner.nextLine();
        System.out.print("Nhap so ban thang doi nha: ");
        int ourScore = scanner.nextInt();
        System.out.print("Nhap so ban thang doi ban: ");
        int opponentScore = scanner.nextInt();
        scanner.nextLine(); // Đảm bảo không bỏ qua nhập tiếp theo

        Match match = new Match(matchDate, opponent, ourScore, opponentScore);
        team.addMatch(match);
        System.out.println("Da them tran dau.");
    }
}
//nguyễn văn tấn - 1771020616
