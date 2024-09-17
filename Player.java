public class Player {
    private String name;           // Tên cầu thủ
    private int age;               // Tuổi cầu thủ
    private String position;       // Vị trí chơi
    private int jerseyNumber;      // Số áo
    private int goals;             // Số bàn thắng

    // Constructor
    public Player(String name, int age, String position, int jerseyNumber) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.goals = 0; // Khởi tạo số bàn thắng là 0
    }

    // Getters và Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getGoals() {
        return goals;
    }

    public void addGoals(int goals) {
        this.goals += goals;
    }

    // Phương thức hiển thị thông tin cầu thủ dưới dạng chuỗi
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
