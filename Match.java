import java.util.Date;

public class Match {
    private Date matchDate;
    private String opponent;
    private int ourScore;
    private int opponentScore;

    public Match(Date matchDate, String opponent, int ourScore, int opponentScore) {
        this.matchDate = matchDate;
        this.opponent = opponent;
        this.ourScore = ourScore;
        this.opponentScore = opponentScore;
    }

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
