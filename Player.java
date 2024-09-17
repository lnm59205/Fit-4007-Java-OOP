public class Player {
    private String name;
    private int age;
    private String position;
    private int jerseyNumber;
    private int goals; // Add a field for goals

    public Player(String name, int age, String position, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.goals = 0; // Initialize goals to 0
    }

    public int getGoals() {
        return goals;
    }

    public void addGoals(int goals) {
        this.goals += goals;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", goals=" + goals +
                '}';
    }
}
