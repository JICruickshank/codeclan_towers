public class Conference extends Room {

    private int cost;
    private String name;

    public Conference(int capacity, int number, int cost, String name) {
        super(capacity, number);
        this.cost = cost;
        this.name = name;
    }
}
