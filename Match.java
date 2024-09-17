import java.util.Date;

public class Match {
    private Date matchDate;       // Ngày thi đấu
    private String opponent;      // Đối thủ
    private int ourScore;         // Số bàn thắng của đội nhà
    private int opponentScore;    // Số bàn thắng của đối thủ

    // Constructor
    public Match(Date matchDate, String opponent, int ourScore, int opponentScore) {
        this.matchDate = matchDate;
        this.opponent = opponent;
        this.ourScore = ourScore;
        this.opponentScore = opponentScore;
    }

    // Getters
    public Date getMatchDate() {
        return matchDate;
    }

    public String getOpponent() {
        return opponent;
    }

    public int getOurScore() {
        return ourScore;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    // Phương thức in thông tin trận đấu dưới dạng chuỗi
    @Override
    public String toString() {
        return "Match{" +
                "date=" + matchDate +
                ", opponent='" + opponent + '\'' +
                ", ourScore=" + ourScore +
                ", opponentScore=" + opponentScore +
                '}';
    }
}
