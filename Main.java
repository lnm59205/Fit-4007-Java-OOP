import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Team team = new Team("My Football Team");
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        while (true) {
            System.out.println("1. Them cau thu");
            System.out.println("2. Them tran dau");
            System.out.println("3. Hien thi danh sach cau thu");
            System.out.println("4. Hien thi tran dau");
            System.out.println("5. Xem thong ke doi bong");
            System.out.println("6. Thoat");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten cau thu: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap tuoi cau thu: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Nhap vi tri choi: ");
                    String position = scanner.nextLine();
                    System.out.print("Nhap so ao: ");
                    int jerseyNumber = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Player player = new Player(name, age, position, jerseyNumber);
                    team.addPlayer(player);
                    System.out.println("Da them cau thu.");
                    break;
                case 2:
                    System.out.print("Nhap ngay thi dau (dd-MM-yyyy): ");
                    String dateString = scanner.nextLine();
                    Date matchDate = dateFormat.parse(dateString);

                    System.out.print("Nhap ten doi thu: ");
                    String opponent = scanner.nextLine();
                    System.out.print("Nhap so ban thang doi nha: ");
                    int ourScore = scanner.nextInt();
                    System.out.print("Nhap so ban thang doi ban: ");
                    int opponentScore = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    Match match = new Match(matchDate, opponent, ourScore, opponentScore);
                    team.addMatch(match);
                    System.out.println("Da them tran dau.");
                    break;
                case 3:
                    team.listPlayers();
                    break;
                case 4:
                    team.listMatches();
                    break;
                case 5:
                    team.showStatistics();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh.");
                    return;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
